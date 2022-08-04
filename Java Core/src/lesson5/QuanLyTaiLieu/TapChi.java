package lesson5.QuanLyTaiLieu;

public class TapChi extends TaiLieu {

	private int soPhatHanh;
	private int thangPhatHanh;

	@Override
	public String toString() {
		return " TapChi [soPhatHanh=" + soPhatHanh + ", thangPhatHanh=" + thangPhatHanh + ", maTaiLieu=" + maTaiLieu
				+ ", nhaXuatBan=" + nhaXuatBan + ", soBanPhatHanh=" + soBanPhatHanh + "]";
	}

	public TapChi(String maTaiLieu, String nhaXuatBan, int soBanPhatHanh, int soPhatHanh, int thangPhatHanh) {
		super(maTaiLieu, nhaXuatBan, soBanPhatHanh);
		this.soPhatHanh = soPhatHanh;
		this.thangPhatHanh = thangPhatHanh;
	}

	public int getSoPhatHanh() {
		return soPhatHanh;
	}

	public void setSoPhatHanh(int soPhatHanh) {
		this.soPhatHanh = soPhatHanh;
	}

	public int getThangPhatHanh() {
		return thangPhatHanh;
	}

	public void setThangPhatHanh(int thangPhatHanh) {
		this.thangPhatHanh = thangPhatHanh;
	}

}
