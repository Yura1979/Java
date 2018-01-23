package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	    int[] data = {45, 23, 5, 1, 7, 3, 56, 6};
        System.out.println(Arrays.toString(data));
        sortArray(data);
        System.out.println(Arrays.toString(data));
    }
    public static void conditionalSwap(int[] array, int first, int second) {
        if (array[first] > array[second]) {
            int tmp = array[first];
            array[first] = array[second];
            array[second] = tmp;
        }
    }
    public static void sortArray(int[] array){
        for (int barrier = array.length - 1; barrier >= 0 ; barrier--) {
            for (int i = 0; i < barrier; i++) {
                conditionalSwap(array, i, i+1);
            }

        }
    }
}
