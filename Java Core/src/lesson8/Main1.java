package lesson8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import lesson7.HocSinh;

public class Main1 {
	public static void main(String[] args) {
		List<HocSinh> hocSinhList = new ArrayList<>();
		hocSinhList.add(new HocSinh("C", 12));
		hocSinhList.add(new HocSinh("A", 12));
		hocSinhList.add(new HocSinh("B", 12));
		hocSinhList.add(new HocSinh("A", 16));
		hocSinhList.add(new HocSinh("B", 12));

		Iterator<HocSinh> iterator = hocSinhList.iterator(); // design pattern iterator
		while (iterator.hasNext()) {
			HocSinh hocSinh = iterator.next();
			if (hocSinh.getName().equals("A"))
				iterator.remove();
		}

//		for (int i = 0; i < hocSinhList.size(); i++) {
//			if (hocSinhList.get(i).getName().equals("A"))
//				hocSinhList.remove(i);
//			    i--;
//		}

//        hocSinhList.remove(0);
//		hocSinhList.remove(new HocSinh("A", 15));

//		for (HocSinh hocSinh : hocSinhList) {
////			System.out.println(hocSinh.toString());
//			if (hocSinh.getName().equals("A")) {
//				hocSinhList.remove(hocSinh);
//			}
//		}

	}
}
