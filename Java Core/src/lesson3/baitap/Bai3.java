package lesson3.baitap;

public class Bai3 {
    public static void main(String[] args) {
        bai5();
    }

    static void bai5() {
        // x + 2y + 5z = 200;
        int count_1 = 0;
        int caculator_1 = 0;
        for (int x = 0; x <= 200; x++) {
            for (int y = 0; y <= (200-x)/2; y++) {
                caculator_1++;
                if ((200 - (x * 1 + 2 * y)) % 5 == 0) count_1++;
            }
        }
        System.out.println("count_1 = " + count_1);
        System.out.println("caculator_1 = " + caculator_1);

        int count_2 = 0;
        int caculator_2 = 0;
        for (int z = 0; z <= 200/5; z++) {
            for (int y = 0; y <= (200 - 5 * z)/2; y++) {
                caculator_2++;
                count_2++;
            }
        }
        System.out.println("count_2 = " + count_2);
        System.out.println("caculator_2 = " + caculator_2);
    }


    static void bai3() {
        int i = 1357;
//        for (; i != 0; i = i / 10) {
//            System.out.print(i % 10);
//        }
        while (i != 0) {
            System.out.print(i % 10);
            i = i / 10;
        }
    }

    static void bai4(){
        int i = 9;
        String a = "";
        while (i != 0) {
            a = (i % 2) + a;
            i = i / 2;
        }
        //9 = 1 * 2^0 + 0*2^1 + 0 *2^2 + 1* 2^3
        System.out.println(a);
    }

}
