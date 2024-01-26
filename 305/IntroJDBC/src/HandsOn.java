import java.sql.*;
public class HandsOn {
    public static void main(String[] args) throws SQLException{
        Connection con = null;
        PreparedStatement prepStmt = null;
        ResultSet rs = null;
        String dburl = "jdbc:mysql://localhost:3306/classicmodels";
        String user= "root";
        String password = "password";
        String sql = "select * from employees where officeCode = ? OR officeCode = ?";
        try {
            con = DriverManager.getConnection(dburl, user, password);
            prepStmt = con.prepareStatement(sql);
            prepStmt.setInt(1, 1);
            prepStmt.setInt(2, 4);
            rs = prepStmt.executeQuery();
            while(rs.next()) {
                System.out.println(rs.getString("firstName"));
                System.out.println(rs.getString("lastname"));
                System.out.println(rs.getString("email"));
                System.out.println(rs.getString("officeCode"));
            }
            con.close();
        } catch(SQLException e) {
            e.printStackTrace();
        }
    }
}
