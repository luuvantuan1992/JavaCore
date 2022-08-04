package lesson2.baitap;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập 3 cạnh của tam giác:");
        System.out.println("a = ");
        double a = sc.nextDouble();
        System.out.println("b = ");
        double b = sc.nextDouble();
        System.out.println("c = ");
        double c = sc.nextDouble();

        if (a < b + c && b < a + c && c < b + a) {
            if ((a * a == b * b + c * c && b == c)
                    || (b * b == a * a + c * c && a == c)
                    || (c * c == a * a + b * b && a == b)) {
                System.out.println("Đây là tam giác vuông cân");
            } else if (a == b && b == c) {
                System.out.println("Đây là tam giác đều");
            } else if (a * a == b * b + c * c || b * b == a * a + c * c || c * c == a * a + b * b) {
                System.out.println("Đây là tam giác vuông");
            } else if (a == b || b == c || a == c) {
                System.out.println("Đây là tam giác cân");
            } else {
                System.out.println("Đây là tam giác thường");
            }
        } else {
            System.out.println("Không phải là tam giác");
        }
    }
}
