package lesson5;

import java.util.Scanner;

public class SinhVien extends Nguoi{
    String truong;

    @Override
    public void nhap(Scanner scanner) {
        System.out.println("============ nhập sinh viên============");
        super.nhap(scanner);
        System.out.print("Nhập trường: ");
        this.truong = scanner.nextLine();
    }

    @Override
    public String info() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.info());
        builder.append(", trường: ").append(truong);
        return  builder.toString();
    }

    public String getTruong() {
        return truong;
    }

    public void setTruong(String truong) {
        this.truong = truong;
    }
}
