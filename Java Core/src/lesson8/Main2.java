package lesson8;

public class Main2 {
	public static void main(String[] args) {
		String a = "t3h";
		String b = "t3h";
		String c = new String("t3h");

		if (a == b) {
			System.out.println("a == b");
		} else {
			System.out.println("a != b");
		}
		if (a == c) {
			System.out.println("a == c");
		} else {
			System.out.println("a != c");
		}

		if (a.equals(b)) {
			System.out.println("a equals b");
		} else {
			System.out.println("a not equals b");
		}
		if (a.equals(c)) {
			System.out.println("a equals c");
		} else {
			System.out.println("a not equals c");
		}
	}
}
