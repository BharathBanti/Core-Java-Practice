import java.math.BigDecimal;
import java.sql.*;

public class JDBC_IndustryStandardCode {

    // static instance members
    private static final String URL = "jdbc:mysql://localhost:3306/jdbc_practice";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args){
        String query = "SELECT * FROM interns"; // sql query

        // TRY WITH RESOURCES - automatically closes the resources Connection, Statement and ResultSet
        try(Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement stmt = con.createStatement();
            ResultSet resultSet = stmt.executeQuery(query);)
            {
            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String role = resultSet.getString("role");
                BigDecimal salary = resultSet.getBigDecimal("salary");

                System.out.println(id + " " +
                        name + " " +
                        email + " " +
                        role + " " +
                        salary);
            }
        } catch (SQLException e){
            System.out.println("Database connection failed");
        }
    }
}
