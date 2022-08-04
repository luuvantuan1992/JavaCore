package lesson6.QuanLyCanBo;

import java.time.LocalDate;

public class Engineer extends Officer {
	private String branch;
	private String degree;

	public Engineer(String name, String dateofBirth, String gender, String address, String idCardPeople, String branch,
			String degree) {
		super(name, dateofBirth, gender, address, idCardPeople);
		this.branch = branch;
		this.degree = degree;
	}

	public String getBranch() {
		return branch;
	}

	public void setBranch(String branch) {
		this.branch = branch;
	}

	@Override
	public String toString() {
		return "Engineer{" + "branch='" + branch + '\'' + ", degree='" + degree + '\'' + " , name='" + name + '\''
				+ ", dateofBirth=" + dateofBirth + ", gender='" + gender + '\'' + ", address='" + address + '\''
				+ " , idCardPeople='" + idCardPeople + '\'' + '}';
	}
}
