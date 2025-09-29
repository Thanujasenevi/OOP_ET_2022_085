package LW02;

import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Enter your string: ");
        String str = scanner.next();
        String orgstr= str;
        String rev="";
        int len = str.length();
        for (int i=len-1;i>=0;i--){
            rev=rev+str.substring(i,i+1);
        }
        if(orgstr.equals(rev)){
            System.out.println(orgstr+" is Plindrome string");
        }
        else {
            System.out.println(orgstr+" is not Plindrome string");
        }
    }
}
