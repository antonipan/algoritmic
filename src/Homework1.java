package Algoritmic;

import java.util.Arrays;

public class Homework1 {
    public static void main(String[] args) {
        Homework1 homework1 = new Homework1();
        int [] array = new int [] {13, 4, 5, 8 , 11, 10, 7, 9};
        System.out.println(Arrays.toString(array));
        homework1.pyramid(array);
        homework1.printArray(array);
    }

    public void pyramid (int [] array) {
        int n = array.length;

        for (int i = n/2 - 1; i >= 0; i--) {
            heap(array, n, i);
        }

        for (int i = n-1; i >= 0; i--) {
            int temp = array[0];
            array[0] = array[i];
            array[i] = temp;

            heap(array, i, 0);
        }
    }

    // функция преобразования массива в двоичную кучу.
    public void heap (int [] array, int n, int i) {
        int root = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        if (left < n && array[left] > array[root] ) {
            root = left;
        }
        if (right < n && array[right] > array[root]) {
            root = right;
        }
        if (root != i) {
            int temp = array[i];
            array[i] = array[root];
            array[root] = temp;

            heap(array, n, root);
        }
    }

    public void printArray (int [] array ) {
        System.out.println(Arrays.toString(array));
    }

}
