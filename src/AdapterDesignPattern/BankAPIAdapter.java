package AdapterDesignPattern;

public interface BankAPIAdapter {

    void sendMoney(String from, String to, double amount);

    void register(String phoneNumber);

    double checkBalance(String accNumber);
}

