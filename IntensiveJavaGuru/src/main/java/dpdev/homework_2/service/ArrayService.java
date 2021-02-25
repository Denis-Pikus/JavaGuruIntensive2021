package dpdev.homework_2.service;

import java.util.Arrays;
import java.util.Random;

public class ArrayService {

    public int[] create(int size) {
        if (size < 0 ) {
            throw new NegativeArraySizeException("It impossible to create array which negative size!");
        } else return new int[size];
    }

    public void fillRandomly(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = new Random().nextInt(101);
        }

    }

    public void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println("array[" + i + "] = " + array[i]);
        }
    }

    public int sum(int[] array) {
        return Arrays.stream(array).sum();
    }

    public double avg(int[] array) {
        if (array.length == 0) return 0;
        return (double) sum(array) / array.length;
    }

    public void sort(int[] array){
        boolean isSorted = false;
        int temp;
        while (!isSorted){
            isSorted = true;
            for (int i = 0; i < array.length - 1; i++) {
                if (array[i] > array[i + 1]){
                    isSorted = false;
                    temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;
                }
            }
        }
    }

    public void swap(int[] array){
        int i = 0;
        int j = array.length - 1;
        int temp;
        while (i <= j){
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
            i ++;
            j--;
        }
    }
}
