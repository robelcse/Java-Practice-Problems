package org.java.problems;

import java.util.ArrayList;

public class Problem04 {

    public static int findFactorialOfNumber(int number) {

        if (number == 0 || number == 1) {
            return 1;
        }

        int factorial = 1;
        for (int i = number; i >= 1; i--) {
            factorial *= i;
        }

        return factorial;
    }
}
