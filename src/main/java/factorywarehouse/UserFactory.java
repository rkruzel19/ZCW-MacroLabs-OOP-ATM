package factorywarehouse;

import inputoutput.Display;
import user.User;

import java.util.ArrayList;

public class UserFactory {

    private UserFactory() {

    }

    public static User createUser() {
        String userName = Display.userInput("Enter user name");
        return createUser(userName);
    }

    public static User createUser(String userName) {
        User user = new User(userName, UserWarehouse.getWarehouseSize());
        UserWarehouse.addUserToWarehouse(user);

        return user;
    }
}
