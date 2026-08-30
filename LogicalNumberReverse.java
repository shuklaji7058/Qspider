import java.util.*;

class LogicalNumberReverse
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter start number:");
        int start = s.nextInt();

        System.out.println("Enter end number:");
        int end = s.nextInt();

        System.out.println("Reverse numbers in the range " + start + " to " + end + ":");

        for(int i = start; i <= end; i++)
        {
            System.out.println(i + " -> " + reverse(i));
        }
    }

    public static int reverse(int n)
    {
        int rev = 0;

        while(n != 0)
        {
            int rem = n % 10;
            rev = rev * 10 + rem;
            n = n / 10;
        }

        return rev;
    }
}