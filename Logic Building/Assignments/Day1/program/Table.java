import java.util.Scanner;
class Table{
	public static void main(String args[]){	
		Scanner input = new Scanner(System.in);	
		int a,mult;
		System.out.println("Enter the number");
		a = input.nextInt();
		for(int i=1; i<=10; i++){
			mult=a*i;
			System.out.println(a+ " x " + i +"= "+ mult);
		}
		
	}
}
