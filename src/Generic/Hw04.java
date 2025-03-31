package Generic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hw04 {
    public static double sumNumbers(List<? extends Number> list){
        if (list == null) {
            throw new NullPointerException("Danh sách không được phép null");
        }
        double sum = 0.0;
        for( Number number : list){
            if(number != null){
                sum+= number.doubleValue();
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,6,9,8,4,5);
        double sum = sumNumbers(list);
        System.out.println("Tổng các số trong list: "+sum);
    }
}
