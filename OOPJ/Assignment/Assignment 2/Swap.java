class Swap{
	public static void main(String args[]){
		int a= 20;
		int b= 30;
		System.out.println("Before swap a: "+a+" b: "+b);
		a=a^b;
		b=b^a;
		a=a^b;
		System.out.println("After swap a: "+a+" b: "+b);
	}
}