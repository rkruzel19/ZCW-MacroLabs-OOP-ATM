package accounts;

import user.User;

import java.util.ArrayList;

public class Account {

    public String accountType;
    public double balance;

    public Account(String accountType, double balance) {
        this.accountType = accountType;
        this.balance = balance;
    }

    public String getAccountType() {
        return accountType;
    }

    public double getBalance() {
        return balance;
    }


}
