package main.java.ro.sci.tema1;

/**
 * Exercise #6
 * Input the dimensions of a rectangle and display area and perimeter
 */

 class Rectangle {

     public void rectanglePerimeterAndArea() {
        int length = 54; // Variable length with a value
        int width = 12; // Variable width with a value
        int area = 0;
        int perimeter = 0;

        //Display the value of length / width
        System.out.println("Rectangle length: " + length + " m, width: " + width + " m");

         /**
          * IF statement tells the program to execute this section of code
          * only if this test evaluates to true
          */
         if ((length > 0) && (width > 0)) { // Condition for length/width to have a positive value
            area = length * width;
            perimeter = 2 * (length + width);
        }

        // Display the result of Area and Perimeter
        System.out.println("Area: " + length + " * " + width + " = " + area + " mp");
        System.out.println("Perimeter: 2(" + length + " + " + width + ") = " + perimeter + " m" + "\n");
    }
}
