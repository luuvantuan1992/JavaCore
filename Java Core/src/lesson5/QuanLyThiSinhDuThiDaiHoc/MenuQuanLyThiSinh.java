package lesson5.QuanLyThiSinhDuThiDaiHoc;

import java.util.Scanner;

public class MenuQuanLyThiSinh {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		QuanLyThiSinh quanLyThiSinh = new QuanLyThiSinh();
		while (true) {
			System.out.println(" Ung Dung Quan Ly Thi Sinh ");
			System.out.println(" Phim 1 : Them Thi Sinh ");
			System.out.println(" Phim 2 : Hien Thi Thong Tin Thi Sinh ");
			System.out.println(" Phim 3 : Tim Kiem Thong Tin Thi Sinh Theo So Bao Danh");
			System.out.println(" Phim 4 : Thoat Chuong Trinh ");
			String line = scanner.nextLine();
			switch (line) {
			case "1": {
				System.out.println(" Phim a : Them Thi Sinh Khoi A ");
				System.out.println(" Phim b : Them Thi Sinh Khoi B ");
				System.out.println(" Phim c : Them Thi Sinh Khoi C ");
				String type = scanner.nextLine();
				switch (type) {
				case "a": {
					quanLyThiSinh.themMoiThiSinh(taoLopTuyenSinh(scanner, "a"));
					break;

				}
				case "b": {
					quanLyThiSinh.themMoiThiSinh(taoLopTuyenSinh(scanner, "b"));
					break;
				}
				case "c": {
					quanLyThiSinh.themMoiThiSinh(taoLopTuyenSinh(scanner, "c"));
					break;
				}
				default:
					System.out.println(" Khong Hop Le ");
					break;
				}
				break;
			}
			case "2": {
				quanLyThiSinh.hienThiThongTinThiSinh();
				break;
			}
			case "3": {
				System.out.print(" Nhap So Bao Danh : ");
				String soBaoDanh = scanner.nextLine();
				ThiSinh thiSinh = quanLyThiSinh.timKiemTheoSoBaoDanh(soBaoDanh);
				if (thiSinh == null) {
					System.out.println(" Khong Tim Thay Sinh Vien Nao ");
				} else {
					System.out.println(thiSinh.toString());
				}
				break;
			}
			case "4": {
				return;
			}
			default:
				System.out.println(" Khong Hop Le ");
				continue;
			}

		}
	}

	public static ThiSinh taoLopTuyenSinh(Scanner scanner, String tuyenSinh) {
		System.out.print(" Nhap So Bao Danh ");
		String soBaoDanh = scanner.nextLine();
		System.out.print(" Nhap Ho Ten ");
		String hoTen = scanner.nextLine();
		System.out.print(" Nhap Dia Chi ");
		String diaChi = scanner.nextLine();
		System.out.print(" Nhap Muc Uu Tien ");
		int mucUuTien = scanner.nextInt();
		scanner.nextLine();
		if (tuyenSinh.equals("a")) {
			return new ThiSinhThiKhoiA(soBaoDanh, hoTen, diaChi, mucUuTien);
		} else if (tuyenSinh.equals("b")) {
			return new ThiSinhThiKhoiB(soBaoDanh, hoTen, diaChi, mucUuTien);
		} else {
			return new ThiSinhThiKhoiC(soBaoDanh, hoTen, diaChi, mucUuTien);
		}

	}
}
