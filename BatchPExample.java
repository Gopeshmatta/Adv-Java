import java.sql.*;
import java.lang.*;
class BatchPExample
{
public static void main(String args[])throws Exception
{
Connection Con=DriverManager.getConnection("jdbc:mysql://localhost:3306/demo1","root","Pyari$$");
Con.setAutoCommit(false);
Statement stmt=Con.createStatement();
stmt.addBatch("insert into myemp values(103,'Pyari',50000,'A')");
stmt.addBatch("insert into myemp values(104,'Karim',50000,'A')");
stmt.addBatch("insert into myemp values(105,'Sana',50000,'A')");
stmt.addBatch("insert into myemp values(106,'Afreedh',38000,'B')");
stmt.addBatch("insert into myemp values(107,'Gopi',35000,'B')");
stmt.addBatch("insert into myemp values(108,'Ram',30000,'B')");
stmt.addBatch("insert into myemp values(109,'Yahya',45000,'A')");
stmt.addBatch("insert into myemp values(110,'Amaira',45000,'A')");
stmt.executeBatch();
Con.commit();
System.out.println("Rows Inserted");
Con.close();
}
}

