import java.io.FileInputStream;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class CLOB_ND_BLOB {

    private static final String URL = "jdbc:mysql://localhost:3306/jdbc_practice";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";

    private static String setPictureQuery = "UPDATE employee SET photo = ? WHERE emp_id = ?";
    private static String setBioQuery = "UPDATE employee SET bio = ? WHERE emp_id = ?";

    public static void main(String[] args){

        String path = "G:\\P_PHOTOS\\e-commerce.webp";
        String path1 = "E:\\CORE-JAVA-PRACTICE-02\\JDBC\\src\\CLOB.txt";

        try(Connection con = DriverManager.getConnection(URL,
                USERNAME, PASSWORD);
            PreparedStatement pstmt = con.prepareStatement(setPictureQuery);
            PreparedStatement pstmt2 = con.prepareStatement(setBioQuery);
        ){
            System.out.println("Connected");

            // BLOB
            FileInputStream fis = new FileInputStream(path);
            pstmt.setBinaryStream(1, fis);
            pstmt.setInt(2, 1);

            System.out.println(pstmt.executeUpdate() + " updated..!");

            // CLOB
            FileReader txtFile = new FileReader(path1);
            pstmt2.setCharacterStream(1, txtFile);
            pstmt2.setInt(2, 1);

            System.out.println(pstmt2.executeUpdate() + " updated..!");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}
