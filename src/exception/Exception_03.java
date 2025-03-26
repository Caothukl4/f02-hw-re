package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[5]; // Mảng có 5 phần tử (chỉ số từ 0 đến 4)
        for (int i = 0; i < array.length; i++) {
        while (true) {
            try {
                System.out.print("Nhập chỉ số mảng (0-4): ");
                int index = scanner.nextInt(); // Nhập chỉ số mảng

                System.out.print("Nhập giá trị cần gán: ");
                int value = scanner.nextInt(); // Nhập giá trị cần gán

                array[index] = value; // Gán giá trị vào mảng
                System.out.println("Giá trị " + value + " đã được gán vào chỉ số " + index);
                break; // Thoát vòng lặp nếu nhập đúng
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Lỗi: Chỉ số mảng ngoài phạm vi (0-4), vui lòng nhập lại!");
            } catch (InputMismatchException e) {
                System.out.println("Lỗi: Vui lòng nhập số nguyên hợp lệ!");
                scanner.nextLine(); // Xóa bộ nhớ đệm của Scanner để tránh vòng lặp vô hạn
            }
        }
        }

        System.out.println("Dữ liệu trong mảng:");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Phần tử tại chỉ số " + i + ": " + array[i]);
        }


        scanner.close();
    }
}
