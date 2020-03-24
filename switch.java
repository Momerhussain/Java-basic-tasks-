import java.util.Scanner;
public class  switch
{  
    public static void main(String[] args)
   {
     int a,b,c,d;
     
     Scanner inp=new Scanner(System.in);
     System.out.println("for even number  press 1");
     System.out.println("for odd  number   press 2");
     System.out.println("for prime number press 3");
     a=inp.nextInt();    
     switch(a)
     { 
       case 1:
       System.out.print("enter number");
       b=inp.nextInt();
       if(b%2==0)
       System.out.print("this is even number");
       else
       System.out.print("this is not even number");
       break;
       case 2:
       System.out.print("Enter number=");
       c=inp.nextInt();
       if(c%2!=0)
       System.out.print("this is odd number");
       else
       System.out.print("this is not an odd number");
       break; 
       case 3:
       System.out.print("Enter number=");
       d=inp.nextInt();     
          
          
     }




}
 }