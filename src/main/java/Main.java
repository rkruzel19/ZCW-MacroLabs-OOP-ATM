import factorywarehouse.AccountFactory;
import factorywarehouse.UserFactory;
import factorywarehouse.UserWarehouse;
import inputoutput.Display;
import user.User;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class Main {

    public static void main(String[] args){
        Display.welcomeMessage();

        User user = UserFactory.createUser();
        user.addNewAccount(AccountFactory.createAccount());

        System.out.println(user.printUserAccounts());

    }
}




