import java.math.BigDecimal;
import java.sql.*;

public class JDBC_ResultSet {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/jdbc_practice";
        String username = "root";
        String password = "root";

        try {
            // 1. LOAD THE DRIVER
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. ESTABLISH THE CONNECTION
            Connection con = DriverManager.getConnection(url, username, password);

            // 3. CREATE A SQL STATEMENT
            Statement smt = con.createStatement();

            // 4. EXECUTE THE QUERY
            String query = "SELECT * FROM interns"; // query
            ResultSet resultSet = smt.executeQuery(query);

//            System.out.println(resultSet.getInt("id")); // Exception
//            System.out.println(resultSet.next()); // true

            // 5. PROCESS THE RESULT
            while(resultSet.next()){
                int id = resultSet.getInt(1); // using the column index - starts with 1
                String name = resultSet.getString(2);
                String email = resultSet.getString(3);
                String role = resultSet.getString(4);
                BigDecimal salary = resultSet.getBigDecimal(5);

//                resultSet.next();
                System.out.println(id + " " +
                        name + " " +
                        email + " " +
                        role + " " +
                        salary);
            }

        } catch (ClassNotFoundException e) {
            System.out.println("Failed to load Driver");
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
