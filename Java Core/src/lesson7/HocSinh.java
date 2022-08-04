package lesson7;

import java.util.Objects;

import javax.script.Compilable;

public class HocSinh implements Comparable<HocSinh>{
	private String name;
	private int age;

	@Override
	public String toString() {
		return "HocSinh [name=" + name + ", age=" + age + "]";
	}

	public HocSinh(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}

	@Override
	public int hashCode() {
		return Objects.hash(name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HocSinh other = (HocSinh) obj;
		return Objects.equals(name, other.name);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public int compareTo(HocSinh o2) {
		// TODO Auto-generated method stub
		return this.getName().compareTo(o2.getName());
	}
}
