package LW3;

import java.util.Scanner;

public class Q1 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter temperature in celcius: ");
        double celcius =num.nextDouble();
        Temperature temp = new Temperature();
        temp.setCelcius(celcius);
        System.out.println("Fahrenheit:"+temp.getFahrenheit());
    }
}
