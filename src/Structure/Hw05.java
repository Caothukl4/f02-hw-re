package Structure;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Hw05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Queue<Integer> queue = new LinkedList<>();

        System.out.println("Nhập các số, cách nhau bởi dấu cách (bấm Enter để kết thúc):");
        String input = scanner.nextLine();

        // Tách các số và thêm vào Queue
        String[] numbers = input.split("\\s+");
        for (String num : numbers) {
            try {
                queue.add(Integer.parseInt(num));
            } catch (NumberFormatException e) {
                System.out.println("Bỏ qua giá trị không hợp lệ: " + num);
            }
        }
        System.out.println("Chuỗi nhập theo thứ tự: " );
        while (!queue.isEmpty()){
            System.out.print(queue.poll()+" ");
        }scanner.close();
    }
}
