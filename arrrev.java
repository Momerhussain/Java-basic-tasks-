import java.util.Scanner;
public class arrrev{
public static void main(String args[]){
int b,c;
Scanner sc=new Scanner(System.in);
System.out.println("ENTER NUMBER OF ARRAY ELEMENTS");
c=sc.nextInt();
int [] a=new int [c];
System.out.println("ENTER ARRAY ELEMENTS");
for(b=0;b<c;b++){
 a[b]=sc.nextInt();
}
System.out.println("NUMBERS IN REVERSE ORDER");
for(b=c-1;b>=0;b--){
System.out.print(a[b]+"  ");
}}}
