package LW02;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Q6 {
    public static void main(String[] args) {
        Date today = new Date();
        SimpleDateFormat sdf;
        SimpleDateFormat sdf1;
        sdf = new SimpleDateFormat("dd MMMM,yyyy");
        System.out.println(sdf.format(today));
    }
}
