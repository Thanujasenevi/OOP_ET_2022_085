package LW02;

import java.util.Enumeration;
import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num;
        for (int i = 1; true; i++) {
            System.out.print("Enter number:");
            num = scanner.nextInt();
            if (num < 0) {
                break;
            }
            int length = String.valueOf(num).length();
            System.out.println("Number of digits:"+length);
        }
    }
}