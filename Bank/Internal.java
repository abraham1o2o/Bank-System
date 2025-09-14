package Bank; 

public class Internal {
    void changeName(Account acc , String newName) {
        acc.updateAccountHolder(newName);
        System.out.println("Updating... Done! New Name is " + newName);
    }
    void changePass(Account acc , String oldPass , String newPass) {
        if (acc.passwordVerify(oldPass)) {
            acc.updateAccountPass(newPass);
            System.out.println("Password updated successfull");
        }
        else System.out.println("Password was Not updated, Password incorect");
 }
}
