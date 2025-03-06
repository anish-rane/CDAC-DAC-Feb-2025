import java.util.Scanner;
class AssignmentOperators {
    public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter two number");
        int num1 = input.nextInt();
		int num2 = input.nextInt();
        System.out.println("Initial value of num1: " + num1);
        System.out.println("Initial value of num2: " + num2);
		
        num1 += num2;
        System.out.println("After "+ num1+ " += "+num2+" : " + num1);

        num1 -= num2;
        System.out.println("After "+ num1 +" -= "+num2+" : " + num1);

        num1 *= num2;
        System.out.println("After "+ num1+ "*= " +num2+" : " + num1);

        num1 /= num2;
        System.out.println("After "+ num1+ " /= "+num2+" : " + num1);

        num1 %= num2;
        System.out.println("After "+num1+ " %= " +num2+" : " + num1);
    }
}
