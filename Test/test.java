package Test; import Bank.Account;
import Bank.Internal;
import Bank.Services;
public class test {
    public static void main(String[] args) {
        // Accounts 
        Account A1 = new Account("John", "gsjyhe77", 1000);
        
        /*  operation we Can't preform:
        A1.balance = 1000; //change the balance
        A1.deposit(500); //deposit to the user account without using the service
        A1.withdraw(10000); //withdrawing from the user account without using the service
        A1.getBalance(); // viewing the balance without the service
        A1.verifyPassword("password123"); // checking the password */  

        Services serv = new Services(); // services for the customer

        serv.reqName(A1);

        serv.reqBalance(A1, "John", "gsjyhe77");
   
        serv.reqDeposit(A1, "John", "gsjyhe77", 5000);

        Internal admin = new Internal();   // operations for the admin to update Account info

         admin.changeName(A1,"Ahmed");  // Here the User cannot modify Account info 
       
    }
}
