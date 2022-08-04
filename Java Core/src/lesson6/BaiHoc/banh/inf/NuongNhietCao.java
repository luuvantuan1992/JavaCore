package lesson6.BaiHoc.banh.inf;

public interface NuongNhietCao {
	// int a = 1 : biến static , final
	void nuongNhietCao();
    // liệu interface ngoài phương thức abstract  thì nó có thể implement hàm được không
	
	default void nuongNhietCao_2(){ //  java 8 trở lên
		System.out.println("");
	}
}
