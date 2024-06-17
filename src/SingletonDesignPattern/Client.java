package SingletonDesignPattern;

public class Client {
    public static void main(String[] args) {
        DatabaseConnection dbc1 = DatabaseConnection.getInstance("localhost", 3306, "root", "password");
        DatabaseConnection dbc2 = DatabaseConnection.getInstance("localhost", 3306, "root", "password");

        System.out.println(dbc1);
        System.out.println(dbc2);

        if (dbc1 == dbc2) {
            System.out.println("Both instances are the same.");
        } else {
            System.out.println("Instances are different.");
        }
    }
}