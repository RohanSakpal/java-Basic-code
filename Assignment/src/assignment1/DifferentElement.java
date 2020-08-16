package assignment1;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class DifferentElement {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter test case");
		int t = sc.nextInt();
		while(t-->0)
		{
			System.out.println("Enter no. of ele");
			int n = sc.nextInt();
			int arr[] = new int[n];
			System.out.println("Enter element: ");
			for(int i=0;i<n;i++)
			{
				arr[i] = sc.nextInt();
			}
			 System.out.println("Array: "+ Arrays.toString(arr)); 
			
			int count = 0;
			HashSet<Integer> hs = new HashSet<Integer>();
			 for (int t1 : arr) { 
		           if(!hs.contains(t1)) {
		        	  hs.add(t1);
		           	  count++;
		           } else {
		        	   count--;
		           }   
		        } 
			 System.out.println(count+" Unique element.");
		}
	}

}
