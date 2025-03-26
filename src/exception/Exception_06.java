package exception;

import java.io.FileWriter;
import java.io.IOException;

public class Exception_06 {
    public static void main(String[] args) {
        String filePath = "output.txt";
        String content = "Hello, đây là nội dung được ghi vào file bằng try-with-resources!";

        // Sử dụng try-with-resources để tự động đóng FileWriter
        try (FileWriter writer = new FileWriter(filePath)) {
            writer.write(content);
            System.out.println("Ghi dữ liệu vào file thành công!");
        } catch (IOException e) {
            System.out.println("Lỗi khi ghi file: " + e.getMessage());
        }
    }
}
