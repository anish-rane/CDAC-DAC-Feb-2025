import java.util.Scanner;
class Increments {
	public static void main(String args[]){
		System.out.println("Enter the number:");
		Scanner input= new Scanner(System.in);
		int a= input.nextInt();
		System.out.println("Number befor incriment:"+a);
		a=-(~a);
		System.out.println("Number after incriment:"+a);
	}
}