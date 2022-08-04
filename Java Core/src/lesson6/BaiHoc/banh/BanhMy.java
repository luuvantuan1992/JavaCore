package lesson6.BaiHoc.banh;

import lesson6.BaiHoc.banh.inf.NhaoBotMy;
import lesson6.BaiHoc.banh.inf.NuongNhietCao;

public class BanhMy extends AbstractBanh implements NhaoBotMy, NuongNhietCao{

	@Override
	protected void chuanBiNguyenLieu() {
		// TODO Auto-generated method stub
		System.out.println("Bánh Mỳ Nguyên Liệu");
		
	}

	@Override
	protected void nhaoBot() {
		// TODO Auto-generated method stub
		System.out.println("Bánh Mỳ Nhào Bột");
		
	}

	@Override
	protected void nuongBanh() {
		// TODO Auto-generated method stub
		System.out.println("Bánh Mỳ Nướng Bánh");
		
	}

	@Override
	protected void hoanThien() {
		// TODO Auto-generated method stub
		System.out.println("Bánh Mỳ Hoàn Thiện");
		
	}

	@Override
	public void nhaoBotMy() {
		System.out.println("Bánh Mỳ Nhào Bột Mỳ");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void nuongNhietCao() {
		// TODO Auto-generated method stub
		System.out.println("Nướng nhiệt trên 250 độ C ");
		
	}

}
