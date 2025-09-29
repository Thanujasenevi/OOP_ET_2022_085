package LW02;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of row:");
        int row = scanner.nextInt();
        for(int i=0;i<row;i++){
            for (int j=row-i-1;j>=1;j--)
                System.out.print(" ");
            for (int j=0;j<=i;j++)
                System.out.print("* ");
            System.out.println();
        }
    }
}
