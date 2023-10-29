package atm;

import java.sql.SQLException;

public class main {
    public static void main(String[] args) throws InterruptedException, SQLException {
        Login login = new Login();
        login.loginView();
    }
}