import java.util.Scanner;

class StringPalindrome
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a String: ");
        String str = sc.nextLine();

        String rev = "";

        for(int i = str.length() - 1; i >= 0; i--)
			//This starts from the last character and moves toward the first
        {
            rev = rev + str.charAt(i);
        }

        if(str.equals(rev))
        {
            System.out.println(rev + " is a Palindrome");
        }
        else
        {
            System.out.println(rev + " is Not a Palindrome");
        }
    }
}