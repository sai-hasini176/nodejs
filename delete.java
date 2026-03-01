import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class DeleteEmployee {
    public static void main(String[] args) {
        try {
            Connection connection = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/24wh1a0576",
                "root",
                "1234"
            );
            Statement statement = connection.createStatement();
            int rows = statement.executeUpdate(
                "DELETE FROM Employee WHERE eId='103'"
            );
            System.out.println(rows + " row(s) deleted.");

            ResultSet rs = statement.executeQuery(
                "SELECT * FROM Employee"
            );
            while (rs.next()) {
                System.out.println(
                    rs.getString("eId") + "\t" +
                    rs.getString("ename") + "\t" +
                    rs.getString("deptId")
                );
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
