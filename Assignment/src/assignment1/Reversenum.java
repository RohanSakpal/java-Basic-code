package assignment1;

import java.util.Scanner;

public class Reversenum {

	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter test case");
		int t = sc.nextInt();
		while(t-->0)
		{
			System.out.println("Enter a num");
			int num  = sc.nextInt();
			int originalNum = num;
			int rev = 0;
			while(num>0)
			{
				int n1 = num % 10;
				rev = n1 + rev*10;
				num = num/10;
			}
			
			if(originalNum == rev)
			{
				System.out.println("num is palindrome");
			} else {
				System.out.println("num is not palindrome");
			}
		}
	}

}
