package lesson11;

import java.util.Scanner;

public class nhaxuatban {
	private int ma_nxb;
	private String name_nxb;
	private String address;
	
	
	@Override
	public String toString() {
		return "nhaxuatban [ma_nxb=" + ma_nxb + ", name_nxb=" + name_nxb + ", address=" + address + "]";
	}

	public nhaxuatban() {
		super();
	}

	public nhaxuatban(int ma_nxb, String name_nxb, String address) {
		super();
		this.ma_nxb = ma_nxb;
		this.name_nxb = name_nxb;
		this.address = address;
	}

	public int getMa_nxb() {
		return ma_nxb;
	}

	public void setMa_nxb(int ma_nxb) {
		this.ma_nxb = ma_nxb;
	}

	public String getName_nxb() {
		return name_nxb;
	}

	public void setName_nxb(String name_nxb) {
		this.name_nxb = name_nxb;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	

	public void nhap() {
		System.out.print("===============Nhập sách================== ");
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhập mã xuất bản: ");
		ma_nxb = (scan.nextInt());
		System.out.print("Nhập tên nhà xuất bản: ");
		name_nxb = scan.nextLine();
		scan.nextLine();
		System.out.print("Nhập địa chỉ: ");
		address = scan.nextLine();
	}

	

}