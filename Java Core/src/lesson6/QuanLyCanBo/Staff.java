package lesson6.QuanLyCanBo;

import java.time.LocalDate;

public class Staff extends Officer {
	private String task;

	public Staff(String name, String dateofBirth, String gender, String address, String idCardPeople, String task) {
		super(name, dateofBirth, gender, address, idCardPeople);
		this.task = task;
	}

	public String getTask() {
		return task;
	}

	public void setTask(String task) {
		this.task = task;
	}

	@Override
	public String toString() {
		return "Staff{" + "task='" + task + '\'' + ", name='" + name + '\'' + ", dateofBirth=" + dateofBirth
				+ ", gender='" + gender + '\'' + ", address='" + address + '\'' + " , idCardPeople='" + idCardPeople
				+ '\'' + '}';
	}
}
