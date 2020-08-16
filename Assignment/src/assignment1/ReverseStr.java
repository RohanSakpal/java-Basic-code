package assignment1;

import java.util.Scanner;

public class ReverseStr {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter test case : ");
		int t = sc.nextInt();
		while(t-->0)
		{
			System.out.println("Enter String : ");
			String str = sc.next();
			String reverseStr = "";
			
			for(int i=str.length()-1;i>=0;i--)
			{
				reverseStr = reverseStr + str.charAt(i);
			}
			System.out.println("Reverse str :  "+reverseStr);
		}
	}

}
