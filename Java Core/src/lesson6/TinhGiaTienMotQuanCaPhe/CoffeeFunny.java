package lesson6.TinhGiaTienMotQuanCaPhe;

//Tính giá của một vài loại đồ uống.

public class CoffeeFunny {
	public static void main(String args[]) {
		Beverage beverage = new Espresso();
		System.out.println(beverage.getDescription() + " $" + beverage.cost());
		// Tạo ra một đối tượng DarkRoast
		Beverage beverage2 = new DarkRoast();
		// "Gói" đối tượng trên với một đối tượng Mocha
		beverage2 = new Mocha(beverage2);
		// "Gói" tiếp đối tượng trên với một đối tượng Mocha nữa
		beverage2 = new Mocha(beverage2);
		// Cuối cùng gói bằng một đối tượng Whip
		beverage2 = new Whip(beverage2);
		System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
		// Tương tự trên, đồ uống HouseBlend với Soy, Mocha, Whip.
		Beverage beverage3 = new HouseBlend();
		beverage3 = new Mocha(beverage3);
		beverage3 = new Mocha(beverage3);
		beverage3 = new Whip(beverage3);
		System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
	}
}