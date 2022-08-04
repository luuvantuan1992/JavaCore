package lesson8;

import java.util.HashMap;
import java.util.Map;

import lesson7.HocSinh;

public class MainMap {
	public static void main(String[] args) {
		Map<String, HocSinh> sinhMap = new HashMap<>(); // key đứng trước & value đứng sau ,
		// key không được phép trùng nhau

		sinhMap.put("1", new HocSinh("A", 12));
		sinhMap.put("2", new HocSinh("B", 13));
		sinhMap.put("3", new HocSinh("C", 14));
		sinhMap.put("1", new HocSinh("C", 14));

		for (Map.Entry<String, HocSinh> entry : sinhMap.entrySet()) {
			System.out.println("Key: " + entry.getKey() + ", value : " + entry.getValue().toString());
		}

		sinhMap.remove("1");

	}

}
