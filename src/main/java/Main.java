import java.sql.*;

public class Main {

    public static void main(String[] args) {
        MySQLConnector connector = new MySQLConnector();

        String query = "select * from students";
        try {
            Connection connection = connector.getConnection();
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()) {
                Student student = new Student();
                student.setId(resultSet.getInt(1));
                student.setName(resultSet.getString(2));
                student.setLast_name(resultSet.getString(3));
                student.setLanguage(resultSet.getString(4));
                student.setCity_id(resultSet.getInt(5));

                System.out.println(student);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

