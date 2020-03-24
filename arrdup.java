import java.util.Scanner;
public class arrdup{
public static void main(String args[]){
int a,c=0,d=0,e=0,f=0,g,h;
Scanner sc=new Scanner(System.in);
System.out.println("ENTER NUMBER OF ARRAY ELEMENTS");
g=sc.nextInt();
int [] b=new int [g];
System.out.println("ENTER ARRAY ELEMENTS");
for(h=0;h<g;h++){
 b[h]=sc.nextInt();
}
for(a=e;a<5;a++)
{
d=b[a];
	for(c=a+1;c<5;c++)
	{
	c=b[c];
	if(d==c)
	{f++;
	break;
	}
	
}}
System.out.println("DUPLICATE ELEMENTS ARE "+f);
}}