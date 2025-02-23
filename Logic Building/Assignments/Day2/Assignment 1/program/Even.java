import java.util.Scanner;

class Even{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number :");
        int n = input.nextInt();
	if(n%2 == 0){
		System.out.println(n+" is even number");
	}
	else{
		System.out.println(n+" is odd number");
	}
    }
}
