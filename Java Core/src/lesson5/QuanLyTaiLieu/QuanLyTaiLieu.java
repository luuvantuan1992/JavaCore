package lesson5.QuanLyTaiLieu;

import java.util.ArrayList;
import java.util.List;

public class QuanLyTaiLieu {
	List<TaiLieu> taiLieu;

	public QuanLyTaiLieu() {
		this.taiLieu = new ArrayList<>();
	}

	public void themMoiTaiLieu(TaiLieu taiLieu) {
		this.taiLieu.add(taiLieu);
	}

	public boolean xoaTaiLieu(String maTaiLieu) {
		TaiLieu document = this.taiLieu.stream().filter(taiLieu -> taiLieu.getMaTaiLieu().equals(maTaiLieu)).findFirst()
				.orElse(null);
		if (document == null) {
			return false;
		}
		this.taiLieu.remove(document);
		return true;
	}

	public void hienThiThongTin() {
		this.taiLieu.forEach(taiLieu -> System.out.println(taiLieu.toString()));
	}

	public void timKiemTheoSach() {
		this.taiLieu.stream().filter(document -> document instanceof Sach)
				.forEach(document -> System.out.println(document.toString()));
	}

	public void timKiemTheoTapChi() {
		this.taiLieu.stream().filter(document -> document instanceof TapChi)
				.forEach(document -> System.out.println(document.toString()));
	}

	public void timKiemTheoBao() {
		this.taiLieu.stream().filter(document -> document instanceof Bao)
				.forEach(document -> System.out.println(document.toString()));
	}
}
