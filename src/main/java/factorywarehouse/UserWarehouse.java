package factorywarehouse;

import accounts.Account;
import inputoutput.Display;
import user.User;

import java.util.ArrayList;

public class UserWarehouse {
    private static ArrayList<User> users = new ArrayList<User>();

    private UserWarehouse() {

    }

    public static int getWarehouseSize() {
        return users.size();
    }

    public static void addUserToWarehouse(User userToAdd) {
        users.add(userToAdd);
    }

    public static void printWarehouse() {
        for (User user : users) {
            String userName = user.getUserName();
            int userIdNumber = user.getIdNumber();
            ArrayList<Account> accounts = user.getAccounts();
            System.out.println("----------------------------------");
            System.out.println("User name = " + userName);
            System.out.println("User id number = " + userIdNumber);
            System.out.println("User accounts = " + accounts);
        }
    }

    public static boolean hasUser(User user) {
        return users.contains(user);
    }
}
