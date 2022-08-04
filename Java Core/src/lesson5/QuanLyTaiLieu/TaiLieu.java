package lesson5.QuanLyTaiLieu;

import java.util.Objects;

public class TaiLieu {

	protected String maTaiLieu;
	@Override
	public int hashCode() {
		return Objects.hash(maTaiLieu);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TaiLieu other = (TaiLieu) obj;
		return Objects.equals(maTaiLieu, other.maTaiLieu);
	}

	protected String nhaXuatBan;
	protected int soBanPhatHanh;

	public String getMaTaiLieu() {
		return maTaiLieu;
	}

	public void setMaTaiLieu(String maTaiLieu) {
		this.maTaiLieu = maTaiLieu;
	}

	public String getNhaXuatBan() {
		return nhaXuatBan;
	}

	public void setNhaXuatBan(String nhaXuatBan) {
		this.nhaXuatBan = nhaXuatBan;
	}

	public int getSoBanPhatHanh() {
		return soBanPhatHanh;
	}

	public void setSoBanPhatHanh(int soBanPhatHanh) {
		this.soBanPhatHanh = soBanPhatHanh;
	}

	public TaiLieu(String maTaiLieu, String nhaXuatBan, int soBanPhatHanh) {
		super();
		this.maTaiLieu = maTaiLieu;
		this.nhaXuatBan = nhaXuatBan;
		this.soBanPhatHanh = soBanPhatHanh;
	}

}
