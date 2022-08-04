package lesson2.baitap;

import java.util.Scanner;

public class Bai1 {
//    int a;// instance
    static int a = 3;// static
    public static void main(String[] args) {
        run();

    }

    static void run() {
        // giải phương trình bâc nhất ax + b = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập a = ");
        int a = scanner.nextInt();scanner.nextLine();
        System.out.print("Nhập b = ");
        int b = scanner.nextInt();scanner.nextLine();
        giaiPhuongTrinhbacNhat(a, b);
    }
    // giải phương trình bâc nhất ax + b = 0;
    public static void giaiPhuongTrinhbacNhat(int a, int b) {
        String pt = " " + (a == 1 ? "" : a) + "x + " + b + " = 0 ";
        if (a == 0){
            if (b == 0)
                System.out.println("Phương trình" + pt + " có vô số nghiệm");
            else
                System.out.println("Phương trình" + pt + " vô nghiệm");
        } else {
            System.out.println("Phương trình " + pt + " có nghiệm là: "
                    + ((double)-b)/a);
        }
    }
}
