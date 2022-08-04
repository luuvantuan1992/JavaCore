package lesson6.TinhGiaTienMotQuanCaPhe;

// Bắt đầu với Beverage class - super class của các loại đồ uống.

public abstract class Beverage {

	String description = "Unknown Beverage";

	public String getDescription() {
		return description;
	}

	public abstract double cost();
}