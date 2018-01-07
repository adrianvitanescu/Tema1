package main.java.ro.sci.tema1;

/**
 * Exercise #5
 *  Display all the prime numbers lower than a given number
 */

public class PrimeNumbers {

    public void PrimeNumbers() {
        int number = 45; //Give a value / number

        //Display the entered number
        System.out.println("The prime numbers until of " + number + " are: ");

        //FOR statement iterate over a range of value
        for (int i = 2; i <= number; i++) {
            if (isPrime(i)) {
                System.out.print(i + ", "); // Display the prime numbers
            }
        }
    }

    /**
     * @param n evaluates each numbers starting with 2 and verify condition
     * @return return true or false depending the condition
     */
    public static boolean isPrime(int n) {
        if (n == 1) {
            return false;
        }
        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
