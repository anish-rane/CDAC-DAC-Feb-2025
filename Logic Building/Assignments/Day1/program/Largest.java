import java.util.Scanner;

class Largest{
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter three numbers");
        int a= input.nextInt();
        int b= input.nextInt();
        int c= input.nextInt();
        if(a>b && b>c)
        {
            System.out.println(a+" is the greatest");
        }
        else if(a<b && b>c)
        {
            System.out.println(b+" is the greatest");
        }
        else
        {
            System.out.println(c+" is the greatest");
        }
    }
}
