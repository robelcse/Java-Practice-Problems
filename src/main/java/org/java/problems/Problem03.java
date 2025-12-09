package org.java.problems;

import java.util.ArrayList;

public class Problem03 {

    public static void decimalToBinary(int number) {

        int reminder;
        ArrayList<Integer> binaryNumber = new ArrayList<>();

        while (number > 0) {
            reminder = number % 2;
            number /= 2;
            binaryNumber.add(reminder);
        }
        for (int i = binaryNumber.size() - 1; i >= 0; i--) {
            System.out.print(binaryNumber.get(i));
        }
    }
}
