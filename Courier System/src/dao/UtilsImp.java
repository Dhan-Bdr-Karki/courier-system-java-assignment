package dao;

public class UtilsImp extends UserDaoImp {
    public void RegisterUser(String[] data) {
        addRecord("user_details", data, true);
    }
}

