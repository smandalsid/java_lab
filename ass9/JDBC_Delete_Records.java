import java.sql.*;

public class JDBC_Delete_Records {
    public static void main(String[] args) {
        try
        {
            String url = "jdbc:mysql://localhost:3306/java";
            String user = "siddharth";
            String password = "Chunnu@1";
            Connection myConnection = DriverManager.getConnection(url,user, password);
            Statement myStatement = myConnection.createStatement();

            String sql = "delete from student where city='Gujarat'";
            myStatement.executeUpdate(sql);

            System.out.println("After deleting records");
            sql = "select * from student";
            ResultSet myResultSet = myStatement.executeQuery(sql);
            System.out.println("\nRecords in the updated table");
            while(myResultSet.next())
            {
                System.out.println("Student name: "+myResultSet.getString("name")+" Age: "+myResultSet.getString("age")+" Gender: "+myResultSet.getString("gender")+" City: "+myResultSet.getString("city")+" DOB: "+myResultSet.getString("dob"));
            }

        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
