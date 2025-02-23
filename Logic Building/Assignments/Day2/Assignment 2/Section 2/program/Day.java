import java.util.Scanner;

class Day{
	public static void main(String args[]) {
        	Scanner input = new Scanner(System.in);
        	System.out.println("Enter the number(0-7): ");
        	int Day = input.nextInt();
		switch(Day){
			case 1:
				System.out.println("Today is Monday ,its  a weekday");
				break;
			case 2:
				System.out.println("Today is Tuesday ,its  a weekday");
				break;
			case 3:
				System.out.println("Today is Wednesday ,its  a weekday");
				break;
			case 4:
				System.out.println("Today is Thursday ,its  a weekday");
				break;
			case 5:
				System.out.println("Today is Friday ,its  a weekday");
				break;
			case 6:
				System.out.println("Today is Saturday ,its  a weekend");
				break;
			case 7:
				System.out.println("Today is Sunday ,its  a weekend");
				break;
			default:
				System.out.print("please make correct choice beetween 0 to 7");

		}
	}
}
