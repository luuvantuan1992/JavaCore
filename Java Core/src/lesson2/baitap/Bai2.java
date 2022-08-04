package lesson2.baitap;

import java.util.Scanner;

public class Bai2 {
    public static void main(String[] args) {
        // Giải phương trình bâc 2 ax^2 + bx + c = 0
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a = ");
        int a = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập b = ");
        int b = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhập c = ");
        int c = scanner.nextInt();
        scanner.nextLine();

        String pt = " " + (a == 1 ? "" : a) + "x^2 + "
                + b + "x + " + c + " = 0 ";
        if (a == 0) {// phương trình bx + c = 0
            // giải phương trình bâc nhất
            Bai1.giaiPhuongTrinhbacNhat(b, c);
            return;
        }
        // giải phương trình bâc hai
        double delta = b * b - 4 * a * c;
        if (delta < 0) {
            System.out.println("Phương trình " + pt + " vô nghiệm");
        } else if (delta == 0) {
            System.out.println("Phương trình " + pt +
                    " có nghiệm kép: " + ((double) -b) / (2 * a));
        } else {
            System.out.println("Phương trình " + pt +
                            " có 2nghiệm : " +
                            ((double) -b + Math.sqrt(delta)) / (2 * a) +
                    "và " + ((double) -b - Math.sqrt(delta)) / (2 * a));
        }

    }
}
