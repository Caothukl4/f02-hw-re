import java.util.Scanner;

public class Exception_05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true){
            try {
                System.out.println("Nhập số nguyên: ");
                int num = sc.nextInt();
                if( num < 0){
                    throw new NegativeNumberException("Lỗi nhập sai số dương.");
                }
                System.out.println("Số đã nhập là: "+ num);
                break;
            } catch (NegativeNumberException e){
                try{
                    throw new NegativeNumberException("Lỗi: Vui lòng nhập một số nguyên không âm.");
                } catch (NegativeNumberException ex){
                    System.out.println(ex.getMessage());
                }
            }
        }
        sc.close();
        System.out.println("Chương trình kết thúc.");
    }
}
class NegativeNumberException extends Exception {
    public NegativeNumberException (String message){
        super(message);
    }
}