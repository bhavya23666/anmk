public class primenumbers {

    public static void main(String[] args) {
        System.out.println("Prime numbers from 1 to 100 are:");

        // Loop through numbers from 2 to 100
        for (int i = 2; i <= 100; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        // Numbers less than 2 are not prime
        if (num < 2) {
            return false;
        }
        // Check for divisibility from 2 up to the square root of the number
        // This optimizes the check as any factor greater than the square root
        // would have a corresponding smaller factor already found.
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false; // Not prime if divisible
            }
        }
        return true; // Prime if no divisors found
    }
}