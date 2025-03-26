package exception;

import java.util.Scanner;

public class exception {
    public static void main(String[] args) {

        try (Scanner sc = new Scanner(System.in)) {
            System.out.println("Nhap so thu nhat: ");
            int soA = sc.nextInt();
            System.out.println("Nhap so thu hai: ");
            int soB = sc.nextInt();

            float result = (float) soA / soB;
            System.out.println("SoA chia soB la: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Khong the chia cho 0!");
        } catch (java.util.InputMismatchException e) {
            System.out.println("Vui long nhap so nguyen.");
        } finally {
            System.out.println("Chuong trinh ket thuc");
        }
    }
}
