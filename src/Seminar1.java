package Algoritmic;

import java.time.Duration;
import java.time.LocalTime;
import java.util.ArrayList;

public class Seminar1 {
    public static void main(String[] args) {
        LocalTime timeStart = LocalTime.now();
        func5(30);
        LocalTime timeFinish = LocalTime.now();
        System.out.println("время выполнения: " + Duration.between(timeStart, timeFinish));

//        LocalTime timeStart2 = LocalTime.now();
//        System.out.println(aProgression(500000));
//        LocalTime timeFinish2 = LocalTime.now();
//        System.out.println("время выполнения: " + Duration.between(timeStart2, timeFinish2));
    }

    // O(n)
    public static int func1(int n) {
        int result = 0;
        for (int i = 0; i < n; i++) {

        }
        return result;
    }
    // O(n*m)
    public static int func2 (int n) {
        int m = n;
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {

            }
        }
        return result;
    }
    // O (n * (n+1)/2)
    public static int func3 (int n) {
        int result = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {

            }
        }
        return result;
    }
    // O(n)
    public static double func4 (double n) {
        double summ = 0;
        for (int i = 1; i <= n; i++) {
            summ +=i;
        }
        return summ;
    }
    // O (3) = 0; or func4 - O(n)
    public static double aProgression (double n) {
        double summ = n * (n + 1)/2;
        return summ;
    }
    // O (n * (n+1)/2
    public static void func5 (int n) {
        ArrayList <Integer> list = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            boolean key = true;
            for (int j = 1; j < i; j++) {
                if (i%j == 0 & j != 1) {
                    key = false;
                }
            }
            if (key) {
                list.add(i);
            }
        }
        System.out.println(list);
    }
    // O (n^k)
    public static void kub (int k, int n) {
        
    }

}
