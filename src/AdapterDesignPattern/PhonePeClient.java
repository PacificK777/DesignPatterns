package AdapterDesignPattern;

public class PhonePeClient {
    public static void main(String[] args) {
        BankAPIAdapter bankAPIAdapter = new YESBankAdapter();
        bankAPIAdapter.sendMoney("amit","raj", 1000);
        bankAPIAdapter.checkBalance("237844336238403");

    }
}
