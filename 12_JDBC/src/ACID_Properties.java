import java.math.BigDecimal;
import java.sql.*;
import java.util.Scanner;

public class ACID_Properties {
    private static final String URL = "jdbc:mysql://localhost:3306/jdbc_practice";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    public static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){

        try(Connection con = DriverManager.getConnection(URL, USERNAME, PASSWORD);) {
            con.setAutoCommit(false);
            try{
                System.out.print("Enter the Sender ID: ");
                int senderID = scanner.nextInt();

                System.out.print("Enter the Receiver ID: ");
                int receiverID = scanner.nextInt();

                System.out.print("Enter the amount: ");
                BigDecimal amount = scanner.nextBigDecimal();

                boolean success = transaction(con, senderID, receiverID, amount);

                if(success){
                    con.commit();
                    System.out.println("Transaction Successfull..!");
                }
                else{
                    con.rollback();
                    System.out.println("Transaction Cancelled..!");
                }
            }
            catch (SQLException e){
                con.rollback();
                System.out.println("Transaction Failed..!");
                e.printStackTrace();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static boolean transaction(Connection con,
                                      int senderID,
                                      int receiverID,
                                      BigDecimal amount) throws SQLException{

        if(senderID == receiverID){
            System.out.println("Sender and Receiver can't be same..!");
            return false;
        }

        // validating input amount
        if(amount.compareTo(BigDecimal.ZERO) <= 0){
            System.out.println("Invalid amount");
            return false;
        }

        BigDecimal senderBalance = getBalance(con, senderID);

        // validating sender
        if(senderBalance == null){
            System.out.println("Sender Not Found..");
            return false;
        }

        // validating receiver
        if(getBalance(con, receiverID) == null){
            System.out.println("Receiver Not Found..");
            return false;
        }

        // validating sender balance
        if(senderBalance.compareTo(amount) < 0){
            System.out.println("Insufficient Balance..!");
            return false;
        }

        // confirmation
        System.out.print("Confirm Transaction (Y/N): ");
        char choice = scanner.next().toUpperCase().charAt(0);

        if(choice != 'Y'){
            return false;
        }

        debit(con, senderID, amount);
        credit(con, receiverID, amount);

        return true;
    }

    public static BigDecimal getBalance(Connection con, int senderID) throws SQLException{
        String fetch = "SELECT salary FROM interns WHERE id = ?";

        try(PreparedStatement pstmt = con.prepareStatement(fetch);){
            pstmt.setInt(1, senderID);
            try(ResultSet rs = pstmt.executeQuery();){
                if(rs.next()){
                    return rs.getBigDecimal("salary");
                }
            }
        }

        return null;
    }

    public static void debit(Connection con, int id, BigDecimal amount) throws SQLException{
        String query = "UPDATE interns SET salary = salary - ? WHERE id = ?";
        try(PreparedStatement pstmt = con.prepareStatement(query);){
            pstmt.setBigDecimal(1, amount);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
        }
    }

    public static void credit(Connection con, int id, BigDecimal amount) throws SQLException{
        String query = "UPDATE interns SET salary = salary + ? WHERE id = ?";

        try(PreparedStatement pstmt = con.prepareStatement(query);){
            pstmt.setBigDecimal(1, amount);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
        }
    }
}
