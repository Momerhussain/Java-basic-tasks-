public class circuit
{
   public static void main(String args[])
   {
        
     long R1=15;
     long R2=12;
     long R3=20;
     long RT=R2+R3;
     float R=(R1*RT)/(RT+R1);
     System.out.println("Resistance in series"+RT);
     System.out.println("Equivalent Resistance"+R);
     
     }
}