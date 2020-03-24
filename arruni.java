import java.util.Scanner;
public class arruni{
public static void main(String args[]){
int a,c,d=0,e=0,f=0,g,h;
Scanner sc=new Scanner(System.in);
System.out.println("ENTER NUMBER OF ARRAY ELEMENTS");
g=sc.nextInt();
int [] b=new int [g];
System.out.println("ENTER ARRAY ELEMENTS");
for(h=0;h<g;h++){
 b[h]=sc.nextInt();
}
System.out.println("UNIQUE ELEMENTS ARE ");
for(a=0;a<g;a++){
for(c=0;c<a;c++){
if(b[a]==b[c])
break;
}
if(a==c)
System.out.print(b[a]+" ");
}}}