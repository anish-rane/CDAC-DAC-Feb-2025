class Box{
	int height;
	int width;
	int breadth;
	
	Box(int height,int width,int breadth){
		this.height = height;
		this.width = width;
		this.breadth = breadth;
	}
	double getVolume(){
		return height*width*breadth;
	}
	double getArea(){
		double Area= 2*((height * width) + (height * breadth) + (width * breadth));
		return Area;
	}
	public static void main(String[] args){
		Box B1= new Box(12,21,33);
		Box B2= new Box(71,5,4);
		System.out.println("Volume of Box 1: "+B1.getVolume());
		System.out.println("Area of Box1: "+B1.getArea());
		System.out.println("---------------------------------");
		System.out.println("Volume of Box 2: "+B2.getVolume());
		System.out.println("Area of Box 2: "+B2.getArea());
	}
}