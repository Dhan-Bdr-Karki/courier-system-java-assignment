/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

/**
 *
 * @author dhanb
 */

public class HandleUser {
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
    
}
