import java.util.Scanner;
class Check{
	public static void main(String args[]){
		Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        String result = ((n & 1) == 0) ? n + " is even." : n + " is odd.";
        System.out.println(result);
	}
}