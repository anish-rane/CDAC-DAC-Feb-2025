class Relational{
	public static void main(String args[]){
		int a=10;
		int b=20;
		int c=30;
		int d=30;
		
		boolean GT = b > a;           
        boolean LT = a < b;             
        boolean ET = c == d;              
        boolean NET = a != b;           
        boolean GOE = b >= a;       
        boolean LOE = a <= b;
		
		System.out.println("Numbers are a:"+a+ ",b=" +b+ ",c=" +c+ ",d=" +d);
		System.out.println("b > a: "+GT);
		System.out.println("a < b: "+LT);
		System.out.println("c == d: "+ ET);
		System.out.println("a != b: "+NET);
		System.out.println("b >= a: "+GOE);
		System.out.println("a <= b: "+LOE);
	}
}