package lesson8;

import java.util.Scanner;

public class MainEnum {
	public static void main(String[] args) {
		Integer a = 1;
		Integer b = 1;

		EnumDay z = EnumDay.CHU_NHAT;
		EnumDay y = EnumDay.CHU_NHAT;

		Scanner scanner = new Scanner(System.in);
		int day = scanner.nextInt();

		EnumDay e = EnumDay.THU_2;
		switch (e) {
		case THU_2:
			System.out.println("Thứ 2");
			break;
		case THU_3:
			System.out.println("Thứ 3");
			break;
		}

	}
}
