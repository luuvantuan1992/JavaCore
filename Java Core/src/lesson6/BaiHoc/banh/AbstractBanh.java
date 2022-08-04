package lesson6.BaiHoc.banh;


// pattern template
public abstract class AbstractBanh { // class abstract

	protected abstract void chuanBiNguyenLieu(); // Phương thức abstract

	protected abstract void nhaoBot();

	protected abstract void nuongBanh();

	protected abstract void hoanThien();

	public void lamBanh() {
		chuanBiNguyenLieu();
		nhaoBot();
		nuongBanh();
		hoanThien();

	}
}
