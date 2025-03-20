import java.util.*;
class BMICalculator{
	double height;
	double weight;
	BMICalculator(double height,double weight){
		this.height=height;
		this.weight=weight;
	}
	double calculateBMI(){
		return weight / (height * height);
	}
}
class BMICalculatorDemo {
	public static void main(String[] args){
		Scanner input= new Scanner(System.in);
		System.out.println("Enter Height: ");
		double height=input.nextDouble();
		System.out.println("Enter Weight: ");
		double weight=input.nextDouble();
		
		System.out.print("BMI is: "+calculateBMI)
	}
}
