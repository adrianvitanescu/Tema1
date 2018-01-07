package main.java.ro.sci.tema1;

/**
 * Exercises #1
 * Calculate the sum of the first 100 numbers higher than 0
 */

class SumOfOneHundred {

    /**
     * This is a method for sum of the first 100 numbers
     */
    public void sumOfOneHundred() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum = sum + i;
        }

        //Display the result
        System.out.println("Sum of first 100 numbers is: " + sum + "\n");
    }


}
