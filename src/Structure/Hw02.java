package Structure;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Hw02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập vào một đoạn văn:");
        String text = scanner.nextLine();
        text = text.toLowerCase().replaceAll("[^a-zA-Z0-9\s]", "");

        // Tách từ bằng khoảng trắng
        String[] words = text.split("\\s+");
        Map<String,Integer> wordCount = new HashMap<>();
        for(String word : words){
            wordCount.put(word,wordCount.getOrDefault(word,0)+1);
        }
        System.out.println("Tần suất xuất hiện của các từ:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }

        scanner.close();
    }
}
