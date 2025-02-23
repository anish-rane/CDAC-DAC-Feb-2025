class Largest{
    public static void main(String args[]) {
        int a = 20;
	int b=30;
	int c=40;
	System.out.println("The three numbers are: "+a+","+b+","+c);
	if(a>b && b>c)
	{
		System.out.println(a+ " Is the largest number");
	}
	else if(a<b && b>c)
	{
		System.out.println(b+ " Is the largest number");
	}
	else
	{
		System.out.println(c+ " Is the largest number");
	}
    }
}
