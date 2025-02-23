import java.util.Scanner;

class Grade{
	public static void main(String args[]) {
        	Scanner input = new Scanner(System.in);
        	int a;
        	System.out.println("Enter the marks of the student: ");
        	a = input.nextInt();
		if(a>=90)
		{
			System.out.println("Student Scored A grade");
		}
		else if(a>=80)
		{
			System.out.println("Student Scored B grade");
		}
		else if(a>=70)
		{
			System.out.println("Student Scored C grade");
		}
		else if(a>=60)
		{
			System.out.println("Student Scored D grade");
		}
		else
		{
			System.out.println("Student Scored F grade");
		}

	}
}