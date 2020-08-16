package assignment1;

public class MaxElement {

	public static void main(String[] args) {
		
		int arr[] = {1,2,4,6,7,3,2};
		int max = 0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max = arr[i];
			}
		}
		System.out.println("maximum value : "+max);
	}

}
