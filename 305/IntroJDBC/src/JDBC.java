import java.sql.*;

public class JDBC {
    public static void main(String[] args) throws SQLException {
        String dburl = "jdbc:mysql://localhost:3306/classicmodels";
        String user = "root";
        String password = "password";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // optional
            Connection connection = DriverManager.getConnection(dburl, user, password);
//            String SelectSQL = "Select * FROM employees";
//            Statement stmt = connection.createStatement();
//            ResultSet result =  stmt.executeQuery(SelectSQL);
//            while(result.next())
//            {
//                String EmployeeID  = result.getString("employeeNumber");
//                String fname = result.getString("firstName");
//                String lname  = result.getString("lastName");
//                System.out.println(EmployeeID +" | " + fname + "|"+ lname );
//            }
//            String SelectSQL = "select * from employees where employeeNumber = ?";
//            PreparedStatement mystmt = connection.prepareStatement(SelectSQL);
//            mystmt.setInt(1, 1002);
//            ResultSet result = mystmt.executeQuery();
//            while(result.next())
//            {
//                String name = result.getString("firstName");
//                String email  = result.getString("email");
//                System.out.println(name +" | " + email);
//            }
            String sqlQuery = "INSERT INTO EMPLOYEES (officeCode,firstName,lastName,email,extension,reportsTo,VacationHours,employeeNumber,jobTitle) VALUES (?,?,?,?,?,?,?,?,?)";
            PreparedStatement prepStmt = connection.prepareStatement(sqlQuery);
            prepStmt.setInt(1, 6);
            prepStmt.setString(2, "Jamil");
            prepStmt.setString(3, "fink");
            prepStmt.setString(4, "JJ@gmail.com");
            prepStmt.setString(5, "2759");
            prepStmt.setInt(6, 1143);
            prepStmt.setInt(7, 9);
            prepStmt.setInt(8, 0003);
            prepStmt.setString(9, "Manager");
            int affectedRows = prepStmt.executeUpdate();
            System.out.println(affectedRows + " row(s) affected !!");


            connection.close();

        }
        catch(SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
