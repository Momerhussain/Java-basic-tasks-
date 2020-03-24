import java.util.*;
class Person
{
String name1,name2,name3,name4;
double salary1,salary2;
int year1,year2;

public Person(String s1,String s2,String s3,String s4,double a1,double a2,int y1,int y2)
{
name1=s1;
name2=s2;
name3=s3;
name3=s4;
salary1=a1;
salary2=a2;
year1=y1;
year2=y2;
}
}
class Employ extends Person
{

public Employ(String s1,String s2,String s3,String s4,double a1,double a2,int y1,int y2)
{
super(s1, s2, s3, s4, a1, a2, y1, y2);
}

void Record1()
{
System.out.print("\n\n 1st Employ Record ");
System.out.print("\n===================");
System.out.print("\n  Employ Full Name:-  "+name1+name2);
System.out.print("\nEmploy Anual Salary:- "+salary1);
System.out.print("\n Emply Joining Year:- "+year1);
}
void Record2()
{
System.out.print("\n\n 2nd Employ Record ");
System.out.print("\n===================");
System.out.print("\n  Employ Full Name:-  "+name3+name4);
System.out.print("\nEmploy Anual Salary:- "+salary2);
System.out.print("\n Emply Joining Year:- "+year2);
}
}
public class PersonDemo
{
public static void main(String args[])
{
Scanner in=new Scanner(System.in);
System.out.print("\nEnter Your Data Here\n");
System.out.print("\n Employ First Name:-  ");
String a=in.nextLine();
System.out.print(" Employ Last Name:-   ");
String b=in.nextLine();
System.out.print("Employ Anual Salary:- ");
double c=in.nextDouble();
System.out.print("Employ Joining Year:- ");
int d=in.nextInt();
System.out.print("\n");
String i=in.nextLine();
System.out.print("\n Employ First Name:-  ");
String e=in.nextLine();
System.out.print(" Employ Last Name:-   ");
String f=in.nextLine();
System.out.print("Employ Anual Salary:- ");
double g=in.nextDouble();
System.out.print("Employ Joining Year:- ");
int h=in.nextInt();
Person obj1=new Person(a,b,e,f,c,g,d,h);
Employ obj2=new Employ(a,b,e,f,c,g,d,h);
obj2.Record1();
obj2.Record2();
}
}