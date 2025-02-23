class Pattern10{
    public static void main(String[] args) {
        int n = 5; // Number of rows

        for (int i = 1; i <= n; i++) {  
            int num = 1; // Start with 1
            for (int j = 1; j <= i; j++) {
                System.out.print(num);
                num += 2; // Increment by 2 to get odd numbers
                if (j < i) { // Print '*' between numbers
                    System.out.print("*");
                }
            }
            System.out.println(); // Move to the next line
        }
    }
}
