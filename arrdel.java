import java.util.Scanner;
public class arrdel{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int []a=new int[100];
int b,c,d;
System.out.println("ENTER NUMBER OF ELEMENTS IN ARRAY");
d=sc.nextInt();
System.out.println("enter"+d+"element :");
for(c=0;c<d;c++)
a[c]=sc.nextInt();
System.out.println("enter the locatiom where you wish to delete element");
b=sc.nextInt();
if(b>=d+1)
System.out.println("Deletion not possible.");
else
{
for(c=b-1;c<d-1;c++)
a[c]=a[c+1];
System.out.println("resultant array is");
for(c=0;c<d-1;c++)
System.out.println(a[c]);
}}}


