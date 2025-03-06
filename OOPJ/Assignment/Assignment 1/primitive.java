class Primitive {
    
    byte a;
    short b;
    int c;
    long d;
    float e;
    double f;
    char g;
    boolean h;

    public static void main(String[] args) {
        
        Primitive obj = new Primitive();

        System.out.println("Default Values:");
        System.out.println("byte: " + obj.a);
        System.out.println("short: " + obj.b);
        System.out.println("int: " + obj.c);
        System.out.println("long: " + obj.d);
        System.out.println("float: " + obj.e);
        System.out.println("double: " + obj.f);
        System.out.println("char: [" + obj.g + "]"); 
        System.out.println("boolean: " + obj.h);

        System.out.println("\nAfter Assigning Values:");

        byte a = 10;
        short b = 20;
        int c = 30;
        long d = 40L;
        float e = 50.5f;
        double f = 60.6;
        char g = 'A';
        boolean h = true;

        System.out.println("byte: " + a);
        System.out.println("short: " + b);
        System.out.println("int: " + c);
        System.out.println("long: " + d);
        System.out.println("float: " + e);
        System.out.println("double: " + f);
        System.out.println("char: " + g);
        System.out.println("boolean: " + h);
    }
}
