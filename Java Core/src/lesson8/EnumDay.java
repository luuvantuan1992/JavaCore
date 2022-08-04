package lesson8;

public enum EnumDay {
	THU_2(2), THU_3(3), THU_4(4), THU_5(5), THU_6(6), THU_7(7), CHU_NHAT(1);

	int value;

	private EnumDay(int i) {
		value = i;
	}
	
//	public EnumDay getEnumDay(int i) {
//		return new EnumDay(i);
//	}

}
