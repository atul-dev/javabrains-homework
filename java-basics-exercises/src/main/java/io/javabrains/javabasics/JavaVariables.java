package io.javabrains.javabasics;

public class JavaVariables {

    public static void main(String[] args) {
       // int variable to store a int value

        int a=7;
        // long variable to store a long value
        long b=8;
        // float variable to store a floating-point value
        float c=6.5f;


        // double variable to store a double value
        double d=2.4;

        // char variable to store a single character
        char character='c';

        // boolean variable to store a boolean value
        boolean f=false;

        // String variable to store a string of characters
        String g="hello";

        // Step 2: Print the values of the variables to the console

        System.out.println("int a = "+a+" "+"long b = "+b+" "+" float c = "+c+" "+" double d = "+d+"  character= "+character+"  bool f=  "+f+"  string g="+g);


        // Step 3: Modify the values of the variables and print the updated values
        a++;
        b++;
        c++;
        d++;
        character='Z';
        f=true;
        g="byyee";

        System.out.println("Updated values int a = "+a+" "+"long b = "+b+" "+" float c = "+c+" "+" double d = "+d+"  character= "+character+"  bool f=  "+f+"  string g="+g);


    }
}
