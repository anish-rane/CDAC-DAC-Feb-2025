import java.util.Scanner;

public class Average{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Three number: ");
        int a = scanner.nextInt(); 
	int b = scanner.nextInt();
	int c = scanner.nextInt();       
	double avg=(a+b+c)/3;
        System.out.println("The average of"+a+b+c+" number is " + avg);
    }
}
