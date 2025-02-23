public class Prime {
    public static void main(String[] args) {
        System.out.println("First 5 prime numbers are:");
        int n = 2;
        int count = 0;

        while (count < 5) { 
            int c = 0;

            for (int i = 2; i < n; i++) {  
                if (n % i == 0) {  
                    c++;
                    break;  
                }
            }

            if (c == 0) { 
                System.out.print(n+",");
                count++;
            }
            
            n++; 
        }
    }
}
