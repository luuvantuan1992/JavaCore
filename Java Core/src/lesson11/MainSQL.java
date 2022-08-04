package lesson11;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

import lesson5.QuanLyTaiLieu.Bao;
import lesson5.QuanLyTaiLieu.Sach;
import lesson5.QuanLyTaiLieu.TaiLieu;
import lesson5.QuanLyTaiLieu.TapChi;

public class MainSQL {
	private static String DB_INFO = "jdbc:mysql://localhost:3306/2204";
	private static String USER_NAME = "root";;
	private static String PASSWORD = "123456";

	public static void main1(String[] args) throws SQLException {
		Connection connection = DriverManager.getConnection(DB_INFO, USER_NAME, PASSWORD);
		connection.setAutoCommit(false);

//		Statement sattement = connection.createStatement();
//		String querryString = "insert into book (NAME, AUTHOR,NUMBER_PAGE) values ('" + book_.getName() + "'," + "'"
//				+ book.getAuthor() + "'," + book.getNumber_page() + " )";
//		sattement.execute(querryString);
		String insertSach = "insert into sach(NAME,AUTHOR,NUMBER_PAGE,MA_NXB) values (?,?,?,?) ";
		PreparedStatement pst = connection.prepareStatement(insertSach);
		pst.setString(1, "Đại Số");
		pst.setString(2, "Nguyễn Văn X");
		pst.setInt(3, 120);
		pst.setString(4, "123");
//		ResultSet resultSet = pst.executeQuery();

		String insertNXB = "insert into nxb(NAME,ADDRESS,MA_NXB) values (?,?,?) ";
		PreparedStatement pst2 = connection.prepareStatement(insertNXB);
		pst2.setString(1, "Kim Đồng");
		pst2.setString(2, "Hà Nội");
		pst2.setString(3, "123");
		try {
			boolean resultSet = pst.execute();
			resultSet = pst2.execute();
			connection.commit();
		} catch (Exception e) {
            connection.rollback();
		}

		connection.close();
		pst.close();
		pst2.close();
//		sattement.close();

	}

	public static void nhap(book book) throws SQLException {
//		Connection connection = DriverManager.getConnection(DB_INFO, USER_NAME,PASSWORD);
////		Statement sattement = connection.createStatement();
////		String querryString = "insert into book (NAME, AUTHOR,NUMBER_PAGE) values ('" + book_.getName() + "'," + "'"
////				+ book.getAuthor() + "'," + book.getNumber_page() + " )";
////		sattement.execute(querryString);
//		String insertString = "insert into sach(NAME,AUTHOR,NUMBER_PAGE) values (?,?,?) ";
//		PreparedStatement pst = connection.prepareStatement(insertString);
//		pst.setString(1, book.getName());
//		pst.setString(2, book.getAuthor());
//		pst.setInt(3, book.getNumber_page());
//		ResultSet resultSet = pst.executeQuery();
//		
//		connection.close();
//		pst.close();
////		sattement.close();
	}

	// 1) Tạo bảng Nhà xuất bản (MA_NXB -> primary key, Tên nhà xuất bản, địa chỉ)
	// 2) Trong phần nhập sách có điền thông tin nhà xuất bản =>
	// Khi lưu sách lưu 2 phần lưu vào bảng sách,
	// lưu vào bảng nhà xuất bản nếu như thông tin nhà xuất bản chưa có trong csdl
	// nếu như lưu sách thành công mà lưu nhà xuất bản thất bại thì sẽ rollbak lại
	// (xóa đi)
	// thông tin sách vừa lưu
	// và ngược lại

	public static void querry(String keyWord) throws SQLException {
		Connection connection = DriverManager.getConnection(DB_INFO, USER_NAME, PASSWORD);
//		Statement sattement = connection.createStatement();
//		String querryString = "select * from book where name='" + keyWord + "'";
//		ResultSet resultSet = sattement.executeQuery(querryString);

		String querryString = "select * from book where name= ?";
		PreparedStatement pst = connection.prepareStatement(querryString);
		pst.setString(1, keyWord);
		ResultSet resultSet = pst.executeQuery();

		while (resultSet.next()) {
			int id = resultSet.getInt("ID");
			String nameString = resultSet.getString("NAME");
			String authorString = resultSet.getString("AUTHOR");
			int mumber_page = resultSet.getInt("NUMBER_PAGE");
			System.out.println(id + " - " + nameString + " - " + authorString + " - " + mumber_page);
		}
		connection.close();
		pst.close();
//		sattement.close();
	}

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		int menu = -1;
		Scanner scan = new Scanner(System.in);
		while (menu != 0) {
			System.out.println("0: Nhập 0 để thoát");
			System.out.println("1: Nhập 1 để nhập sách");
			System.out.println("2: Nhập 2 để tìm sách");
			menu = scan.nextInt();
			// Nhập Sách, báo, tập chí
			if (menu == 1) {
				book book_ = new book();
				book_.nhap();
				nhap(book_);

			} else {
				if (menu == 2) {
					System.out.println("Nhập sách cần tìm: ");
					scan.nextLine();
					String tenString = scan.nextLine();
					querry(tenString);

				} else {
					if (menu == 3) {
						System.out.println("Bạn thoát");
						return;
					}
				}

			}

		}

	}

}
