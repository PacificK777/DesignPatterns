package AdapterDesignPattern.thirdParty;

public class ICICIBank {
    public void sendMoney( double amount, String from, String to){
        System.out.println("ICICIBank transferring money API");
    }
    public double getBalance(String accNumber){
        System.out.println("ICICIBank get balance API");
        return 0.0;
    }
    public void registerAcc(String phone){
        System.out.println("ICICIBank register account");
    }
}
