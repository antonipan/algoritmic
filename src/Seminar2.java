package Algoritmic;

import java.util.Arrays;

public class Seminar2 {

    public static void main(String[] args) {
        Seminar2 sort = new Seminar2();
        int [] arr = new int [] {5, 6, 3, 4, 1};
        System.out.println(Arrays.toString(arr));
        sort.bubbleSort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }


    }

    public void bubbleSort(int []array) {
        boolean fix;
        do {
            fix = true;
            for (int i = 0; i < array.length-1; i++) {
                if (array[i] < array[i+1]){
                    int temp = array[i];
                    array[i] = array[i+1];
                    array[i+1] = temp;
                    fix = false;
                }
            }
            System.out.println(Arrays.toString(array));
        } while (!fix);
    }

    public void directSort (int [] array) {
        for (int i = 0; i < array.length-1; i++) {
            for (int j = i+1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
            System.out.println(Arrays.toString(array));
        }
    }

    public void insertSort (int [] array) {
        for (int i = 1; i < array.length; i++) {
            int temp = array[i];
            int j = i-1;
            while (j>=0 && temp < array[j]) {
                array[j+1] = array[j];
                j--;
            }
            array[j + 1] = temp;
        }
    }
}
