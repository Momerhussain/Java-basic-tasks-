public class hexa
{
     public static void main(String args[])
     {
              
      char a[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
      
      int b=1234;
      int hex=16;
      int d;
      int rem1;
      int rem2;
      rem1=1234%16; 
      rem2=72%16;
      d=72/16;
      System.out.println("1st remender is"+rem1);      
      System.out.println("2nd remender is"+rem2);      
      System.out.println("last remender is"+d);
      System.out.println("After convert decimal into hexdecemial"+(d)+(rem2)+(rem1));  
     
}
   

}