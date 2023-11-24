import java.sql.*;
import java.lang.*;
class CreateTable
{
public static void main(String args[])
{
try
{
Connection Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1","root","Pyari$$");
Statement stmt=Con.createStatement();
stmt.executeUpdate("create table myemp(eno int primary key,ename char(20),esal int,egarde char(3))");
System.out.println("table created");
}catch(Exception ex)
{
System.out.println(ex);
}
}
}