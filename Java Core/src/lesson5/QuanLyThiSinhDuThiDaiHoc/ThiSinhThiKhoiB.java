package lesson5.QuanLyThiSinhDuThiDaiHoc;

public class ThiSinhThiKhoiB extends ThiSinh {

	public ThiSinhThiKhoiB(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
		super(soBaoDanh, hoTen, diaChi, mucUuTien);
		// TODO Auto-generated constructor stub
	}

	public static final String MON_TOAN = "Toan";
	public static final String MON_HOA = "Hoa";
	public static final String MON_SINH = "Sinh";

	@Override
	public String toString() {
		return " ThiSinhThiKhoiB [soBaoDanh=" + soBaoDanh + ", hoTen=" + hoTen + ", diaChi=" + diaChi + ", mucUuTien="
				+ mucUuTien + "]";
	}

}
