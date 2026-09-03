import java.util.Scanner;
//For each one execution of the outer loop, the entire inner loop runs.
class NestedLoop2
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter starting number: ");
        int start = s.nextInt();

        System.out.println("Enter ending number: ");
        int end = s.nextInt();

        // Prime numbers
        System.out.println("Prime Numbers:");

        for(int i = start; i <= end; i++)
        {
            int count = 0;

            for(int j = 1; j <= i; j++)
            {
                if(i % j == 0)
                {
                    count++;
                }
            }

            if(count == 2)
            {
                System.out.println(i);
            }
        }

        // Reverse numbers
        System.out.println("Reverse Numbers:");

        for(int i = start; i <= end; i++)
        {
            int n = i;
            int rev = 0;

            while(n > 0)
            {
                int rem = n % 10;
                rev = rev * 10 + rem;
                n = n / 10;
            }

            System.out.println(i + " = " + rev);
        }
    }
}