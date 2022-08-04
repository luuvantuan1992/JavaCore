package lesson6.BaiHoc;

import lesson6.BaiHoc.banh.AbstractBanh;
import lesson6.BaiHoc.banh.BanhBao;
import lesson6.BaiHoc.banh.BanhMy;
import lesson6.BaiHoc.banh.BanhSinhNhat;
import lesson6.BaiHoc.banh.inf.NhaoBotMy;
import lesson6.BaiHoc.banh.inf.NuongNhietCao;

public class Main {
	public static void main(String[] args) {
		// Làm bánh : bánh mỳ , bánh sinh nhật
		// Làm bánh gồm 4 bước : Chuẩn bị nguyên liệu , nhào bột , nướng bánh , trang
		// trí và hoàn thiện
		// làm thế nào để tất cả các loại bánh đều tuân theo quy trình 4 bước

		// Bánh Mỳ và Bánh Bao làm từ bột mỳ ( nhào bột mỳ )
		// Bánh bao và Bánh Mỳ nướng trên 200 độ C

		AbstractBanh banhMy = new BanhMy();
		banhMy.lamBanh();
		System.out.println("===================");
		BanhSinhNhat sinhNhat = new BanhSinhNhat();
		sinhNhat.lamBanh();
		System.out.println("===================");
		NhaoBotMy banhMy2 = new BanhMy();
//		banhMy2.nhaoBotMy();
		nhaoBotMy(banhMy2);
		System.out.println("===================");
		NuongNhietCao banhMy3 = new BanhMy();
		banhMy3.nuongNhietCao();
		banhMy3.nuongNhietCao_2();
		System.out.println("===================");
		
		// NuongNhietCao.a ;

	}
	
	static void nhaoBotMy(NhaoBotMy banh) {
		banh.nhaoBotMy();
	}
}
