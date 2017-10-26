package user;

import accounts.Account;
import factorywarehouse.AccountFactory;

import java.util.ArrayList;

public class User {

    private String userName;
    private int idNumber;
    private ArrayList<Account> accounts = new ArrayList<Account>();

    public User(String userName, int idNumber) {
        this.userName = userName;
        this.idNumber = idNumber;
    }

    public String getUserName() {
        return userName;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public ArrayList<Account> getAccounts() {
        return accounts;
    }

    public void addNewAccount(Account accountToAdd) {
        accounts.add(accountToAdd);
    }

    public String printUserAccounts() {
        String userAccounts = "";
        System.out.println(accounts);
        for (Account account: accounts) {
            String accountType = account.getAccountType();
            double balance = account.getBalance();

            //System.out.println(balance);

            userAccounts += "-----------------------\n";//23
            userAccounts += "Account type = " + accountType + "\n";
            userAccounts += "Account balance = " + balance + "\n";
        }
        return userAccounts;
    }




}
