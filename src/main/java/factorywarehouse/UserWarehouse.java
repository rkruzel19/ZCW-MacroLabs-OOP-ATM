package factorywarehouse;

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

    public static void addToWarehouse(User userToAdd) {
        users.add(userToAdd);
    }

    public static void printArrayList() {
        for (User obj:users) {
            System.out.println(obj.userName + " " + obj.idNumber);
        }
    }

}
