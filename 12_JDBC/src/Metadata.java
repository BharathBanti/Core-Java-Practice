import java.math.BigDecimal;
import java.sql.*;

public class Metadata {

    private static final String URL = "jdbc:mysql://localhost:3306/jdbc_practice";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args){
        String query = "SELECT * FROM interns";

        try(Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement stmt = con.createStatement();
            ResultSet resultSet = stmt.executeQuery(query);){
            // 1. Database metadata
            DatabaseMetaData dbMetaData = con.getMetaData();

            System.out.println(dbMetaData.getDatabaseProductName()); // DB Product
            System.out.println(dbMetaData.getDatabaseProductVersion()); // DB Product Version
            System.out.println(dbMetaData.getDriverName()); // Driver name
            System.out.println(dbMetaData.getDriverVersion()); // Driver version
            System.out.println(dbMetaData.getURL()); // DB URL
            System.out.println(dbMetaData.getUserName()); // DB Username

//             metadata getTables()
            ResultSet tablesData = dbMetaData.getTables(null, null, "%", new String[]{"TABLE"});
            while(tablesData.next()){
                System.out.println("Table " + tablesData.getString("TABLE_NAME"));
            }

//             metadata getColumns()
            ResultSet tableColumns = dbMetaData.getColumns(null, null, "interns", null);
            while(tableColumns.next()){
                System.out.println(tableColumns.getString("COLUMN_NAME") + " : " + tableColumns.getString("TYPE_NAME") + " - " + tableColumns.getString("COLUMN_SIZE"));
            }

            // resultset
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

            // 2. result set metadata
            ResultSetMetaData rsMetaData = resultSet.getMetaData();
            int columnCount = rsMetaData.getColumnCount();
            System.out.println(columnCount);
            for(int i = columnCount; i > 0; i--){
                System.out.println(rsMetaData.getColumnLabel(i) + " - " + rsMetaData.getColumnTypeName(i) + " : " + rsMetaData.getColumnDisplaySize(i));
            }

        } catch (Exception e) {
            System.out.println("Something went wrong");
        }
    }

}
