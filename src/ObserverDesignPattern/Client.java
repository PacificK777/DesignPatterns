package ObserverDesignPattern;

public class Client {
    public static void main(String[] args) {
        Flipkart flipkart = new Flipkart();
        EmailSender emailSender = new EmailSender(flipkart);
        InvoiceGenerator invoiceGenerator = new InvoiceGenerator(flipkart);

        flipkart.onOrderPlaced();
        System.out.println("***********");
        flipkart.onOrderCancel();
    }
}
