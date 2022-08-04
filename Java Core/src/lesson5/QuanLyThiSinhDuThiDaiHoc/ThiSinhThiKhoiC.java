package lesson5.QuanLyThiSinhDuThiDaiHoc;

public class ThiSinhThiKhoiC extends ThiSinh {

	public ThiSinhThiKhoiC(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
		super(soBaoDanh, hoTen, diaChi, mucUuTien);
		// TODO Auto-generated constructor stub
	}

	public static final String MON_VAN = "Van";
	public static final String MON_SU = "Su";
	public static final String MON_DIA = "Dia";

	@Override
	public String toString() {
		return " ThiSinhThiKhoiC [soBaoDanh=" + soBaoDanh + ", hoTen=" + hoTen + ", diaChi=" + diaChi + ", mucUuTien="
				+ mucUuTien + "]";
	}

}
