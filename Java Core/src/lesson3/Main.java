package lesson3;

public class Main {
    public static void main(String[] args) {
        // in ra màn hình số từ 1 đến 10
        for(int i = 1; i <= 10; i = i + 1) {
            if (i % 2 == 1) {
                continue;// dừng vòng lặp và chuyển sang vòng lặp tiếp theo
            }
            // break; dừng luôn vòng lặp
            System.out.println("Số " + i);

        }

        int i = 1;
        while (i <= 10) {
//            System.out.println("Số " + i);
            i = i + 1;// điều kiện dừng
        }
        i = 1;
        do {
//            System.out.println("Số " + i);
            i ++;
        } while (i <= 10);

    }
}
