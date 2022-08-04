package lesson6.ChuaBai2.condiment;

import lesson6.ChuaBai2.cafe.CafeAbstract;

public abstract class CondimentDecorater extends CafeAbstract {
	protected CafeAbstract cafe;

	public CondimentDecorater(CafeAbstract cafe) {
		super();
		this.cafe = cafe;
	}

}
