import java.util.Scanner;
class Check{
	public static void main(String args[]){
		Scanner input =new Scanner(System.in);
		System.out.println("Enter the number");
		int num= input.nextInt();
		if(num>=0 && (num%2)==0)
		{
			System.out.println("Condition mached");
		}
		else
		{
			System.out.println("Condition not mached");
		}
	}
}