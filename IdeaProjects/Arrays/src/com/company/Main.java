package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] array = {65, 2, 34, 1, 5, 8, 2,56,87,3,78,900,4,-1,56,52};
        System.out.println(Arrays.toString(array));
        System.out.println("Sorted array");
        System.out.println();
        long t = System.nanoTime();
        array = sortArray(array);
        System.out.println("time elapsed on sort" + " " +(System.nanoTime()-t)*1e-9);
        System.out.println(Arrays.toString(array));
        Card card = new Card(1000000);
        card.populateArray();

        System.out.println();
        t = System.nanoTime();
        card.printArray();
        System.out.println("time elapsed on for" + " " +(System.nanoTime()-t)*1e-9);

        System.out.println();
        System.out.println("test");

        t = System.nanoTime();
        card.recPrint(0);
        System.out.println("time elapsed on recursion" + " " +(System.nanoTime()-t)*1e-9);
    }
    public static int[] sortArray(int[] arr) {

        for (int i = 0; i < arr.length; i++) {
            for (int j=0; j < arr.length; j++) {
                if (arr[j] > arr[i]) {
                    int tmp;
                    tmp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = tmp;

                }
            }
        }

        return arr;
    }
}
