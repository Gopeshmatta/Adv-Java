import java.lang.*;
import java.sql.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
class PreSt
{
public static void main(String args[])
{
System.out.println("Insert Records example using prepared statement!");
Connection Con=null;
try
{
Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1","root","Pyari$$");
try
{
String sql="insert into myemp values(?,?,?,?)";
PreparedStatement prest=Con.prepareStatement(sql);
BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter no....:");
int eno=Integer.parseInt(bf.readLine());
prest.setInt(1,eno);
System.out.println("Enter Name...:");
String ename=bf.readLine();
prest.setString(2,ename);
System.out.println("Enter Esal...:");
int esal=Integer.parseInt(bf.readLine());
prest.setInt(3,esal);
System.out.println("Enter Egrade...:");
String egrade=bf.readLine();
prest.setString(4,egrade);
int count=prest.executeUpdate();
System.out.println(count+" "+"rows(s) affected");
Con.close();
}
catch(Exception s)
{
System.out.println(s);
}
}
catch(Exception e)
{
e.printStackTrace();
}
}
}