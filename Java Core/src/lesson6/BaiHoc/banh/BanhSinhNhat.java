package lesson6.BaiHoc.banh;

import lesson6.BaiHoc.banh.inf.NhaoBotMy;

public class BanhSinhNhat extends AbstractBanh implements NhaoBotMy{
	
	@Override
	protected void chuanBiNguyenLieu() {
		// TODO Auto-generated method stub
		System.out.println("Bánh Sinh Nhật Nguyên Liệu");

	}

	@Override
	protected void nhaoBot() {
		// TODO Auto-generated method stub
		System.out.println("Bánh Sinh Nhật Nhào Bột");

	}

	@Override
	protected void nuongBanh() {
		// TODO Auto-generated method stub
		System.out.println("Bánh Sinh Nhật Nướng Bánh");

	}

	@Override
	protected void hoanThien() {
		// TODO Auto-generated method stub
		System.out.println("Bánh Sinh Nhật Hoàn Thiện");

	}

	@Override
	public void nhaoBotMy() {
		// TODO Auto-generated method stub
		System.out.println("Bánh Sinh Nhật Nhào Bột Mỳ ");
		
	}
	
}
