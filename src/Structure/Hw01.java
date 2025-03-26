package Structure;

import java.util.ArrayList;
import java.util.Scanner;

public class Hw01 {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\nMenu");
            System.out.println("1. Thêm số");
            System.out.println("2. Sửa số");
            System.out.println("3. Xóa số");
            System.out.println("4. Xem danh sách");
            System.out.println("5. Thoát");
            System.out.print("Chọn chức năng: ");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("Nhập số muốn thêm: ");
                    int addnumber = sc.nextInt();
                    number.add(addnumber);
                    System.out.println("Đã thêm thành công!");
                    break;

                case 2:
                    System.out.println("Nhập vị trí muốn sửa.");
                    int i = sc.nextInt();
                    if(i>=0 && i< number.size()){
                        System.out.println("Nhập số mới: ");
                        number.set(i, sc.nextInt());
                        System.out.println("Sửa thành công");
                    } else {
                        System.out.println("Vị trí không hợp lệ.");
                    }
                    break;
                case 3:
                    System.out.println("Nhập vị trí cần xóa.");
                    int j = sc.nextInt();
                    if(j>=0 && j< number.size()){
                        number.remove(j);
                        System.out.println("Xóa thành công");
                    } else {
                        System.out.println("Vị trí không hợp lệ.");
                    }
                    break;
                case 4:
                    System.out.println("Danh sách các số là: "+number);
                    break;
                case 5:
                    System.out.println("Thoát chương trình!");
                    break;
            }
        }
        while (choice != 5);
    sc.close();
    }
}
