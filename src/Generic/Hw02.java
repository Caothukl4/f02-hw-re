package Generic;

import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Hw02 {
    public static <T> void swap(T[] array,int i,int j){
        if (array == null) {
            throw new NullPointerException("Mảng không được phép null");
        }
        // Kiểm tra các chỉ số i và j có hợp lệ không
        if (i < 0 || i >= array.length) {
            throw new IndexOutOfBoundsException("Chỉ số i (" + i + ") nằm ngoài phạm vi hợp lệ");
        }
        if (j < 0 || j >= array.length) {
            throw new IndexOutOfBoundsException("Chỉ số j (" + j + ") nằm ngoài phạm vi hợp lệ");
        }
        // Nếu i và j giống nhau, không cần hoán đổi
        if (i == j) {
            return;
        }
        T temp = array[i];
        array[i] = array[j];
        array[j]= temp;
    }

    public static void main(String[] args) {
        Integer[] number = {1,5,3,6,9,8};
        System.out.println("Mảng trước khi đổi: "+ Arrays.toString(number));
        swap(number,2,3);
        System.out.println("Mảng sau khi đổi: "+ Arrays.toString(number));
    }
}
