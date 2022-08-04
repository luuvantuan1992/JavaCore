package lesson6.QuanLyCanBo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import lesson5.QuanLyTaiLieu.TaiLieu;

public class ManagerOfficer {
	private List<Officer> officers;

	public ManagerOfficer() {
		this.officers = new ArrayList<>();
	}

	public void addOfficer(Officer officer) {
		this.officers.add(officer);
	}

	public List<Officer> searchOfficerByName(String name) {
		return this.officers.stream().filter(o -> o.getName().contains(name)).collect(Collectors.toList());
	}

	public void showListInforOfficer() {
		this.officers.forEach(o -> System.out.println(o.toString()));
	}

	public boolean deleteOfficerByIDCardPeople(String idCardPeople) {
		Officer doc = this.officers.stream().filter(officers -> officers.getidCardPeople().equals(idCardPeople))
				.findFirst().orElse(null);
		if (doc == null) {
			return false;
		}
		this.officers.remove(doc);
		return true;
	}
}
