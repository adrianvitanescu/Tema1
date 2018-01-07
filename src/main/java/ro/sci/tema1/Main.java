package main.java.ro.sci.tema1;

public class Main {

    public static void main(String[] args) {

        SumOfOneHundred sum = new SumOfOneHundred();
        System.out.println("\033[33;1mExercise #1\033[0m");
        sum.sumOfOneHundred();

        SmallestNumber small = new SmallestNumber();
        System.out.println("\033[33;1mExercise #2\033[0m");
        small.smallestNumber();

        MaxDigit max = new MaxDigit();
        System.out.println("\033[33;1mExercise #3\033[0m");
        max.maxDigit();

        Palindrome reversalNumbers = new Palindrome();
        System.out.println("\033[33;1mExercise #4\033[0m");
        reversalNumbers.palindrome();

        PrimeNumbers prime = new PrimeNumbers();
        System.out.println("\033[33;1mExercise #5\033[0m");
        prime.PrimeNumbers();

        Rectangle rectangle = new Rectangle();
        System.out.println("\n\n" + "\033[33;1mExercise #6\033[0m");
        rectangle.rectanglePerimeterAndArea();

        Square areaSquare = new Square();
        System.out.println("\033[33;1mExercise #7\033[0m");
        areaSquare.lengthOfSquare();

        BiggestNumber biggest = new BiggestNumber();
        System.out.println("\033[33;1mExercise #8\033[0m");
        biggest.displayBiggest();

        StartEndNumbers chromatic = new StartEndNumbers();
        System.out.println("\033[33;1mExercise #9\033[0m");
        chromatic.displayNumbers();
    }
}

