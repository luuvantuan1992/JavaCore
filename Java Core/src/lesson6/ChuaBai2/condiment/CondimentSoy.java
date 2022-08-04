package lesson6.ChuaBai2.condiment;

import lesson6.ChuaBai2.cafe.CafeAbstract;

public class CondimentSoy extends CondimentDecorater{

	public CondimentSoy(CafeAbstract cafe) {
		super(cafe);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int cost() {
		// TODO Auto-generated method stub
		return cafe.cost() + 15 ;
	}

}
