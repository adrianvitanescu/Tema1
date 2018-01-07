package main.java.ro.sci.tema1;

/**
 * Exercise #8
 * Input 3 numbers, and display the biggest.
 */

public class BiggestNumber {

    public void displayBiggest(){
        int firstNumber = 8;
        int secondNumber = 5;
        int thirdNumber = 4;

        // Display the entered numbers
        System.out.println("Display the biggest: " + firstNumber + ", " +
                secondNumber + ", " + thirdNumber);

        /**
         * IF then ELSE IF control statements and AND (&&) operator
         * to verify condition to be true
         */
        if((firstNumber > secondNumber)&&(firstNumber > thirdNumber)){
            System.out.println("First number is the greatest: " + firstNumber + "\n");
        }else if((secondNumber > firstNumber)&&(secondNumber > thirdNumber)){
            System.out.println("Second number is the greatest: " + secondNumber + "\n");
        }else if((thirdNumber > firstNumber)&&(thirdNumber > secondNumber)){
            System.out.println("Third number is the greatest: " + thirdNumber + "\n");
        }else {
            System.out.println("Error, two or all of the entered numbers are equal!!!");
        }
    }
}
