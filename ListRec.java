import java.sql.*;
import java.lang.*;
class ListRec
{
public static void main(String args[])
{
try
{
Connection Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1","root","Pyari$$");
Statement stmt=Con.createStatement();
ResultSet rs=stmt.executeQuery("select*from myemp");
while(rs.next())
{
System.out.print(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3)+"\t"+rs.getString(4));
System.out.println();
}
}catch(Exception ex)
{
System.out.println(ex);
}
}
}