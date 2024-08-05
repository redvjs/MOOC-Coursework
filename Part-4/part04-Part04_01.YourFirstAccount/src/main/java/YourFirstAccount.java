
public class YourFirstAccount {

    public static void main(String[] args) {
       Account vicosAccount = new Account("Vico's account", 100.00);
       vicosAccount.deposit(20);
       
       System.out.println(vicosAccount);
    }
    
}
