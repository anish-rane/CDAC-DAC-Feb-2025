import java.util.Scanner;
class Even1 {
	public static void main(String args[]){
		Scanner input= new Scanner(System.in);
		System.out.print("Enter the number: ");
		int num= input.nextInt();
		String result=((num&1)==0)?num+" is Even":" is Odd";
		System.out.println(result);
	}
}