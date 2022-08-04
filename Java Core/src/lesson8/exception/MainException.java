package lesson8.exception;

import java.util.Scanner;

public class MainException {
	public static void main(String[] args) throws CheckedExceptionExample {
//		// try catch không làm gián đoạn chương trình
		
//		FileNotFoundException 
//		try {
//			testCheckedException();
//		} catch (CheckedExceptionExample checkedExceptionExample) {
//			// TODO Auto-generated catch block
//			checkedExceptionExample.printStackTrace();
//		}
     	testUnCheckedException();
		// làm gián đoạn chương trình
//		testCheckedException();
		System.out.println("Cuối chương trình");
	}

	private static void testCheckedException() throws CheckedExceptionExample {
		System.out.println("checked exception");
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		if(num == 0)
		throw new CheckedExceptionExample("Bạn vừa nhập số 0");
	}
	
	private static void testUnCheckedException() {
		System.out.println("checked exception");
		throw new UnCheckedException("Đây là ví dụ"); // unchecked
	}
}
