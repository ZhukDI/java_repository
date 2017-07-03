import java.sql.*;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String userName = "root";
        String password = "root";
        String connectionUrl = "jdbc:mysql://localhost:3306/test";
        Class.forName("com.mysql.jdbc.Driver");
        try(Connection conn = DriverManager.getConnection(connectionUrl, userName, password);
        Statement statement = conn.createStatement()) {
            statement.executeUpdate("drop table books");
            statement.executeUpdate("CREATE TABLE books (id MEDIUMINT NOT NULL AUTO_INCREMENT, name CHAR(30) NOT NULL , PRIMARY KEY (id));");
            statement.executeUpdate("INSERT INTO books (name) values('Inferno') ");
            statement.executeUpdate("INSERT INTO books set name = 'Solomon key' ");
            ResultSet resultSet = statement.executeQuery("SELECT * FROM books");
            while (resultSet.next()) {
                System.out.println(resultSet.getInt("id"));
                System.out.println(resultSet.getString("name"));
                System.out.println("-------------------");
            }

            ResultSet rs2 = statement.executeQuery("SELECT name FROM books WHERE id = 1");
            while (rs2.next()) {
                System.out.println(rs2.getString("name"));
            }
        }
    }
}
