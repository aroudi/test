import java.util.Arrays;
import java.util.List;

public class ReverseList {
    public static void main(String[] args) {

        String[] array1 = new String[]{"1","2","3","4"};
        System.out.println(Arrays.toString(array1));
        reverse(array1);
        System.out.println(Arrays.toString(array1));


        array1 = new String[]{"1","2","3","4","5"};
        System.out.println(Arrays.toString(array1));
        reverse(array1);
        System.out.println(Arrays.toString(array1));
    }

    public static void reverse(String[] list) {
        if (list.length < 2) {
            return;
        }
        String temp;
        int arraySize = list.length;
        for (int i =0; i< list.length /2; i++) {
            temp = list[i];
            list[i] = list[arraySize - i - 1];
            list[arraySize - i - 1] = temp;
        }
    }

}
