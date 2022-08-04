package lesson5.baitap.bai2;

import java.util.Scanner;

import lesson5.CongNhan;
import lesson5.Main;
import lesson5.Nguoi;
import lesson5.SinhVien;

public class TuyenSinh {
	static class TuyenSinhCon{
		private String x ;
	}
	static int a = 1 ; // biến public 
//	int a = 1 ; // thuộc tính
	
	static{
		System.out.println("Chạy block static");
		// Khởi tạo các biến trước khi vào hàm main ( tiền khởi tạo ) 
	}
	
	public static void main(String[] args) {
		TuyenSinh.a = 2 ;
		TuyenSinh.TuyenSinhCon tuyenSinhCon = new TuyenSinhCon();
		Scanner scanner = new Scanner(System.in);

		int menuNhap = -1;
		ThiSinh[] arrayThiSinh = new ThiSinh[5];
		int size = 0;
		while (menuNhap != 0) {
			System.out.println("============ Menu =============");
			System.out.println("1: Nhập 1 để nhập thí sinh thi khối A");
			System.out.println("2: Nhập 2 để nhập thí sinh thi khối B ");
			System.out.println("3: Nhập 3 để nhập thí sinh thi khối A1");
			System.out.println("4: Nhập 4 để tìm kiếm theo tên");
			System.out.println("0: Nhập 0 để thoát");
			menuNhap = Main.nhapInt("menu", scanner);
			ThiSinh thiSinh = null;
			if (menuNhap == 1 || menuNhap == 2 || menuNhap == 3) {
				if (size == 5) {
					System.out.println("Đủ người 5 vui lòng nhập lại");
					continue;
				}
				if (menuNhap == 1)
					thiSinh = new ThiSinhKhoiA();
				else if (menuNhap == 2)
					thiSinh = new ThiSinhKhoiB();
				else
					thiSinh = new ThiSinhKhoiA_1();
				thiSinh.nhap(scanner);
				arrayThiSinh[size++] = thiSinh;
			} else if (menuNhap == 4) {
				System.out.print("Nhập ký tự tìm kiếm tên thí sinh: ");
				String search = scanner.nextLine();
				for (int i = 0; i < size; i++) {
					if (arrayThiSinh[i].getHovaTen().contains(search)) {
						System.out.println(arrayThiSinh[i].toString());
					}
				}

			} else {
				System.out.println("Nhập lại menu số từ 0 -> 4");
			}

		}

	}

}
