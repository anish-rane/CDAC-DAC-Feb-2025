import java.util.Scanner;

class Swap{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers:");
        int a = input.nextInt();
        int b = input.nextInt();
	System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}
