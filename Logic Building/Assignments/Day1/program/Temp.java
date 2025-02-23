import java.util.Scanner;
public class Temp{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the temperature in celsius: ");
        int celsius = input.nextInt();
        double fahrenheit=(celsius*9/5)+32;
	System.out.print(celsius+ " C = "+ fahrenheit +"F");
	} 
}
