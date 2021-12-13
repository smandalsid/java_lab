import java.sql.*;
public class JDBC_Delete_Field {
    public static void main(String[] args) {
        try
        {
            String url = "jdbc:mysql://localhost:3306/java";
            String user = "siddharth";
            String password = "";
            Connection myConnection = DriverManager.getConnection(url,user, password);
            Statement myStatement = myConnection.createStatement();

            String sql = "select * from student";
            ResultSet myResultSet = myStatement.executeQuery(sql);
            System.out.println("Records in table");
            while(myResultSet.next())
            {
                System.out.println("Student name: "+myResultSet.getString("name")+" Age: "+myResultSet.getString("age")+" Gender: "+myResultSet.getString("gender")+" City: "+myResultSet.getString("city")+" DOB: "+myResultSet.getString("dob"));
            }

            sql = "alter table student drop column Age";
            myStatement.executeUpdate(sql);
            sql = "select * from student";
            myResultSet = myStatement.executeQuery(sql);
            System.out.println("\nThe table after deleting column");
            while(myResultSet.next())
            {
                System.out.println("Student name: "+myResultSet.getString("name")+" Gender: "+myResultSet.getString("gender")+" City: "+myResultSet.getString("city")+" DOB: "+myResultSet.getString("dob"));
            }

        }
        catch(Exception e)
        {

        }
    }
}
