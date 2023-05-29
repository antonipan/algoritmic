package Algoritmic;

import kotlin.collections.EmptyIterator;

public class Lesson2 {
    public static void main(String[] args) {
        Lesson2 less = new Lesson2();
        int [] array = new int [] {1, 8, 6, 14, 33, 50};
        less.insertSort(array);
        for (int i = 0; i < array.length; i++) {

        }

        System.out.println(less.binaryFind(array, 33));

    }

    public void bubbleSort (int [] array ) {
        boolean finish;
        int count =0;
        do {
            finish = true;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] > array[i+1]) {
                    int temp = array[i];
                    array[i] = array [i+1];
                    array[i+1] = temp;
                    finish = false;
                }
                count++;
            }
        } while (!finish);
        System.out.println(count);

    }

    public void directSort (int [] array) {
        int count = 0;
        for (int i = 0; i < array.length - 1; i++) {
            int minPosition = i;
            for (int j = i+1; j < array.length; j++) {
                if (array [j] < array[minPosition]) {
                    minPosition = j;
                }
                count++;
            }
            if (i != minPosition) {
                int temp = array [i];
                array[i] = array[minPosition];
                array[minPosition] = temp;
            }
        }
        System.out.println(count);
    }

    public void insertSort (int []array) {
        int count = 0;
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array [i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                count++;
            }
        }
        System.out.println(count);
    }

    public int binaryFind (int [] array, int value, int min, int max) {
        int midpoint;
        if (max < min) {
            return -1;
        } else {
            midpoint = (max - min) / 2 + min;
        }
        if (array[midpoint] < value) {
            return binaryFind(array, value, midpoint+1, max);
        } else {
            if (array[midpoint] > value) {
                return binaryFind(array, value, min, midpoint-1);
            } else {
                return midpoint;
            }
        }
    }

    public int binaryFind (int [] array, int value) {
        return binaryFind(array, value, 0, array.length-1);
    }

    public void QuickSort (int [] array) {
        
    }

}
