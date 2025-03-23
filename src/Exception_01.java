import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num ;
        while(true){
            try {
                System.out.print("Nhap so nguyen: ");
                num = sc.nextInt();
                break;
            } catch (InputMismatchException e){
                System.out.println("Lỗi: Vui lòng nhập một số nguyên hợp lệ!");
                sc.nextLine();
            }
        }
        System.out.println("So da nhap: "+ num);
        sc.close();
    }
}
