import java.util.Scanner;

public class Prime{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        int c = 0;

        if (n <= 1) 
        {  
            c = 1;          } 
        else 
        {
            for (int i = 2; i <= n / 2; i++) 
            {  
                if (n % i == 0) 
                {
                    c = 1;
                                      
		}
            }
        }

        if (c == 0) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }
}
