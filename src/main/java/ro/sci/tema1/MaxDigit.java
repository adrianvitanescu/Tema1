package main.java.ro.sci.tema1;

/**
 * Exercise #3
 * Display the max digit from a number. Read the number from keyboard
 */

class MaxDigit {

    public void maxDigit(){
        int number = 5684;
        int max = 0;
        int r;

        // Display the entered number
        System.out.println("Extract the highest digit from: " + number);

        /**
         * While statements it repeats and control expression
         * until becomes true
         */
        while (number > 0){
            r = number % 10;
            number = number/10;
            if (r > max){
                max = r;
            }
        }
        System.out.println("The max digit from the entered number is: " + max + "\n");
    }
}
