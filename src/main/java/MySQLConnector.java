import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class MySQLConnector {

    private static final String URL = "jdbc:mysql://localhost:3306/tms_schema";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "admin";

       private Connection connection;

    public MySQLConnector() {
        try{
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Connection getConnection() throws SQLException {
        if (connection != null && !connection.isClosed()){
            return connection;
        }
        return null;
    }
}
