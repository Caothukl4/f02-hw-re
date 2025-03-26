package Structure;

import java.util.Scanner;
import java.util.Stack;

public class Hw04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String input = sc.nextLine();

        Stack<Character> stack = new Stack<>();
        for(char ch : input.toCharArray()){
            stack.push(ch);
        }
        StringBuilder reversed = new StringBuilder();
        while (!stack.isEmpty()){
            reversed.append(stack.pop());

        }
        System.out.println("Chuỗi sau khi đảo: "+reversed);
        sc.close();
    }
}
