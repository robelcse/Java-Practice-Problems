package org.java.problems;

public class Problem02 {

    public static void swapTwoNumbers(int a, int b){


        System.out.println("Before swapping:");
        System.out.println("a = "+a+", b = "+b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping:");
        System.out.println("a = "+a+", b = "+b);
    }
}
