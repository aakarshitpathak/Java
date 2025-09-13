import java.util.*;

class statvar
{
    static int StaticSum(int x,int y)
    {
     return(x+y); 
    }
}
class StaticMain
{
 public static void  main (String args[])
 {
     int Result = statvar.StaticSum(10,20);
     System.out.println("Result"+ Result);
 }
}