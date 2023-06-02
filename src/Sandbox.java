import java.util.LinkedList;
import java.util.Map;

public class Sandbox {
    public static void main(String[] args) {
        int [] array = new int[] {9, 5, 3, 1, 3, 2, 2, 7, 4, 9, 8, 0};
        Sandbox sandbox = new Sandbox();
        sandbox.maxFind(array);
        sandbox.repeatNumber(array);
    }

    public void maxFind (int [] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        System.out.println(max);
    }

    public void repeatNumber (int [] array) {
        boolean flag = false;
        LinkedList <Integer> list = new LinkedList<>();
        list.peek();
        for (int i = 0; i < array.length; i++) {
            if (list.contains(array[i])) {
                flag = true;
            } else {
                list.add(array[i]);
            }
        }
        if (!flag) {
            System.out.println("В массиве нет повторяющихся элементов");
        } else {
            System.out.println(list);
        }
    }
}
