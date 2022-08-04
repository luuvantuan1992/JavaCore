package lesson11;

import java.util.Scanner;

import lesson5.QuanLyTaiLieu.*;

public class book {
	private int id;
	private String name;
	private String author;
	private int number_page;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the author
	 */
	public String getAuthor() {
		return author;
	}

	/**
	 * @param author the author to set
	 */
	public void setAuthor(String author) {
		this.author = author;
	}

	/**
	 * @return the number_page
	 */
	public int getNumber_page() {
		return number_page;
	}

	/**
	 * @param number_page the number_page to set
	 */
	public void setNumber_page(int number_page) {
		this.number_page = number_page;
	}

	public book(String name, String author, int number_page) {
		super();
		this.name = name;
		this.author = author;
		this.number_page = number_page;
	}

	public book() {
	};

	public void nhap() {
		System.out.print("===============Nhập sách================== ");
		Scanner scan = new Scanner(System.in);
		System.out.print("Nhập tên sách: ");
		name = (scan.nextLine());
		System.out.print("Nhập số trang: ");
		number_page = scan.nextInt();
		scan.nextLine();
		System.out.print("Nhập tác giả: ");
		author = scan.nextLine();
	}

	@Override
	public String toString() {
		return "book [id=" + id + ", name=" + name + ", author=" + author + ", number_page=" + number_page + "]";
	}

}
