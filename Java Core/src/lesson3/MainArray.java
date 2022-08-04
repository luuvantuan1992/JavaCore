package lesson3;

public class MainArray {
    public static void main(String[] args) {
        int i = 1;
        // tập hợp danh sách các phần tử
        // cùng 1 kiểu dữ liệu,
        // các ô nhớ lưu trữ sẽ sắp xếp liền nhau trong bộ nhớ

        int arr[] = new int[10];// khai báo mảng 10 phần tử
        int[] arr2 = new int[10];
        int arr3[] = new int[] {1,2,3,4,5,6,7,8,9,0};
        arr3[0] = 10;
        // duyệt mảng
        for (int index = 0; index < arr3.length; index ++) {
            // chỉ số chạy từ 0 đến length - 1
            System.out.println(arr3[index]);
        }


    }
}
