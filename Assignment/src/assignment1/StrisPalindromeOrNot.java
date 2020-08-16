package assignment1;

import java.util.Scanner;

public class StrisPalindromeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter test case : ");
		int t = sc.nextInt();
		while(t-->0)
		{
			System.out.println("Enter String : ");
			String str = sc.next();
			
			String newStr = "";
			for(int i=str.length()-1;i>0;i--)
			{
				newStr = newStr + str.charAt(i);
			}
			
			if(str.equals(newStr))
			{
				System.out.println("Str is Palindrome.");
			}
			else
			{
				System.out.println("Str iis not Palindrome.");
			}
		}
	}

}
