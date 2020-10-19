package com.craig;

public class Main {

    public static void main(String[] args) {

        //Solution 1
        System.out.println("solution 1");
        FizzBuzzer.getInstance().doFizzBuzz();

        System.out.println("solution 2");
        System.out.println( ReverseStringCheck.getInstance().isReverse("abc","cba"));

        System.out.println("solution 3");
        Square square = new Square(5);
        System.out.println("A square with " + square.getSide() + " length sides has perimeter of " +square.perimeter() + " and an area of " + square.area());

        System.out.println("solution 4");
        System.out.println(RecursiveFibonacci.getInstance().getFibonacci(4));

        System.out.println("solution 5");
        PrimeNumberPrinter numberPrinter = new PrimeNumberPrinter(1,100);
        numberPrinter.printOutPrimeNumbers();
    }
}
