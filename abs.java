abstract class  Y
{


	abstract void mull(int a,int b);
	
}


abstract class X extends Y
{
        abstract void add(int a,int b); 
	abstract void sub(int a,int b);
	

}


class A extends X
{
	void add(int a,int b)
        {
	  int c=a+b;	
          System.out.println("Addition is:"+c);
	}
	
        void sub(int a,int b)
        {
          int c=a-b;     
          System.out.println("Subtraction is:"+c);
	}
	void mull(int a,int b)
        {
	int c=a*b;
   	System.out.println("Multiplication is:"+c);
	}

}
public class abs
{
      public static void main (String[] args)
      {

	
	A obj1 = new A();
        obj1.add(10,10);	
	obj1.sub(100,50); 
	obj1.mull(6,9); 
	
      }
}
