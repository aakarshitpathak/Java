
import java.util.*;

class buzz
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n= sc.nextInt();
        if (n/7==0 || n%10==7)
        {
       System.out.println("It is a buzz number");
    }
    else
    {
        System.out.println("It is not a buzz number");       
    }
}}