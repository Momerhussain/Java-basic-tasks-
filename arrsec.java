import java.util.Scanner;
public class arrsec{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int [] a=new int[100];
int i,n=5,b,temp;
int d=3;
System.out.println("ENTER 5 NUMBERS");
for(i=0;i<n;++i)
{
a[i]=sc.nextInt();
}
for(b=0;b<n-1;++b)
for(i=0;i<n-b-1;++i)
{
if(a[i]>a[i+1])
{
temp=a[i];
a[i]=a[i+1];
a[i+1]=temp;
}}
System.out.println("THE SECOND LARGEST NUMBER IS");
System.out.println(a[d]);
}}