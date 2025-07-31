import java.util.*;

class palindrome
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int m = n;
        double rev=0;
        int r;
        while(m>0)
        {
            r = m%10;
            rev=rev*10 + r;
            m/=10;
        }
        if(n==rev)
        {
            System.out.println("It is a palindrome number");
        }
        else
        {
            System.out.println("It is not a palindrome number");
        }
    }
}