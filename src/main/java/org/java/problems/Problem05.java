package org.java.problems;

import java.util.ArrayList;
import java.util.List;

public class Problem05 {

    public static List<Integer> fibonacciNumberSeries(int number) {


        ArrayList<Integer> lisOfFibonacciNumber = new ArrayList<Integer>();
        int firstFibonacciNumber;
        int secondFibonacciNumber;

        for (int i = 0; i <= number; i++) {
            if (i == 0) {
                lisOfFibonacciNumber.add(0);
            } else if (i == 1) {
                lisOfFibonacciNumber.add(1);
            } else {

                int x = i - 2;
                int y = i - 1;
                int firstNumber = lisOfFibonacciNumber.get(x);
                int secondNumber = lisOfFibonacciNumber.get(y);
                lisOfFibonacciNumber.add(firstNumber + secondNumber);
            }

        }

       return lisOfFibonacciNumber;
    }
}
