package lesson2.baitap;

import java.util.Scanner;

public class Bai3 {
    //	Bậc 1: Cho kWh từ 0 - 50	1.678
//	Bậc 2: Cho kWh từ 51 - 100	1.734
//	Bậc 3: Cho kWh từ 101 - 200	2.014
//	Bậc 4: Cho kWh từ 201 - 300	2.536
//	Bậc 5: Cho kWh từ 301 - 400	2.834
//	Bậc 6: Cho kWh từ 401 trở lên	2.927
    static int SO_DIEN_BAC_1 = 50;
    static int SO_DIEN_BAC_2 = 100;
    static int SO_DIEN_BAC_3 = 200;
    static int SO_DIEN_BAC_4 = 300;
    static int SO_DIEN_BAC_5 = 400;

    static int TIEN_BAC_1 = 1678;
    static int TIEN_BAC_2 = 1734;
    static int TIEN_BAC_3 = 2014;
    static int TIEN_BAC_4 = 2536;
    static int TIEN_BAC_5 = 2834;
    static int TIEN_BAC_6 = 2927;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số điện: ");
        int soDien = sc.nextInt();

        System.out.println("Tiền điện là: " + tinhTienDien(soDien));

    }

    // Gọi lại chính nó
    // Phải xác định 1 điểm dừng
    public static int tinhTienDien(int soDien) {
    	int soTien = 0;
        if (soDien <= SO_DIEN_BAC_1) {
            soTien = soDien * TIEN_BAC_1;// điểm dừng
        } else if (soDien <= SO_DIEN_BAC_2) {
            soTien = (soDien - SO_DIEN_BAC_1) * TIEN_BAC_2  +  tinhTienDien(SO_DIEN_BAC_1);
        } else if (soDien <= SO_DIEN_BAC_3) {
            soTien = (soDien - SO_DIEN_BAC_2) * TIEN_BAC_3  +  tinhTienDien(SO_DIEN_BAC_2);
        } else if (soDien <= SO_DIEN_BAC_4) {
            soTien = (soDien - SO_DIEN_BAC_3) * TIEN_BAC_4  +  tinhTienDien(SO_DIEN_BAC_3);
        } else if (soDien <= SO_DIEN_BAC_5) {
            soTien = (soDien - SO_DIEN_BAC_4) * TIEN_BAC_5  +  tinhTienDien(SO_DIEN_BAC_4);
        } else {
            soTien = (soDien - SO_DIEN_BAC_5) * TIEN_BAC_6  +  tinhTienDien(SO_DIEN_BAC_5);
        }
    	return soTien;// kết thúc chương trình, trả về kết quả
	}

}
