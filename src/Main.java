import org.mindrot.jbcrypt.BCrypt;

import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    private static final String URL = "jdbc:mysql://localhost:3306/coursehub";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "2507";

    public static void main(String[] args) throws SQLException {
        System.out.println("Welcome to Course Hub.");

        System.out.println("Hashed password:  " + BCrypt.hashpw(PASSWORD, BCrypt.gensalt()));

        DriverManager.getConnection(URL, USERNAME, PASSWORD);
        System.out.println("Connection build successfully.");
    }
}
