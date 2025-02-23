import java.util.Scanner;
public class Factorial{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number to find factorial: ");
        int num = input.nextInt();
        int fact=1;
        for(int i=1;i<=num;i++)
        {
            fact=fact*i;
        }
        System.out.println(fact + " is the factorail of the number " + num);
    }
}