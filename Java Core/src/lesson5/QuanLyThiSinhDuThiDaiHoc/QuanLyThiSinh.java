package lesson5.QuanLyThiSinhDuThiDaiHoc;

import java.util.ArrayList;
import java.util.List;

public class QuanLyThiSinh {

	List<ThiSinh> thiSinh;

	public QuanLyThiSinh() {
		this.thiSinh = new ArrayList<>();
	}

	public void themMoiThiSinh(ThiSinh thiSinh) {
		this.thiSinh.add(thiSinh);
	}

	public void hienThiThongTinThiSinh() {
		this.thiSinh.forEach(thiSinh -> System.out.println(thiSinh.toString()));
	}

	public ThiSinh timKiemTheoSoBaoDanh(String soBaoDanh) {
		return this.thiSinh.stream().filter(thiSinh -> thiSinh.getSoBaoDanh().equals(soBaoDanh)).findFirst()
				.orElse(null);
	}
}
