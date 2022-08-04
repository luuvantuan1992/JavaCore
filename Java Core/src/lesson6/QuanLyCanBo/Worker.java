package lesson6.QuanLyCanBo;

import java.time.LocalDate;

public class Worker extends Officer {
	private int level;

	public Worker(String name, String dateofBirth, String gender, String address, String idCardPeople, int level) {
		super(name, dateofBirth, gender, address, idCardPeople);
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "Worker{" + "level=" + level + ", name='" + name + '\'' + ", dateofBirth=" + dateofBirth + ", gender='"
				+ gender + '\'' + ", address='" + address + '\'' + " , idCardPeople='" + idCardPeople + '\'' + '}';
	}
}
