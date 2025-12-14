package org.java;

import org.java.problems.*;

import java.util.List;

public class Main {
    public static void main() {

        //solveProblem1();
        //solveProblem2();
        //solveProblem3();
        //solveProblem4();
        solveProblem5();

    }

    public static void solveProblem1() {

        int a = 10, b = 20;
        int sum = Problem01.addTwoNumber(a, b);
        System.out.println("Sum = " + sum);

    }

    public static void solveProblem2() {

        int a = 10, b = 20;
        Problem02.swapTwoNumbers(a, b);

    }

    public static void solveProblem3() {

        int decimalNumber = 11;
        Problem03.decimalToBinary(decimalNumber);
    }

    public static void solveProblem4() {

        int number = 5;
        int findFactorialOfNumber = Problem04.findFactorialOfNumber(number);
        System.out.println(findFactorialOfNumber);
    }

    public static void solveProblem5() {

        int number = 10;
        List<Integer> fibonacciNumberSeries = Problem05.fibonacciNumberSeries(number);
        System.out.println(fibonacciNumberSeries);
    }


}
