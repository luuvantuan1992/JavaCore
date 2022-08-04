package lesson5.QuanLyTaiLieu;

public class Sach extends TaiLieu {

	private String tenTacGia;
	private int soTrang;

	@Override
	public String toString() {
		return " Sach [tenTacGia=" + tenTacGia + ", soTrang=" + soTrang + ", maTaiLieu=" + maTaiLieu + ", nhaXuatBan="
				+ nhaXuatBan + ", soBanPhatHanh=" + soBanPhatHanh + "]";
	}

	public Sach(String maTaiLieu, String nhaXuatBan, int soBanPhatHanh, String tenTacGia, int soTrang) {
		super(maTaiLieu, nhaXuatBan, soBanPhatHanh);
		this.tenTacGia = tenTacGia;
		this.soTrang = soTrang;
	}

	public String getTenTacGia() {
		return tenTacGia;
	}

	public void setTenTacGia(String tenTacGia) {
		this.tenTacGia = tenTacGia;
	}

	public int getSoTrang() {
		return soTrang;
	}

	public void setSoTrang(int soTrang) {
		this.soTrang = soTrang;
	}

}
