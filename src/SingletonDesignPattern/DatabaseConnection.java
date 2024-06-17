package SingletonDesignPattern;

public class DatabaseConnection {
    private static DatabaseConnection dbc = null;
    String URL;
    int portNo;
    String userName;
    String password;

    private DatabaseConnection(String URL, int portNo, String userName, String password) {
        this.URL = URL;
        this.portNo = portNo;
        this.userName = userName;
        this.password = password;
    }

    public static synchronized DatabaseConnection getInstance(String URL, int portNo, String userName, String password) {
        if (dbc == null) {
            synchronized (DatabaseConnection.class) {
                if (dbc == null) {
                    dbc = new DatabaseConnection(URL, portNo, userName, password);
                }
            }
        }
        return dbc;
    }
}