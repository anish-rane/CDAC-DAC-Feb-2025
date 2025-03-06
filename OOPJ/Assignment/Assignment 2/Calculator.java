import java.util.Scanner;
class Calculator{
	public static void main(String args[]){
		Scanner input= new Scanner(System.in);
		System.out.println("Enter two number: ");
		int a= input.nextInt();
		int b= input.nextInt();
		System.out.println("Enter the oprator(  +  ,  -  ,  *  ,  /  ) : ");
		char o=input.next().charAt(0);
		switch(o)
		{
			case '+':
				int sum = a+b;
				System.out.println(a+"+"+b+"="+sum);
				break;
			case '-':
				int sub = a-b;
				System.out.println(a+"-"+b+"="+sub);
				break;
			case '*':
				int mul = a*b;
				System.out.println(a+"*"+b+"="+mul);
				break;
			case '/':
				double div = a/b;
				System.out.println(a+"/"+b+"="+div);
				break;
			default:
				System.out.println("Error! Enter valid operator!!");
		}
	}
}