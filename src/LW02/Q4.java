package LW02;

import java.util.Arrays;
import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        int [] arr_num = new int [5];
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter 5 numbers for array:");
        for (int i=0; i<5;i++) {
            int arrnum = scanner.nextInt();
            arr_num[i]=arrnum;
        }
        Arrays.sort(arr_num);
        System.out.println(Arrays.toString(arr_num));
        System.out.println(arr_num[3]);
    }
}
