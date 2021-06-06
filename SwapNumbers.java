
public class SwapNumbers {
	public static void main(String[] args) {
		int first = 100, second = 200;
		
		System.out.println("--Before Swap--");
		System.out.println("First Number :" + first);
		System.out.println("Second Number:"  +second);
		
		
	first = first - second;
	second = second + first;
	first = first - second;
	
	System.out.println("--Before Swap--");
	System.out.println("First Number :" + first);
	System.out.println("Second Number:" + second);
	}

}
