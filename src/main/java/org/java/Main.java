package org.java;

import org.java.problems.Problem01;
import org.java.problems.Problem02;
import org.java.problems.Problem03;
import org.java.problems.Problem04;

public class Main {
    public static void main() {

        //solveProblem1();
        //solveProblem2();
        //solveProblem3();
        solveProblem4();

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


}
