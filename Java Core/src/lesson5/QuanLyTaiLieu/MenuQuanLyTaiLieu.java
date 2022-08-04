package lesson5.QuanLyTaiLieu;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MenuQuanLyTaiLieu {
	public static void main(String[] args) {
		Set<TaiLieu> setTaiLieu = new HashSet<TaiLieu>();
		setTaiLieu.add(new Sach(null, null, 0, null, 0));
		setTaiLieu.add(new TapChi(null, null, 0, 0, 0));
		setTaiLieu.add(new Bao(null, null, 0, 0));

		Scanner scanner = new Scanner(System.in);
		QuanLyTaiLieu quanLyTaiLieu = new QuanLyTaiLieu();
		while (true) {
			System.out.println(" Ung Dung Quan Ly Tai Lieu : ");
			System.out.println(" Phim 1 : Them Tai Lieu : ");
			System.out.println(" Phim 2 : Tim Kiem Tai Lieu Theo : ");
			System.out.println(" Phim 3 : Hien Thi Thong Tin Tai Lieu : ");
			System.out.println(" Phim 4 : Xoa Tai Lieu Theo Ma Tai Lieu : ");
			System.out.println(" Phim 5 : Thoat Chuong Trinh ");
			String line = scanner.nextLine();
			switch (line) {
			case "1": {
				System.out.println(" Phim a : Them Sach ");
				System.out.println(" Phim b : Them Bao ");
				System.out.println(" Phim c : Them Tap Chi ");
				String type = scanner.nextLine();
				switch (type) {
				case "a": {
					System.out.print(" Nhap Ma Tai Lieu: ");
					String maTaiLieu = scanner.nextLine();
					System.out.print(" Nhap Nha Xuan Ban :");
					String nhaXuatBan = scanner.nextLine();
					System.out.print(" Nhap So Ban Phat Hanh : ");
					int soBanPhatHanh = scanner.nextInt();
					System.out.print(" Nhap Ten Tac Gia : ");
					scanner.nextLine();
					String tenTacGia = scanner.nextLine();
					System.out.print(" Nhap So Trang : ");
					int soTrang = scanner.nextInt();
					TaiLieu sach = new Sach(maTaiLieu, nhaXuatBan, soBanPhatHanh, tenTacGia, soTrang);
					quanLyTaiLieu.themMoiTaiLieu(sach);
					System.out.println(sach.toString());
					scanner.nextLine();
					break;

				}
				case "b": {
					System.out.print(" Nhap Ma Tai Lieu: ");
					String maTaiLieu = scanner.nextLine();
					System.out.print(" Nhap Nha Xuan Ban :");
					String nhaXuatBan = scanner.nextLine();
					System.out.print(" Nhap So Ban Phat Hanh : ");
					int soBanPhatHanh = scanner.nextInt();
					System.out.print(" Nhap Ngay Phat Hanh : ");
					int ngayPhatHanh = scanner.nextInt();
					TaiLieu bao = new Bao(maTaiLieu, nhaXuatBan, soBanPhatHanh, ngayPhatHanh);
					quanLyTaiLieu.themMoiTaiLieu(bao);
					System.out.println(bao.toString());
					scanner.nextLine();
					break;
				}
				case "c": {
					System.out.print(" Nhap Ma Tai Lieu: ");
					String maTaiLieu = scanner.nextLine();
					System.out.print(" Nhap Nha Xuan Ban :");
					String nhaXuatBan = scanner.nextLine();
					System.out.print(" Nhap So Ban Phat Hanh : ");
					int soBanPhatHanh = scanner.nextInt();
					System.out.print(" Nhap So Phat Hanh : ");
					int soPhatHanh = scanner.nextInt();
					System.out.print(" Nhap Thang Phat Hanh : ");
					int thangPhatHanh = scanner.nextInt();
					TaiLieu tapChi = new TapChi(maTaiLieu, nhaXuatBan, soBanPhatHanh, soPhatHanh, thangPhatHanh);
					quanLyTaiLieu.themMoiTaiLieu(tapChi);
					System.out.println(tapChi.toString());
					scanner.nextLine();
					break;
				}
				default:
					break;
				}
				break;
			}
			case "2": {
				System.out.println(" Phim a de tim kiem Tai Lieu theo Sach ");
				System.out.println(" Phim b de tim kiem Tai Lieu theo Bao ");
				System.out.println(" Phim c de tim kiem Tai Lieu theo TapChi ");
				String luaChon = scanner.nextLine();
				switch (luaChon) {
				case "a": {
					quanLyTaiLieu.timKiemTheoSach();
					;
					break;
				}
				case "b": {
					quanLyTaiLieu.timKiemTheoBao();
					break;
				}
				case "c":
					quanLyTaiLieu.timKiemTheoTapChi();
					break;
				default:
					System.out.println(" Khong Hop Le ");
					break;
				}
				break;
			}
			case "3": {
				quanLyTaiLieu.hienThiThongTin();
				break;
			}
			case "4": {
				System.out.print(" Nhap Ma Tai Lieu De Xoa ");
				String maTaiLieu = scanner.nextLine();
				System.out.println(quanLyTaiLieu.xoaTaiLieu(maTaiLieu) ? " Thanh Cong " : " That Bai ");
			}
				break;
			case "5": {
				return;
			}
			default:
				System.out.println(" Khong Hop Le ");
				continue;
			}

		}
	}

}
