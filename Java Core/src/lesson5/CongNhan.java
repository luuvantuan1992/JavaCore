package lesson5;

import java.util.Scanner;

public class CongNhan extends Nguoi{

    private String congTy;

    public String getCongTy() {
        return congTy;
    }


    public void setCongTy(String congTy) {
        this.congTy = congTy;
    }

    // override: ghi đè (hai hàm giống y hệt nhau, 1 thằng của cha và 1 thằng của con)
    // chỉ xảy ra khi có tính chất kế thừa
    public void setTuoi(int tuoi) {
//        System.out.println("Hàm set tuổi của công nhân");
        this.tuoi = tuoi;
//        super.setTuoi(tuoi);// gọi hàm setTuoi của lớp cha (super)
    }

    @Override
    public void nhap(Scanner scanner) {
        System.out.println("============ Nhập công nhân============");
        super.nhap(scanner);
        System.out.print("Nhập công ty: ");
        this.congTy = scanner.nextLine();
    }

    @Override
    public String info() {
        StringBuilder builder = new StringBuilder();
        builder.append(super.info());
        builder.append(", công ty: ").append(congTy);
        return  builder.toString();
    }
}
