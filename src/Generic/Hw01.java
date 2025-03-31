package Generic;

import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;

public class Hw01 {
    public static <E> ArrayList<E> remove(ArrayList<E> list){
        return new ArrayList<>(new LinkedHashSet<>(list));
    }

    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        number.add(1);
        number.add(2);
        number.add(2);
        number.add(3);
        number.add(4);
        number.add(4);
        number.add(5);
        System.out.println("List: "+ number);
        ArrayList<Integer> Number = remove(number);
        System.out.println("List after removing duplicates: "+Number);
    }
}
