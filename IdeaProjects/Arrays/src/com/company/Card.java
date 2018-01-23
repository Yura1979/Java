package com.company;

import java.util.Random;

public class Card {
    private int[] array;
    private int arraySize;

    public Card(int arraySize) {
        this.arraySize = arraySize;
        this.array = new int[arraySize];
    }

    public void populateArray(){
        for (int i = 0; i < arraySize; i++) {
            Random rnd = new Random();
            array[i] = rnd.nextInt(100 - 10) + 10;
        }
    }

    public void printArray(){
        for (int i = 0; i < arraySize; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }
    public void recPrint(int arg){
        System.out.print(array[arg] + " ");
        if (arg < arraySize - 1) {
            //arg++;
            recPrint(arg+1);
        }
        System.out.println();
    }
}
