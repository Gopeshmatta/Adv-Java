import java.lang.*;
class Name
{
public static void main(String args[])
{
String s1="hello, world";
String s2=new String("Hello World");
String s3=new String("HeLlO WoRlD");
System.out.println(s1);
System.out.println(s2);
System.out.println(s3);
System.out.println("Length of S1    : "+s1.length());
System.out.println("Replace of S1    : "+s1.replace("hello","Hai"));
System.out.println("Split of S1    : "+s1.split(", "));
}
}