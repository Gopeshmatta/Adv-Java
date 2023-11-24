import java.sql.*;
import java.lang.*;
class UpdateRec
{
public static void main(String args[])
{
try
{
Connection Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1","root","Pyari$$");
Statement stmt=Con.createStatement();
stmt.executeUpdate("update myemp set esal=esal+100");
System.out.println("Record Updated");
}catch(Exception ex)
{
System.out.println(ex);
}
}
}
