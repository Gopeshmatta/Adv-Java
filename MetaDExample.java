import java.sql.*;
import java.lang.*;
class MetaDExample
{
public static void main(String args[])
{
try
{
Connection Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1","root","Pyari$$");
DatabaseMetaData dbma=Con.getMetaData();
System.out.println("Driver Name..:"+dbma.getDriverName());
System.out.println("Driver Version..:"+dbma.getDriverVersion());
System.out.println("User Name..:"+dbma.getUserName());
System.out.println("Database Product Name..:"+dbma.getDatabaseProductName());
System.out.println("Database Product Version..:"+dbma.getDatabaseProductVersion());
Con.close();
}catch(Exception e)
{
System.out.println(e);
}
}
}