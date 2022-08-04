package lesson6.QuanLyCanBo;

import java.time.LocalDate;

public class Officer {
	protected String name;
	protected String dateofBirth;
	protected String gender;
	protected String address;

	protected String idCardPeople;

	public Officer(String name, String dateofBirth, String gender, String address, String idCardPeople) {
		this.name = name;
		this.dateofBirth = dateofBirth;
		this.gender = gender;
		this.address = address;
		this.idCardPeople = idCardPeople;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDateofBirth() {
		return dateofBirth;
	}

	public void setDateofBirth(String dateofBirth) {
		this.dateofBirth = dateofBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getidCardPeople() {
		return idCardPeople;
	}

	public void setidCardPeople(String idCardPeople) {
		this.idCardPeople = idCardPeople;
	}
}
