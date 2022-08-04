package lesson4;

public class Main {
    public static void main(String[] args) {
//        Oto là class(lớp), honda và toyota là đối tượng (instance)
        Oto honda = new Oto();// tạo 1 biến có kiểu dữ liệu là ô tô
        honda.bienSo = "30H-123456";
        honda.mauSac = "Trắng";
        honda.hangXe = "HonDa";
        Oto toyota = new Oto();// tạo 1 biến có kiểu dữ liệu là ô tô
        toyota.bienSo = "30H-1567890";
        toyota.mauSac = "Đen";
        toyota.hangXe = "Toyota";

        honda.chayXe(100);
        honda.phanhXe();

        toyota.chayXe(100);
        toyota.phanhXe();

        // Tạp 1 class Phân số gồm 2 thuộc tính tử số và mẫu số
        // Viết viết thức công, trừ nhân chia 2 phân số ví dụ
        // hàm toString() để hiển thị phân số dước dang tử /mẫu (đã rút gọn)
        // PhanSo cong(PhanSo a){}
//        PhanSo a;
//        PhanSo b;
//        PhanSo c = a.cong(b);
//        a.toString() -> 1/2

//        PhanSo soHang_1 = new PhanSo(1, 2);// hàm khởi tạo mặc định
//        PhanSo soHang_2 = new PhanSo(1, 3);
//        PhanSo kq = soHang_1.cong(soHang_2);
//        PhanSo ketQua = new PhanSo();
//        ketQua.tuSo = soHang_2.tuSo * soHang_1.mauSo + soHang_2.mauSo * soHang_1.tuSo;
//        ketQua.mauSo = soHang_2.mauSo * soHang_1.mauSo;
//
//        PhanSo kq_2 = soHang_2.cong(soHang_1);
//        System.out.println(kq.toString());
//        System.out.println(kq_2.toString());
        PhanSo a = new PhanSo(2,4);
        a.hienThi();
        System.out.println(a.toString());
    }
}
