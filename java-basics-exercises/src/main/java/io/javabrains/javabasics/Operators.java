package io.javabrains.javabasics;

public class Operators {
    public static void main(String[] args) {
        // Step 1: Declare variables
        int a=1,b=2;

        // Step 2: Perform arithmetic operations
        int sum=a+b;

        // Step 3: Print the results of the arithmetic operations
        System.out.println("sum = " + sum);

        // Step 4: Perform increment and decrement operations
        a++;
        b--;

        // Step 5: Print the results of the increment and decrement operations
        System.out.println("sum = " + sum);

        // Step 6: Perform comparison operations
        boolean isbGreater= b>a;

        // Step 7: Print the results of the comparison operations
        System.out.println("isbGreater = " + isbGreater);

        // Step 8: Perform logical operations
        boolean isAGreater= a>b;
        boolean isAlwaysFalse = !isAGreater && !isbGreater;

        // Step 9: Print the results of the logical operations
        System.out.println("isAlwaysFalse = " + isAlwaysFalse);

    }
}
