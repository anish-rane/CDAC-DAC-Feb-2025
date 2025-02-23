public class Incriment{
	public static void main(String[] args) {
		int i = 5;
        	int result = ++i - i--;
        	System.out.println("Initial value of i: 5");
        	System.out.println("Value after pre-increment (++i): " + (i + 1));
        	System.out.println("Value after post-decrement (i--): " + i);
        	System.out.println("Result of the expression (++i - i--): " + result);
        	System.out.println("Final value of i: " + i);	        
	}
}
