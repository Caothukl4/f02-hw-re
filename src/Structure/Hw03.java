package Structure;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Hw03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Set<Integer> uniqueNumbers = new HashSet<>();
        System.out.println("Nhập các số, cách nhau bởi dấu cách (bấm Enter để kết thúc):");
        String input = sc.nextLine();

        String[] numbers= input.split("\\s+");
        for(String num: numbers){
            try{
                uniqueNumbers.add(Integer.parseInt(num));
            } catch (NumberFormatException e) {
                System.out.println("Bỏ qua giá trị không hợp lệ: "+num);
            }
        }
        System.out.println("Có "+ uniqueNumbers.size()+ " số khác nhau: "+ uniqueNumbers);
        sc.close();
    }
}
