import java.math.BigDecimal;
import java.sql.*;

public class JDBC_CRUD_INSERT {

    // static instance members
    private static final String URL = "jdbc:mysql://localhost:3306/jdbc_practice";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args){
        String query1 = "INSERT INTO interns (name, email, role, salary)" +
                "VALUES ('Siva', 'siva85@gmail.com', 'Backend', 120000)"; // sql query
        String query2 = "SELECT * FROM interns";

        // TRY WITH RESOURCES - automatically closes the resources Connection, Statement and ResultSet
        try(Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement stmt = con.createStatement();)
        {
            int rows = stmt.executeUpdate(query1);

            if(rows > 0){
                System.out.println(rows + " row(s) inserted successfully");
            }
            else System.out.println("Insertion failed");

            ResultSet resultSet = stmt.executeQuery(query2);
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

            resultSet.close();
        } catch (SQLException e){
            System.out.println("Database connection failed");
        }
    }
}
