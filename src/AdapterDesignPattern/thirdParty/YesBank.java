package AdapterDesignPattern.thirdParty;

public class YesBank {
    public void transferMoney(String from, String to, double amount){
        System.out.println("YESBank transferring money API");
    }
    public double getBalance(String accNumber){
        System.out.println("YESBank get balance API");
        return 0.0;
    }
    public void registerAcc(String phone){
        System.out.println("YESBank register account");
    }
}
