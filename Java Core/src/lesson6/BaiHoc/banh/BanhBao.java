package lesson6.BaiHoc.banh;

import lesson6.BaiHoc.banh.inf.NuongNhietCao;

public class BanhBao extends AbstractBanh implements NuongNhietCao{
	@Override
	protected void chuanBiNguyenLieu() {
		// TODO Auto-generated method stub
		System.out.println("Bánh bao Nguyên Liệu");

	}

	@Override
	protected void nhaoBot() {
		// TODO Auto-generated method stub
		System.out.println("Bánh bao Nhào Bột");

	}

	@Override
	protected void nuongBanh() {
		// TODO Auto-generated method stub
		System.out.println("Bánh bao Nướng Bánh");

	}

	@Override
	protected void hoanThien() {
		// TODO Auto-generated method stub
		System.out.println("Bánh bao Hoàn Thiện");

	}

	@Override
	public void nuongNhietCao() {
		// TODO Auto-generated method stub
		System.out.println("Nướng Nhiệt Cao 210 độ C ");
		
	}
}
