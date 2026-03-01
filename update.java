import java.sql.*;

public class UpdateEmployee {
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

            // Create statement
            Statement stmt = con.createStatement();

            // UPDATE query
            int rows = stmt.executeUpdate(
                    "UPDATE Employee SET ename='Hasini' WHERE eID=101"
            );

            System.out.println(rows + " row(s) updated.");

            // SELECT query to view modified table
            ResultSet rs = stmt.executeQuery("SELECT * FROM Employee");

            System.out.println("eID\tename");
            System.out.println("----------------");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("eID") + "\t" +
                        rs.getString("ename")
                );
            }

            // Close connection
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
