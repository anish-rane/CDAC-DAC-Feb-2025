import java.util.Scanner;
class Basic{
	public static void main(String args[]){	
		Scanner input = new Scanner(System.in);	
		int a,b,add,sub,mult,div,rem;
		System.out.println("Enter two number");
		a = input.nextInt();
		b = input.nextInt();
		add=a+b;
		sub=a-b;
		mult= a*b;
		div= a/b;
		rem= a%b;
		System.out.println(a+ " + " + b +"= "+ add);
		System.out.println(a+ " - " + b +"= "+ sub);
		System.out.println(a+ " x " + b +"= "+ mult);
		System.out.println(a+ " / " + b +"= "+ div);
		System.out.println(a+ " mod " + b +"= "+ rem);
	}
}
