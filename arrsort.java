import java.util.Scanner;
public class arrsort{
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
int [] a=new int[6];
int [] b=new int[6];
int [] e=new int[20];
int c,d,f,g,i,n=10,step,temp;
System.out.println("ENTER 1st ARRAY ELEMENTS");
for(c=0;c<5;c++)
{a[c]=sc.nextInt();}
System.out.println("ENTER 2nd ARRAY ELEMENTS");
for(d=0;d<5;d++)
{b[d]=sc.nextInt();}
for(f=0;f<5;f++){
e[f]=a[f];
}
for(g=5;g<10;g++){
e[g]=b[g-5];
}
for(step=0;step<n-1;++step)
for(i=0;i<n-step-1;++i)
{
if(e[i]<e[i+1])
{
temp=e[i];
e[i]=e[i+1];
e[i+1]=temp;
}}
System.out.println("ARRAY MERGED IN DESCENDING ORDER ARE");
for(i=0;i<n;++i)
System.out.print(e[i]+" ");
}}
