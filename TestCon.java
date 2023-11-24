import java.sql.*;
class TestCon
{
public static void main(String args[])
{
try
{
Connection Con=DriverManager.getConnection("jdbc:mysql://localhost:3306","root","Pyari$$");
System.out.println("connection ok");
}catch(Exception ex)
{
System.out.println(ex);
}
}
}