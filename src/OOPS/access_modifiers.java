package OOPS;

public class access_modifiers {
    public static void main(String[] args) {
        BankAccount myAcc = new BankAccount();
        myAcc.userName = "charvikhurana";
        //myAcc.passwrod="charvi";
        // password cannot be accessed here.
        myAcc.setPassword("charvi");
    }

}

class BankAccount {
    public String userName;
    private String password;
    public void setPassword(String pwd){
        password=pwd;//accessible within class
    }
}
