package lesson2.baitap;

public class Bai5 {
    public static void main(String[] args) {
        // trong năm 2022
        int thang = 1;
        switch (thang) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("tháng " + thang + " có 31 ngày");
                break;// dừng block
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("tháng " + thang + " có 30 ngày");
                break;// dừng block
            case 2:
                System.out.println("tháng " + thang + " có 24 ngày");
                break;// dừng block
            default:
                System.out.println("không xác định");
        }
    }
}
