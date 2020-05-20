package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int[] array = {1,3,5,7,9,11,13,15};

        System.out.println("Non-reversed array = " + Arrays.toString(array));

        reverse(array);

        System.out.println("Reversed array = " + Arrays.toString(array));
    }



    private static void reverse (int[] array) {
        int maxIndex = array.length -1;
        int halfLength = array.length/2; //swaping elements from beginning are already reversed

        for (int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex-i];
            array[maxIndex-i] = temp;

        }

    }
}
