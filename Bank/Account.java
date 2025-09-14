package Bank;
public class Account {

private String accountPass;
private int balance;
private String accountHolder;

public Account(String accountHolder , String accountPass, int balance ) {
this.accountHolder = accountHolder;
this.balance = balance;
this.accountPass = accountPass;
}
protected int getBalance() { return balance;  }

protected String getAccountholder() { return accountHolder;  }

boolean passwordVerify(String input) { return accountPass.equals(input); }

protected void updateAccountPass(String newPass) { this.accountPass = newPass; }
protected void updateAccountHolder(String newName) {this.accountHolder = newName; }

int deposit (int balanceAdd) {
    if (balanceAdd > 0) return balance += balanceAdd;
    throw new IllegalArgumentException("Deposit amount must be positive");
}

int withdraw (int balanceMin) {
    if (balance >= balanceMin && balanceMin > 0) return balance -= balanceMin;
     throw new IllegalStateException("Insufficient funds");
}}

