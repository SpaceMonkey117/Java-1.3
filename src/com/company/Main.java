package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int arraySize = scan.nextInt();

        if (arraySize < 1){
            System.out.print("Invalid input!");
            return;
        }

        System.out.println("Enter " + arraySize + " elements:");
        int array[] = new int[arraySize];
        for (int i = 0; i < arraySize; ++i){
            array[i] = scan.nextInt();
        }

        // summary of all elements of the array with "for".
        int summary = 0;
        for (int i = 0; i < arraySize; ++i){
            summary += array[i];
        }
        System.out.println("Summary with \"for\" = " + summary);

        // summary of all elements of the array with "while".
        summary = 0;
        int i = 0;
        while (i < arraySize){
            summary += array[i];
            ++i;
        }
        System.out.println("Summary with \"while\" = " + summary);

        // summary of all elements of the array with "do while".
        summary = 0;
        i = 0;
        do{
            summary += array[i];
            ++i;
        }while (i < arraySize);
        System.out.println("Summary with \"do while\" = " + summary);
    }
}
