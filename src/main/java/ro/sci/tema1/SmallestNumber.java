package main.java.ro.sci.tema1;

import java.util.Arrays;

/**
 * Exercise #2
 * Display the smallest number from a collections of numbers
 */

public class SmallestNumber {

    /**
     * This is a method to display the smallest number from an array list
     */
    public void smallestNumber(){
        int[] intArray = {3, 5, 9, 11};
        int min = Integer.MAX_VALUE;

        // Display the collection, converted to String
        System.out.println(Arrays.toString(intArray));

        /**
         * FOR statement iterate over a range of values
         * until a particular condition is satisfied
         */
        for (int i = 0; i < intArray.length; i++) {
            if (min > intArray[i]){
                min = intArray[i];
            }
        }

        //Display the result
        System.out.println("The smallest number from collection is: " + min + "\n");
    }
}
