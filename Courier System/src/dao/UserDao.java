package dao;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public interface UserDao {
    public boolean LoginUser(JTextField[] field, String role);

    void SendRequest(String email, String mobile, String productType, double weight, String description, String cAddress, String dAddress);
    void logoutDialog(JFrame jp);
    // file handling
    String[] addRecord(String filename, String[] data, boolean append);

    void deleteRecord(String filepath);

    String[][] readFile(String filename);

    boolean RemoveRecord(String id, int idIndex, String filepath, String tempFile);

    // admin function
    void AddUser(String dpid, String fullname, String email, String password, String mobile);

    // utility function
    String uniqueID(String prefix);

    void viewRecord(DefaultTableModel table, String fileName, Integer[] index);

    boolean formValidation(JTextField[] textFields);

    void clearFields(JTextField[] textFields);

}
