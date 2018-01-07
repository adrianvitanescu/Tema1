package main.java.ro.sci.tema1;

/**
 * Exercise #3
 * Display the max digit from a number. Read the number from keyboard
 */

class Palindrome {

    public void palindrome(){
        int number = 1221;
        int r;
        int sum = 0;
        int temp = number;

        // Display the number to be verified
        System.out.println("Check if number: " + number + " is palindrome");

        //While loop evaluate and reverse the entered number
        while (number > 0) {
            r = number % 10;
            sum = (sum * 10) + r;
            number = number / 10;
        }

        /**
         * IF equality operator is true (temp == sum) display a positive answer
         * if is not become false
         */
        if (temp == sum) {
            System.out.println("Number is palindrome" + "\n");
        } else {
            System.out.println("Number is not palindrome" + "\n");
        }
    }
}
