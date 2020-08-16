package assignment1;

public class MinElement {

	public static void main(String[] args) {
		
		int arr[] = {1,2,4,6,7,3,2};
		int min = arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]<min)
			{
				min = arr[i];
			}
		}
		System.out.println("minimum ele : "+min);
	}

}
