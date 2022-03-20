import java.sql.*;

public class Main {

    public static void main(String[] args) {
        // Connection Class // DriverManager Class.getConnection returns Object of type Connection
        try (Connection conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/javaworld",
                "javauser", "java1234")) {

            System.out.println(conn);

        }
        catch (SQLException e) {
            System.out.println(e);
        }
    }
}