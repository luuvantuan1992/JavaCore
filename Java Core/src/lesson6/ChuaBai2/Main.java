package lesson6.ChuaBai2;

import lesson6.ChuaBai2.cafe.CafeAbstract;
import lesson6.ChuaBai2.cafe.CafeDecaf;
import lesson6.ChuaBai2.condiment.CondimentMilk;
import lesson6.ChuaBai2.condiment.CondimentMocha;

public class Main {
	public static void main(String[] args) {
      CafeAbstract decaf  = new CafeDecaf(); //  pha 1 cốc decaf nguyên chất
      decaf = new CondimentMilk(decaf); // decaf thêm sữa
      decaf = new CondimentMocha(decaf); // decaf thêm mocha
      
      System.out.println("Decaf + Milk + Mocha " + decaf.cost());
	}
	
}
