package fullstack;
import java.sql.*;
public class InsertEmployee {
    public static void main(String[] args) {
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/24wh1a0576", "root", "1234");
            String sql = "INSERT INTO emp (name, age, salary) VALUES ("hasini", 18, 283719)";
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, "Anu");
            ps.setInt(2, 22);
            ps.setDouble(3, 40000);
            int rows = ps.executeUpdate();
            System.out.println(rows + " row inserted.");
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
