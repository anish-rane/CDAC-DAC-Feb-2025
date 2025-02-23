import java.util.Scanner;
class Multiply{
	public static void main(String args[]){	
		Scanner input = new Scanner(System.in);	
		int a,b,mult;
		System.out.println("Enter two number");
		a = input.nextInt();
		b = input.nextInt();
		mult= a*b;
		System.out.println("25 x 5 = "+ mult);
	}
}
