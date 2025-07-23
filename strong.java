public class strong {

    // Function to calculate the factorial of a number
    public static int calculateFactorial(int n) {
        if (n == 0) {
            return 1; // Factorial of 0 is 1
        }
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    // Function to check if a number is a strong number
    public static boolean isStrongNumber(int number) {
        int originalNumber = number;
        int sumOfFactorials = 0;
        int tempNumber = number;

        while (tempNumber > 0) {
            int digit = tempNumber % 10; // Get the last digit
            sumOfFactorials += calculateFactorial(digit); // Add factorial of the digit to sum
            tempNumber /= 10; // Remove the last digit
        }

        return sumOfFactorials == originalNumber;
    }

    public static void main(String[] args) {
        System.out.println("Strong numbers between 1 and 5000 are:");
        for (int i = 1; i <= 5000; i++) {
            if (isStrongNumber(i)) {
                System.out.println(i);
            }
        }
    }
}