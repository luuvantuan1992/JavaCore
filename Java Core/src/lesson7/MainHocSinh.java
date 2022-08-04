package lesson7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class MainHocSinh {
	public static void main(String[] args) {
		Set<HocSinh> hocSinhs = new HashSet<>();
		hocSinhs.add(new HocSinh("Nguyễn Văn A", 12));
		hocSinhs.add(new HocSinh("Trần Văn Z", 13));
		hocSinhs.add(new HocSinh("Lê Đình S", 15));
		hocSinhs.add(new HocSinh("Bùi Thị K", 16));
		hocSinhs.add(new HocSinh("A N", 20));

		List<HocSinh> hocSinhList = new ArrayList<>(hocSinhs);

		for (HocSinh hocSinh : hocSinhList) {
			System.out.println(hocSinh.toString());
		}
		// Cách 1 :
		Collections.sort(hocSinhList, new Comparator<HocSinh>() {

			@Override
			public int compare(HocSinh o1, HocSinh o2) {
				String[] split1 = o1.getName().split("");
				String[] split2 = o2.getName().split("");
				// TODO Auto-generated method stub
				return split1[split1.length - 1].compareTo(split2[split2.length - 1]);
//				return o1.getName().compareTo(o2.getName()); // Chiều tăng dần chữ cái
//				return o2.getName().compareTo(o1.getName()); // Chiều giảm dần chữ cái
			}
		});

//		Collections.sort(hocSinhList);
		System.out.println("================");

		for (HocSinh hocSinh : hocSinhList) {
			System.out.println(hocSinh.toString());
		}

	}
}
