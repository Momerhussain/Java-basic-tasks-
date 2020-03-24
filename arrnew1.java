import java.util.Scanner;
public class arrnew1{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int []a={9,7,5,3,5,4,2,4};
int size=7,pos,b,d;
System.out.println("ARRAY ELEMENTS ARE");
for(d=0;d<size;d++)
System.out.println(a[d]+" ");
System.out.println("ENTER POSITION WHERE YOU WANT TO INSERT NEW ELEMENT");
pos=sc.nextInt();
if(pos>=0&&pos<size)
{
for(b=size;b>pos;b--)
{
	a[b]=a[b-1];
}
int c;
System.out.println("ENTER ELEMENT THAT IS TO INSERT");
c=sc.nextInt();
a[pos]=c;
size++;
System.out.println("ARRAY ELEMENT AFTER INSERTION OF NEW ELEMENT");
for(b=0;b<size;b++)
{
System.out.println(a[b]);
}
}
else
{
System.out.println("POSITION DOES NO EXISTS");
}
}}
