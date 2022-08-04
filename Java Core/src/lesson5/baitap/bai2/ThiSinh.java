package lesson5.baitap.bai2;

import java.util.Scanner;

import lesson5.Main;

public class ThiSinh {

	private String soBaoDanh;
	private String diaChi;
	private String hovaTen;
	private int mucUuTien;

	protected String monThi;

	@Override
	public String toString() {
		return "ThiSinh [soBaoDanh=" + soBaoDanh + ", diaChi=" + diaChi + ", hovaTen=" + hovaTen + ", mucUuTien="
				+ mucUuTien + ", monThi=" + monThi + "]";
	}

	public void nhap(Scanner scanner) {

		System.out.print("Nhập Họ Và Tên: ");
		this.hovaTen = scanner.nextLine();
		System.out.print("Nhập Số Báo Danh: ");
		this.soBaoDanh = scanner.nextLine();
		System.out.print("Nhập Địa Chỉ: ");
		this.diaChi = scanner.nextLine();
		System.out.print("Nhập Mức Ưu Tiên: ");
		this.mucUuTien = Main.nhapInt("Mức Ưu Tiên", scanner);
	}

	public String getSoBaoDanh() {
		return soBaoDanh;
	}

	public void setSoBaoDanh(String soBaoDanh) {
		this.soBaoDanh = soBaoDanh;
	}

	public String getDiaChi() {
		return diaChi;
	}

	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}

	public String getHovaTen() {
		return hovaTen;
	}

	public void setHovaTen(String hovaTen) {
		this.hovaTen = hovaTen;
	}

	public int getMucUuTien() {
		return mucUuTien;
	}

	public void setMucUuTien(int mucUuTien) {
		this.mucUuTien = mucUuTien;
	}

	public String getMonThi() {
		return monThi;
	}

	public void setMonThi(String monThi) {
		this.monThi = monThi;
	}

}
