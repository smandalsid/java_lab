import java.sql.*;

public class JDBC_Show_Records {
    public static void main(String[] args) {
        try
        {
            String url = "jdbc:mysql://localhost:3306/java";
            String user = "siddharth";
            String password = "Chunnu@1";
            Connection myConnection = DriverManager.getConnection(url, user, password);
            Statement myStatement = myConnection.createStatement();

            String sql = "select * from student where age>=19";
            ResultSet myResultSet = myStatement.executeQuery(sql);
            System.out.println("Students with age greater than or equal to 19");
            while(myResultSet.next())
            {
                System.out.println("Student name: "+myResultSet.getString("name")+" Age: "+myResultSet.getString("age")+" Gender: "+myResultSet.getString("gender")+" City: "+myResultSet.getString("city")+" DOB: "+myResultSet.getString("dob"));
            }
            System.out.println("\nStudents with age less than 19");
            sql = "select * from student where age<19";
            myResultSet = myStatement.executeQuery(sql);
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
