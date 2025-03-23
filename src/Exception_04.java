import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Nhập tuổi: ");
            int age = sc.nextInt();
            if(age < 6){
                throw new InvalidAgeException("Lỗi tuổi phải lớn hơn 6.");
            }
            System.out.println("Tuổi hợp lệ: " + age);
        } catch (InvalidAgeException e){
            System.out.println(e.getMessage());
        }
        catch (InputMismatchException e){
            System.out.println("Sai định dạng tuổi.");
        }
        finally {
            sc.close();
            System.out.println("Chương trình kết thúc");
        }
    }
}

class InvalidAgeException extends Exception {
    public InvalidAgeException(String message){
        super(message);
    }
}
