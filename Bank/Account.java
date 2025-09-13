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
protected int getBalance() {
    return balance;    }
public String getAccountholder() {
    return accountHolder;  }
boolean AccountVerify(String input) {
if (accountPass.equals(input)) return true;  
else return false;
}

int deposit (int balanceAdd) {
    if (balanceAdd > 0) return balance += balanceAdd;
    throw new IllegalArgumentException("Deposit amount must be positive");
}

int withdraw (int balanceMin) {
    if (balance >= balanceMin && balanceMin > 0) return balance -= balanceMin;
     throw new IllegalStateException("Insufficient funds");
}
}

