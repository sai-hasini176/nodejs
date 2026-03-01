import java.sql.*;
public class RetrieveEmployee {
  public static void main(String[] args) {
    try {
    // Load JDBC driver  
    Class.forName("com.mysql.cj.jdbc.Driver");
    // Connect to database
    Connection con = DriverManager.getConnection(
                  "jdbc:mysql://localhost:3306/24wh1a0576",
                  "root",
                  "1234"
            );
    // Execute query and get results
    Statement stmt = con.createStatement();
    ResultSet rs = stmt.executeQuery("SELECT * FROM Employee");
    // Print the results
    while (rs.next()) {
      System.out.println(rs.getInt(1) + " - " + rs.getString(2));
    }
    // Close connection
    con.close();
    } catch (Exception e) {
     e.printStackTrace();
   }
 }
}
