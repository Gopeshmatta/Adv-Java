import java.sql.*;
import java.lang.*;
class InsRec
{
public static void main(String args[])
{
try
{
Connection Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1","root","Pyari$$");
Statement stmt=Con.createStatement();
stmt.executeUpdate("insert into myemp values(101,'raj',45000,'A')");
stmt.executeUpdate("insert into myemp values(102,'ramya',46000,'A')");
System.out.println("Records Inserted");
}catch(Exception ex)
{
System.out.println(ex);
}
}
}
