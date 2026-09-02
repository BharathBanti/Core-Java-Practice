import com.mysql.cj.protocol.Resultset;

import java.math.BigDecimal;
import java.sql.*;
import java.util.Scanner;

public class Stored_Procedure {

    private static final String URL = "jdbc:mysql://localhost:3306/jdbc_practice";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

//    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        try (Connection con = DriverManager.getConnection(URL,
                USERNAME, PASSWORD);
             CallableStatement prepareCall = con.prepareCall("{call salary_filter(?, ?)}");
             CallableStatement prepareCall2 = con.prepareCall("{call salary_filter2(?, ?)}");
             CallableStatement prepareCall3 = con.prepareCall("{call result_set(?)}");
        ){
            System.out.println("Connected");

            // stored procedure - 1
            int dept = 1;
            prepareCall.setInt(1, dept);
            prepareCall.registerOutParameter(2, Types.INTEGER);
            prepareCall.execute();

            int count = prepareCall.getInt(2);
            System.out.println("Count of employees from dept " + dept + " : " + count);

            // stored procedure - 2
            BigDecimal salary = BigDecimal.valueOf(40000.00);
            prepareCall2.setBigDecimal(1, salary);
            prepareCall2.registerOutParameter(2, Types.INTEGER);
            prepareCall2.execute();
            int countSalaries = prepareCall2.getInt(2);

            System.out.println("Count of employees salary > " + salary + " : " + countSalaries);

            // stored procedure - 3
            BigDecimal sal = BigDecimal.valueOf(40000.00);
            prepareCall3.setBigDecimal(1, sal);
            prepareCall3.execute();
            ResultSet resultSet = prepareCall3.getResultSet();

            while(resultSet.next()){
                System.out.println(resultSet.getString("name") +
                        " - " + resultSet.getBigDecimal("salary"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
