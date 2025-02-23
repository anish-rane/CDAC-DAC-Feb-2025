class Pattern6 {
    public static void main(String args[]) {
        int n = 5; // Number of rows

        for (int i = n; i >= 1; i--) {  
            // Print spaces for centering
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Print stars
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println(); // Move to the next line
        }
    }
}
