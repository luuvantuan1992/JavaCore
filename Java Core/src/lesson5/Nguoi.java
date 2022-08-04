package lesson5;

import java.util.Scanner;

public class Nguoi {
    private String hoVaTen;// trong nội class
    String ngaySinh;// trong class và trong pakage
    protected int tuoi;// trong class, trong pakage của nó và các thằng con của nó

    public void nhap(Scanner scanner) {
        System.out.print("Nhập họ và tên: ");
        this.hoVaTen = scanner.nextLine();
        System.out.print("Nhập ngày sinh: ");
        this.ngaySinh = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        this.tuoi = Main.nhapInt("tuổi", scanner);
    }


    public String info(){
        StringBuilder builder = new StringBuilder();
        builder.append("Họ và tên: ").append(this.hoVaTen)
                .append(", Ngày sinh: ").append(this.ngaySinh)
                .append(", tuổi: ").append(this.tuoi);
        return builder.toString();
    }

    public String getHoVaTen() {
        return hoVaTen;
    }
    public void setHoVaTen(String hoVaTen) {
        this.hoVaTen = hoVaTen;
    }
    public int getTuoi() {
        return tuoi;
    }
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }
}
