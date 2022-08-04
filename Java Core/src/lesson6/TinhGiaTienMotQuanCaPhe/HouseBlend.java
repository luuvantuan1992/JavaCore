package lesson6.TinhGiaTienMotQuanCaPhe;

//Một loại đồ uống khác. Chúng ta chỉ cần đặt lại mô tả và trả về giá của đúng loại đồ uống đó.
public class HouseBlend extends Beverage {
	public HouseBlend() {
		description = "House Blend Coffee";
	}

	public double cost() {
		return 0.89;
	}
}