class Student{
	String Name;
	int M1;
	int M2;
	int M3;
	void assign(String Name,int M1,int M2,int M3){
		this.Name=Name;
		this.M1=M1;
		this.M2=M2;
		this.M3=M3;
	}
	int computeTotal(){
		return M1+M2+M3;
	}
	double computeAvg(){
		return computeTotal()/3.0;
	}
	void display(){
		System.out.println("Name: "+Name);
		System.out.println("Total Marks: "+computeTotal());
		System.out.println("Average Marks: "+computeAvg());
	}
	public static void main(String[] args){
		Student s=new Student();
		s.assign("Bob",99,98,50);
		s.display();
		
	}
}