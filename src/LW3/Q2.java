package LW3;

import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenhiet: ");
        double Fahrenhiet =num.nextDouble();
        Temperature temp = new Temperature();
        temp.setFahrenheit(Fahrenhiet);
        System.out.println("Celcius:"+temp.getCelcius());
    }
}
