import java.sql.*;

public class JDBC_Introduction {
    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/jdbc_practice";
        String username = "root";
        String password = "root";

        try {
            // 1. LOAD THE DRIVER
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver loaded successfully");

            // 2. ESTABLISH THE CONNECTION
            Connection con = DriverManager.getConnection(url, username, password);
            System.out.println("Connection established successfully");

            // 3. CREATE A SQL STATEMENT
            Statement smt = con.createStatement();
            System.out.println("Statement created successfully");

            // 4. EXECUTE THE QUERY
            String query = "SELECT * FROM interns"; // query
            ResultSet resultSet = smt.executeQuery(query);

            // 5. PROCESS THE RESULT
            while(resultSet.next()){
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String role = resultSet.getString("role");
                double salary = resultSet.getDouble("salary");

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
