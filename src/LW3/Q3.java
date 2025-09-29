package LW3;

import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Owner owner1 = new Owner ("thanuja","774630003");
        Bicycle bike1 = new Bicycle(owner1);
        System.out.println(bike1.getOwner().getOwnername());
        System.out.println(owner1.getPhoneNo());
    }
}
