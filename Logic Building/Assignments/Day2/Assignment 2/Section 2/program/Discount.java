import java.util.Scanner;

class Discount{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Total price: ");
        double p = input.nextDouble();
	double d;
	System.out.println("Total price before discount: "+ p);
	if(p>=1000)
	{
		d=0.2*p;
		p=p-d;
		System.out.println("After applying 20% discount, total price: "+ p);
	}
	else if (p >= 500)
	{
		d=0.1*p;
		p=p-d;
		System.out.println("After applying 10% discount, total price: "+ p);

	}
	else
	{
		d=0.05*p;
		p=p-d;
		System.out.println("After applying 5% discount, total price: "+ p);

	}
	System.out.println("Do you have Membership card (y/n): ");
	char card=input.next().charAt(0);
	if(card=='y')
	{
		d=0.05*p;
		p=p-d;
		System.out.println("After applying membership card additional 5% discount, total price: "+ p);
	}
	else
	{
		System.out.println("As you have no Membership card 5% discount will not be applied, so total price: "+ p);
	}	
    }
}
