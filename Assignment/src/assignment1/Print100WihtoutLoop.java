package assignment1;

public class Print100WihtoutLoop {

	public static void main(String[] args) {
		
		print(1);
	}

	private static void print(int a) {
		
		if(a == 100)
		{
			System.out.println(a);
		} else {
			System.out.println(a);
			print(a+1);
		}
	}

}
