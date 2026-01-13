package domain;

public class Account {
    private long accountNumber;
    private String accountName;
    private double balance;
    private String customerID;
    private String accountType;

    public Account(long accountNumber, String accountName, double balance, String customerID, String accountType) {
        this.accountNumber = accountNumber;
        this.accountName = accountName;
        this.balance = balance;
        this.customerID = customerID;
        this.accountType =accountType;

    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public double getBalance() {
        return balance;
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getAccountType() {
        return accountType;
    }
    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void setCustomerID(String customerID) {
        this.customerID = customerID;
    }
}
