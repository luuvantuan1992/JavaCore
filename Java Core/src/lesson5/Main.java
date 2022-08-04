package lesson5;

import java.util.Scanner;

public class Main {
    // 1)tạo class Nguoi (hoTen, tuoi, ngaySinh)
    // 2)SinhVien kế thừa Người (Truong), CongNhan(congTy)
    // 3)viết hàm nhap() trong class Nguoi
    // (nhập từ bàn phím các thông tin thuộc tính Nguoi)
    // và hàm info() để in ra màn hình thông tin của Nguoi
    // viết hàm nhap(), info() trong class SinhVien ghi đè lại lớp Nguoi
    // 4)Tạo menu nhập thông tin SinhVien và CongNhan và nhập 5 đối tượng lưu vào mảng
    // 0: Nhập 0 để thoát
    // 1: Nhập 1 để nhập sinh viên
    // 2: Nhập 2 để nhập Công nhân
    // 3: Nhập 3 để tìm kiếm theo tên
    // 5) Tìm kiếm trong bảng tên người theo ký tự
    // văn -> Nguyễn Văn A -> chưa từ văn -> info()
    public static int nhapInt(String tieuDe, Scanner scanner) {
        int result = -1;
        boolean nhapLai = false;
        while (result < 0) {
            try {
                if (nhapLai) System.out.print("Nhập lại " + tieuDe + " là số nguyên");
                result = scanner.nextInt();
                scanner.nextLine();
                nhapLai = true;
            } catch (Exception e) {
                scanner.nextLine();
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int menuNhap = -1;
        Nguoi[] arrayNguoi = new Nguoi[5];
        int size = 0;
        while (menuNhap != 0) {
            System.out.println("============ Menu =============");
            System.out.println("1: Nhập 1 để nhập sinh viên");
            System.out.println("2: Nhập 2 để nhập Công nhân");
            System.out.println("3: Nhập 3 để tìm kiếm theo tên");
            System.out.println("0: Nhập 0 để thoát");
            menuNhap = nhapInt("menu", scanner);
            Nguoi nguoi = null;
            if (menuNhap == 1 || menuNhap == 2) {
                if (size == 5) {
                    System.out.println("Đủ người 5 vui lòng nhập lại");
                    continue;
                }
                if (menuNhap == 1)
                    nguoi = new SinhVien();
                else
                    nguoi = new CongNhan();
                nguoi.nhap(scanner);
                arrayNguoi[size++] = nguoi;
            } else if (menuNhap == 3) {
                System.out.print("Nhập ký tự tìm kiếm tên người: ");
                String search = scanner.nextLine();
                for (int i = 0; i < size; i++) {
                    if (arrayNguoi[i].getHoVaTen().contains(search)){
                        System.out.println(arrayNguoi[i].info());
                    }
                }

            } else {
                System.out.println("Nhập lại menu số từ 0 -> 3");
            }

        }

    }
}
