package Bank;

public class Services {

    public void reqBalance(Account acc, String accountHolder, String accountPass) {
        if (acc.getAccountholder().equals(accountHolder) && acc.AccountVerify(accountPass)) {
            System.out.println("balance: " + acc.getBalance());  
        }
        else System.out.println("invald acccount name or password");
        
    }

    public void reqWithdraw(Account acc, String accountHolder, String accountPass, int amount) {
        if (acc.getAccountholder().equals(accountHolder) && acc.AccountVerify(accountPass)) {
            System.out.println("Withdrawing... New balance: " + acc.withdraw(amount)); 
        }
        else System.out.println("invalid account name or password");
    }

    public void reqDeposit(Account acc, String accountHolder, String accountPass, int amount) {
        if (acc.getAccountholder().equals(accountHolder) && acc.AccountVerify(accountPass)) {
            System.out.println("Depositing... New balance: " + acc.deposit(amount));
        }
        else System.out.println("invalid account name or password");
    }
}
