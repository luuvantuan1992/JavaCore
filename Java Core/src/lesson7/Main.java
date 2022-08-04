package lesson7;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Main {
	public static void main(String[] args) {
		int[] array = new int[5];
		for (int i = 0; i < 5; i++) {
			array[i] = i;
		}

		// thêm 1 phần tử vào mảng 5 phần tử trên
		// Chạy theo cơ chế mảng
		List<Integer> integerList = new ArrayList<>();
		// sử dụng màng -> tạo 10 phần tử -> đầy 10 phần tử
		// -> tạo 1 mảng có 15 phần tử và copy -> đầy 15 tiếp
		// -> tạo 1 mảng có 22 phần tử và copy -> đầy 15 tiếp
		// Set là 1 mảng có 2 phần tử mà ko phần tử nào trùng nhau
		integerList.add(1);
		integerList.add(2);
		integerList.remove(1);

		List<Integer> linkedList = new LinkedList<>(); // linklist

		// Set : 2 phần tử không trùng nhau
		Set<Integer> set = new HashSet<>();
		set.add(1);
		set.add(2);
		set.add(3);
		set.add(2);
		
//		set.contains(1);)
		for (Integer i : set) {
			System.out.println("Số" + i);
		}

		Set<HocSinh> setHocSinh = new HashSet<>(); // equals và hashcode
		setHocSinh.add(new HocSinh("A", 12));
		setHocSinh.add(new HocSinh("B", 13));
		setHocSinh.add(new HocSinh("A", 14));
		HocSinh h = new HocSinh("A", 17);
		for (HocSinh hs : setHocSinh) {
			if (hs.equals(h))
				System.out.println("Bằng Nhau");
			System.out.println(hs.getName() + " - " + hs.getAge());
		}
		System.out.println("SET setHocSinh có chứa học sinh tên là A hay không ? ");
		System.out.println(setHocSinh.contains(new HocSinh("A", 17)));

		// làm thế nào để biết 2 đối tượng của 1 class là bằng nhau
		
		
		// Không có 2 phần tử trùng và được sắp xếp   : equals và hashcode , implement comparable
		TreeSet<HocSinh> hocSinhTreeSet = new TreeSet<>();

	}
}
