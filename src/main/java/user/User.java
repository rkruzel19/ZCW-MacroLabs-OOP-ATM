package user;

public class User {

    protected String userName;
    protected int idNumber;

    public User(String userName, int idNumber) {
        this.userName = userName;
        this.idNumber = idNumber;
    }

    protected String getUserName() {
        return userName;
    }

    protected int getIdNumber() {
        return idNumber;
    }


}
