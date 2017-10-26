import accounts.Account;
import org.junit.Assert;
import org.junit.Test;
import user.User;

import java.util.ArrayList;

public class UserTests {


    @Test
    public void getUserNameTest() {
        //: Given
        String expected = "rob";
        User user = new User(expected, 0);


        //: When
        String actual = user.getUserName();

        //: Then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getIdNumberTest() {
        User user = new User("rob", 1);
        int expected = 1;

        int actual = user.getIdNumber();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void getAccountsTest() {
        User user = new User("rob", 2);
        Account account = new Account("Checking", 400.0);
        String expected = " ";

        user.addNewAccount(account);
        ArrayList<Account> actual = user.getAccounts();

        Assert.assertEquals(expected, actual);
    }

    @Test
    public void addNewAccountTest() {
        User user = new User("rob", 2);
        Account account = new Account("Checking", 300.0);
        Account expected = account;


        user.addNewAccount(account);
        Account actual = user.getAccounts().get(0);

        Assert.assertEquals(expected, actual);

    }

    @Test
    public void printUserAccountsTest1Account() {
        User user = new User("rob", 1);
        Account account = new Account("Savings", 500.0);
        String expected = "-----------------------\n" +
                          "Account type = Savings\n" +
                          "Account balance = 500.0";

        user.addNewAccount(account);
        String actual = user.printUserAccounts();


        Assert.assertEquals(expected, actual);
    }

    @Test
    public void printUserAccountsTest3Accounts() {
        User user = new User("moose", 2);
        Account account1 = new Account("Savings", 100.0);
        Account account2 = new Account("Checking", 400.0);
        Account account3 = new Account("Savings", 30.0);

        String expected = "-----------------------\n" +
                "Account type = Savings\n" +
                "Account balance = 100.0\n" +
                "-----------------------\n" +
                "Account type = Checking\n" +
                "Account balance = 400.0\n" +
                "-----------------------\n" +
                "Account type = Savings\n" +
                "Account balance = 30.0";

        user.addNewAccount(account1);
        user.addNewAccount(account2);
        user.addNewAccount(account3);

        String actual = user.printUserAccounts().trim();

        Assert.assertEquals(expected, actual);


    }

}
/*

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public ArrayList<Account> addNewAccount(Account accountToAdd) {
        accounts.add(accountToAdd);
    }
 */