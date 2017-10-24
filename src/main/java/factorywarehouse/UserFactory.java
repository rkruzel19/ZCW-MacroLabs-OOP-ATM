package factorywarehouse;

import inputoutput.Display;
import user.User;

import java.util.ArrayList;

public class UserFactory {

    private UserFactory() {

    }

    public static User createUser() {
        String userName = Display.userInput("Enter user name");
        User user = new User(userName, UserWarehouse.getWarehouseSize());
        UserWarehouse.addToWarehouse(user);
        //public void toString() {
        //System.out.println(user.user);

        return user;
    }

}
