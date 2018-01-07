package main.java.ro.sci.tema1;

/**
 * Exercises #9.
 * Input 2 values:  start  and  finish,
 * then display the numbers from start to finish
 */

public class StartEndNumbers {

    public void displayNumbers() {
        int startNumber = 3; // Variable, point to start by introducing a value
        int endNumber = 9; // Variable, end point by introducing a value

        /**
         * IF statement control flow, tells the program
         * witch way to go
         */
        if(startNumber < endNumber){
            System.out.println("Ascending numbers from: " + startNumber +
                    " to " + endNumber + " are:");
        }else{
            System.out.println("Descending numbers from: " + startNumber +
                    " to " + endNumber + " are:");
        }

        /**
         * FOR statement iterate over a range of values
         * until a particular condition is satisfied
         */
        for (int i = startNumber; i <= endNumber; i++) {
            System.out.print(i + ", ");
        }
        for (int i = startNumber; i >= endNumber; i--) {
            System.out.print(i + ", ");
        }
    }
}
