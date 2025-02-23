import java.util.Scanner;

class Pass{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int a, b, c;
        System.out.println("Enter three subject marks");
        a = input.nextInt();
        b = input.nextInt();
	c = input.nextInt();
        int f=0;
	if(a<40)
	{
		f=f+1;
	}
	if(b<40)
	{
		f=f+1;
	}
	if(c<40)
	{
		f=f+1;
	}
	switch(f){
		case 1:
			System.out.println("Student Failed in 1 subject");
			break;
		case 2 :
			System.out.println("Student Failed in 2 subject");
			break;
		case 3 :
			System.out.println("Student Failed in 3 subject");
			break;
		default:
			System.out.println("Student Passed in all subject");
			break;
	}
    }
}
