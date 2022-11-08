package dao;

import bll.User;
import java.awt.Color;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import view.Main;

/**
 *
 * @author dhanb
 */


public class UserDaoImp implements UserDao {

    public String loggedEmail = "";
    public String loggedFullName = "";

    
    // user login
    @Override
    public boolean LoginUser(JTextField[] field, String role) {
        User user = new User();
        user.setEmail(field[0].getText());
        user.setPassword(field[1].getText());
        String[][] data = readFile("user_details");

        boolean flag = false;
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (user.getEmail().equals(data[i][2]) && user.getPassword().equals(data[i][3]) && role.equals(data[i][5])) {
                    loggedEmail = data[i][2];
                    loggedFullName = data[i][1];
                    flag = true;
                    break;
                }
            }
        }
        return flag;
    }

    @Override
    public void SendRequest(String email, String mobile, String productType, double weight, String description, String cAddress, String dAddress) {
        String status = "pending";
        LocalDate cdate = LocalDate.now();
        String uuid = uniqueID("U");
        String amount = "null";
        String[] request = {String.valueOf(cdate), uuid, email, mobile, productType, String.valueOf(weight), description, dAddress, cAddress, amount, status};
        addRecord("user_requests", request, true);
    }

    // file handling
    @Override
    public String[] addRecord(String filename, String[] data, boolean append) {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("./src/data/" + filename + ".txt", append));
            for (int a = 0; a < data.length; a++) {
                data[a] = data[a] + ",";
            }
            if (data[data.length - 1].endsWith(",")) {
                data[data.length - 1] = data[data.length - 1].substring(0, data[data.length - 1].length() - 1) + "\n";
            }
            for (String i : data) {
                bw.write(i);
            }
            bw.flush();
            bw.close();
        } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "Something went wrong.");
            System.out.println(e);

        }
        return null;
    }

    // delete record
    public void deleteRecord(String filepath) {
        File oldfile = new File(filepath);
        oldfile.delete();
    }

    
    // remove record
    @Override
    public boolean RemoveRecord(String id, int idIndex, String filepath, String tempFile) {
        try {
            String currentLine;
            String data[];
            FileReader fr = new FileReader(filepath);
            BufferedReader br = new BufferedReader(fr);

            FileWriter fw = new FileWriter(tempFile);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);

            while ((currentLine = br.readLine()) != null) {
                data = currentLine.split(",");
                if (!(data[idIndex].equalsIgnoreCase(id))) {
                    pw.println(currentLine);
                }
                pw.flush();
                bw.flush();
                fw.flush();
            }
            br.close();
            fr.close();

            pw.close();
            bw.close();
            fw.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return true;
    }

    // admin function
    // add normal user
    public void AddUser(String dpid, String fullname, String email, String password, String mobile) {
        String[] data = {dpid, fullname, email, password, mobile};
        addRecord("user_details", data, true);
    }

    // most used function
    //confirming log out
    public void logoutDialog(JFrame jp) {
        int confirmed = JOptionPane.showConfirmDialog(null, "Do you want to Quit?", "Quit", JOptionPane.YES_NO_OPTION);
        if (confirmed == JOptionPane.YES_OPTION) {
            jp.dispose();
            new Main().setVisible(true);
        }
    }

    // return unique id
    public String uniqueID(String prefix) {
        UUID uuid = UUID.randomUUID();
        String[] arr = uuid.toString().split("-");
        String id = prefix + arr[arr.length - 1].substring(0, 6);
        return id;
    }
    
    
    // file handling
    @Override
    public String[][] readFile(String filename) {
        try {
            BufferedReader br = new BufferedReader(new FileReader("./src/data/" + filename + ".txt"));
            String item;
            ArrayList<String[]> li = new ArrayList<>();
            while ((item = br.readLine()) != null) {
                li.add(item.split(","));
            }
            String[][] data = new String[li.size()][];
            li.toArray(data);
            System.out.println(data);
            return data;

        } catch (FileNotFoundException ex) {
        } catch (IOException ex) {
            Logger.getLogger(UserDaoImp.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

    // display users record from text file to table
    public void viewRecord(DefaultTableModel table, String fileName, Integer[] index) {
        table.setRowCount(0);
        String[][] data;
        data = readFile(fileName);
        for (String[] data1 : data) {

            String[] row = new String[data1.length];

            for (int i = 0; i < data1.length; i++) {

                for (int j = 0; j < index.length; j++) {
                    if (i == j) {
                        row[i] = data1[index[j]];
                    }
                }
            }
            table.addRow(row);
        }
    }
    
    //most used function : utitity function

    // check if user is already available
    public boolean checkUser(String fileName, String email) {
        String[][] data;
        data = readFile(fileName);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (email.equals(data[i][2])) {
                    return true;
                }
            }
        }
        return false;
    }

    // return first name of user
    public String findUserName(String fileName, String email) {
        String[][] data;
        UserDaoImp d = new UserDaoImp();
        data = d.readFile(fileName);
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data[i].length; j++) {
                if (email.equals(data[i][2])) {
                    return data[i][1].split(" ")[0];
                }
            }
        }
        return null;
    }

    // check if text fields are empty
    public boolean formValidation(JTextField[] textFields) {
        for (JTextField field : textFields) {
            if (field.getText().trim().isEmpty()) {
                return true;
            }
        }
        return false;
    }

    // clear emptied text fields
    public void clearFields(JTextField[] textFields) {
        for (JTextField field : textFields) {
            field.setText("");
        }
    }

    
    // hoverable effect
    public void setColor(JPanel p) {
        p.setBackground(new Color(133, 185, 241));
    }

    public void resetColor(JPanel p1) {
        p1.setBackground(new Color(255, 255, 255));
    }

    public void setColor1(JPanel p2) {
        p2.setBackground(new Color(204, 255, 102));
    }
}
