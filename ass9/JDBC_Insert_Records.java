import java.sql.*;

public class JDBC_Insert_Records {
    public static void main(String[] args) {
        try
        {
            String dburl = "jdbc:mysql://localhost:3306/java";
            String username = "siddharth";
            String password = "";
            Connection myConnection = DriverManager.getConnection(dburl, username, password);
            Statement mysStatement = myConnection.createStatement();
            System.out.println("Inserting records in the table\n");
            String sql = "insert into student values('studenta', 18, 'M', 'Mumbai', '2003-01-01')";
            mysStatement.executeUpdate(sql);
            sql = "insert into student values('studentb', 19, 'M', 'Chennai', '2002-02-28')";
            mysStatement.executeUpdate(sql);
            sql = "insert into student values('studentc', 19, 'F', 'Delhi', '2002-03-12')";
            mysStatement.executeUpdate(sql);
            sql = "insert into student values('studentd', 19, 'F', 'Kolkata', '2002-01-13')";
            mysStatement.executeUpdate(sql);
            sql = "insert into student values('studente', 18, 'F', 'Lucknow', '2003-02-15')";
            mysStatement.executeUpdate(sql);
            sql = "insert into student values('studente', 18, 'M', 'Ahmedabad', '2003-05-18')";
            mysStatement.executeUpdate(sql);
            sql = "insert into student values('studentf', 18, 'F', 'Patna', '2003-07-15')";
            mysStatement.executeUpdate(sql);
            sql = "insert into student values('studentg', 19, 'F', 'Chandigarh', '2002-10-07')";
            mysStatement.executeUpdate(sql);
            sql = "insert into student values('studenth', 18, 'M', 'Gujarat', '2003-04-21')";
            mysStatement.executeUpdate(sql);
            sql = "insert into student values('studenti', 18, 'F', 'Bangalore', '2003-01-13')";
            mysStatement.executeUpdate(sql);
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}
