package lesson2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// tên biến dạng 1 danh từ, có ý nghĩa, chữ đầu viết Thường các từ ghép viết hoa
		// chữ đầu
		int tongSoHang = 2 + 3;
		System.out.println("Tổng của 2 và 3 là: " + tongSoHang);
		int tongbaSo = tongSoHang + 4;
		System.out.println("tổng của 2 và 3 và 4 là: " + tongbaSo);
		// có những kiểu dữ liệu nào?
		boolean boolTrue = true;// đúng
		boolean boolFalse = false;// đúng
//		boolean -> 1 bit
		char c = 'a';// 8 bit (-128 -> 127) 0 -> 127
		System.out.println(c);
		// kiểu số nguyên
		byte b1 = 100; // 1 byte <=> 8 bit (-128 -> 127) -2^7 - > 2^7 -1
		short s = 100;// 2 byte 16 bit -2^15 -> 2^15 - 1
		int i = 100;// 4 byte 32 bit -2^31 -> 2^31 - 1
		long l = 100;// 8 byte 64 bit -2^63 -> 2^63 - 1
		// số thực
		float f = 1.2f;// 4 byte
		double d = 1.2d;// 8 byte

		System.out.println("3 chia cho 2 dư " + (3 % 2));
		int x = 1;// x =1
		int y = x--;// y = x; x = x + 1; => y = 1, x = 2
		int z = --x;// x = x + 1; z = x; => x = 3; z = 3;
		System.out.println("x= " + x + ", y= " + y + ", z= " + z);
		y = x + 1; y += x;
		
		System.out.println(2 == 3);
//		đúng và đúng = đúng ; true && true = true
//		 đúng và sai = sai ; true && false = false;
//		sai và sai = sai ;false && false = false;
		
//		đúng hoặc đúng = đúng ; true || true = true
//		 đúng hoặc sai = đúng ; true || false = true;
//		sai hoặc sai = sai ;false || false = false;
		
		System.out.println((2 == 3) && (4 == 4));
		
		if(2 == 3) {
			System.out.println("2 == 3");
		} else if( 2==4) {
			System.out.println("2 == 4");
		} else {
			System.out.println("2 != 3 và 4");
		}
		// dựa vào câu lệnh if else giải phương trình bâc nhât ax + b = 0
		// nhập vào từ bàn phím a và b
		

		int a = 3; int b = 2;
		char cc = 'c';
		System.out.println("a/b = " + (3/(float)2));
		System.out.println(cc + 1);


	}

	


	
	
	
}




