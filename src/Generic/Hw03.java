package Generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

public class Hw03 {
    public static <T> int countOccurrences(List<T> list, T element) {
        if (list == null) {
            throw new NullPointerException("Danh sách không được phép null");
        }

        // Khởi tạo biến đếm
        int count = 0;
        for(T item : list)
            if(Objects.equals(item,element)){
                count++;
            }
        return count;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,3,4,4,5,6);
        int count = countOccurrences(list,3);
        System.out.println("Số lần xuất hiện: "+count+" lần.");
    }
}
