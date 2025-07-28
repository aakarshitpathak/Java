import java.util.*;

class armstrong
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int n = sc.nextInt();
        int m = n;
        double sum=0;
        int r;
        while(m>0)
        {
            r = m%10;
            sum=sum + Math.pow(r,3);
            m/=10;
        }
        if(n==sum)
        {
            System.out.println("It is an armstrong number");
        }
        else
        {
            System.out.println("It is not an armstrong number");
        }
    }
}