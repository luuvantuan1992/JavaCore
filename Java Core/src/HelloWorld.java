import java.util.Scanner;

public class HelloWorld {

	// gõ main + ctrl + space
	// Hàm chạy chương trình chính - comment trên 1 dòng - ctrl + /
	/* comment nhiều dòng - Ctrl + shift + / */
	public static void main(String[] args) {
		// in ra màn hình console
		// sysout + ctrl + space
		// Để debug f6 là chạy xuống dong, f8 là chạy hết
		System.out.println("Xin chào đến với lớp JAVA 2204E BE Online");
		System.out.println("Đây là buổi học đầu tiên");// ln <=> break line
		System.out.print("hello world ");
		System.out.print("đây là t3h \n");
		// xóa dòng dùng cú pháp ctrl + d
		// nhập từ bàn phím
		Scanner scanner = new Scanner(System.in);
		System.out.println(" Nhập vào họ và tên");
		String hoVaTen = scanner.nextLine();// chờ người dùng nhập bàn phím cho đến khi gặp ký tự enter
		
		// Nhập vào từ bàn phím và in ra họ và tên, tuổi, và địa chỉ
		// format code thì dùng ctrl + shift + f
		System.out.println("Họ và tên vừa nhập: " + hoVaTen);
		System.out.println("Nhập tuổi");
		int tuoi = scanner.nextInt();// nextInt() sẽ còn 1 ký tự enter trong bộ nhớ đệm
		scanner.nextLine();
		System.out.println("Tuổi bạn vừa nhập: " + tuoi);
		System.out.println("Nhập địa chỉ");
		String diaChi = scanner.nextLine();
		System.out.println("Địa chỉ bạn mới nhập: " + diaChi);
		// tại sao xảy ra lỗi
		
	}

}
