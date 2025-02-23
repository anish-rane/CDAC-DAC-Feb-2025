import java.util.Scanner;

public class Counter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = input.nextInt();
        int count = 0;
        int temp = number; 
        while (number != 0) {
            number /= 10;
            count++;
        }
        System.out.println("The number " + temp + " has " + count + " digits");
    }
}
