import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_02 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Nhap so A: ");
            int soA = sc.nextInt();
            System.out.println("Nhap so B: ");
            int soB = sc.nextInt();

            int result = soA + soB;
            System.out.println("Tong A+B = " + result);
        } catch (InputMismatchException e) {
            System.out.println("Lỗi nhập sai định dạng.");
        } finally {
            System.out.println("Kết thúc chương trình.");
        }
    }
}
