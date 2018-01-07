package main.java.ro.sci.tema1;

/**
 * Exercise #7
 *  Input the length of the side of a square, and display its area.
 *  Produce an error message if the length is negative
 */

public class Square {

    public void lengthOfSquare(){
        int length = 45; // Variable length with a value
        int area; // Variable area

        /**
         * IF statement control flow, tells the program
         * witch way to go
         */
        if (length <= 0) {
            System.out.println("Error of data input");
        } else {
            area = length * length;

            //Display the result
            System.out.println("Area of square with L = " + length +
                                    " m, is: " + area + " mp" + "\n");
        }
    }
}
