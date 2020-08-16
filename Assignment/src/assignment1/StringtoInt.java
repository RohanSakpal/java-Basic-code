package assignment1;

import java.util.Scanner;

public class StringtoInt {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter string");
		String str = sc.next();
		
		int num = Integer.parseInt(str);
		System.out.println("number = "+num);
	}

}
