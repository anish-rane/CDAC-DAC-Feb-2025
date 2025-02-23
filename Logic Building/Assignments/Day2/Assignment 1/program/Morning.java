import java.util.Scanner;
class Morning {
    public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
        System.out.println("Enter the time in 24 hourls format in hour :");
        int hour = input.nextInt();                 
	if (hour >= 5 && hour < 12) 
	{
            System.out.println("Good Morning!");
        }
    }
}
