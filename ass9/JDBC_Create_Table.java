import java.sql.*;

public class JDBC_Create_Table {
    public static void main(String[] args) {
        try
        {
            String dburl = "jdbc:mysql://localhost:3306/java";
            String username = "siddharth";
            String password = "Chunnu@1";
            Connection myConnection = DriverManager.getConnection(dburl, username, password);
            Statement mysStatement = myConnection.createStatement();
            mysStatement.executeUpdate("create table student(name varchar(15), age integer, gender char(1), city varchar(15), dob date)");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}