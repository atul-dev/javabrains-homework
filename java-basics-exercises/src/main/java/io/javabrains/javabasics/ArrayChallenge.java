package io.javabrains.javabasics;

import java.util.Arrays;

public class ArrayChallenge {
    public static void main(String[] args) {
        // Step 1: Create an array of integers
        int [] num={100,20,30,40,50,60,80};

        int sum=0,average=0;
        int largest=num[0];

        // Step 2: Use arrays and array operations to find the sum, average, and largest number in the array
        for (int i=0;i < num.length;i++){
            sum+= num[i];
            if(largest<num[i])
            {
                largest=num[i];
            }
        }
        double avg=(double) sum/ num.length;
        System.out.println("avg = " + avg);
        System.out.println("sum = " + sum);
        System.out.println("largest = " + largest);

    }
}
