import java.util.Scanner;

class Calculator{
	public static void main(String args[]) {
        	Scanner input = new Scanner(System.in);
        	System.out.println("Enter two number: ");
        	double a = input.nextDouble();
		double b = input.nextDouble();
		double c;
		System.out.println("Enter the operator (+,-,*,/): ");
        	char o = input.next().charAt(0);
		switch(o){
			case '+':
				c=a+b;
				System.out.println(a+" + "+b+" = "+c);
				break;
			case '-':
				c=a-b;
				System.out.println(a+" - "+b+" = "+c);
				break;
			case '*':
				c=a*b;
				System.out.println(a+" * "+b+" = "+c);
				break;
			case '/':
				if(b==0)
				{
					System.out.println("Error: you are trying to divide by zero use number other than zero");
				}
				else
				{
					c=a/b;
					System.out.println(a+" / "+b+" = "+c);
				}
				break;
			default:
				System.out.print("please make correct choice");

		}
	}
}
