package lesson6.ChuaBai2.condiment;

import lesson6.ChuaBai2.cafe.CafeAbstract;
import lesson6.TinhGiaTienMotQuanCaPhe.CondimentDecorator;

public class CondimentMilk extends CondimentDecorater {

	public CondimentMilk(CafeAbstract cafe) {
		super(cafe);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return cafe.cost() + 10 ;
	}

}
