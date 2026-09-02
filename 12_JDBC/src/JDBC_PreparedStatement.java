import java.sql.*;
import java.util.Scanner;

public class JDBC_PreparedStatement {

    // static instance members
    private static final String URL = "jdbc:mysql://localhost:3306/jdbc_practice";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String query = "DELETE FROM interns WHERE email = ?"; // sql query

        // TRY WITH RESOURCES - automatically closes the resources Connection, Statement and ResultSet
        try(Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            PreparedStatement stmt = con.prepareStatement(query);)
        {
            System.out.print("Enter email to delete: ");
            stmt.setString(1, scanner.next());
            int rows = stmt.executeUpdate();

            if(rows > 0){
                System.out.println(rows + " row(s) deleted successfully");
            }
            else System.out.println("Deletion failed");
        } catch (Exception e){
            System.out.println("Something went wrong :(");
        }
    }
}



