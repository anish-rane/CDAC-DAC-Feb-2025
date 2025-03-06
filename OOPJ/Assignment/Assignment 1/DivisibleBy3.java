public class DivisibleBy3 {
    public static boolean isDivisibleBy3(int n) {
       
        if (n < 0) {
            n = -n;
        }

        while (n > 9) {
            int sum = 0;

            while (n > 0) {
                sum = sum + (n & 1);
                n >>= 1;
            }

            n = sum;
        }
        return n == 0 || n == 3 || n == 6 || n == 9;
    }

    public static void main(String[] args) {
        int number = 27;
        if (isDivisibleBy3(number)) {
            System.out.println(number + " is divisible by 3.");
        } else {
            System.out.println(number + " is not divisible by 3.");
        }
    }
}
