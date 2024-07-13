import java.util.Scanner ;

public class Tdd
{
	public static void main(String... args)
	{
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the number");
		int number = scan.nextInt() ;
		
		boolean isPalindrome = Palindrome(number);
		
		System.out.println(isPalindrome);
	}
	
	public static boolean Palindrome(int number)
	{
		String num = Integer.toString(number);
		
		String reversed = new StringBuilder(num).reverse().toString();
		
		if(num.equals(reversed))
		{
			return true ;
		}
		else
		{
			return false ;
		}
	}
}