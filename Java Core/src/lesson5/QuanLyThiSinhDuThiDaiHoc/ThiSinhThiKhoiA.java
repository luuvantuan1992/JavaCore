package lesson5.QuanLyThiSinhDuThiDaiHoc;

public class ThiSinhThiKhoiA extends ThiSinh {

	public ThiSinhThiKhoiA(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
		super(soBaoDanh, hoTen, diaChi, mucUuTien);
		// TODO Auto-generated constructor stub
	}

	public static final String MON_TOAN = "Toan";
	public static final String MON_LY = "Ly";
	public static final String MON_HOA = "Hoa";

	@Override
	public String toString() {
		return " ThiSinhThiKhoiA [soBaoDanh=" + soBaoDanh + ", hoTen=" + hoTen + ", diaChi=" + diaChi + ", mucUuTien="
				+ mucUuTien + "]";
	}
}
