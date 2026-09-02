import java.sql.*;

public class JDBC_CRUD_DELETE {

    // static instance members
    private static final String URL = "jdbc:mysql://localhost:3306/jdbc_practice";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args){
        String query = "DELETE FROM interns WHERE email = 'sneha@company.com'"; // sql query

        // TRY WITH RESOURCES - automatically closes the resources Connection, Statement and ResultSet
        try(Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement stmt = con.createStatement();)
        {
            int rows = stmt.executeUpdate(query);

            if(rows > 0){
                System.out.println(rows + " row(s) deleted successfully");
            }
            else System.out.println("Deletion failed");
        } catch (SQLException e){
            System.out.println("Database connection failed");
        }
    }
}


