package factorywarehouse;

import accounts.Account;
import inputoutput.Display;

public class AccountFactory {

    private AccountFactory() {

    }

    public static Account createAccount() {
        String accountType = Display.userInput("Would you like a Checking, Savings, or Investment account? (c/s/i)");
        while (!(accountType.equalsIgnoreCase("c") || accountType.equalsIgnoreCase("s") || accountType.equalsIgnoreCase("i"))) {
            accountType = Display.userInput("Would you like a Checking, Savings, or Investment account? (c/s/i)");
        }
        Account account = new Account(accountType, 0);
        return account;
    }


}
