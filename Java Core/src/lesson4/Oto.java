package lesson4;

// để biểu diễn 1 dối tượng là ô tô ngoài đời thực trong java
// sinh ra oop (hướng đối tượng) -> kiểu dữ liêu (int, char...)
// do ngdung tự định nghĩa
// tạo 1 class Oto
public class Oto {
    //    các đặc điểm của 1 ô tô biển số, hãng xe, màu sắc
    // thể hiện bằng các thuộc tính (biến instance)
    // mô tả bằng các danh từ mô tả các đặc điểm
    String bienSo;
    String hangXe;
    String mauSac;

    // mô tả các hành động, bằng các danh động từ, các hàm
    // => phương thức
    void chayXe(int tocDo) {
        System.out.println("Xe " + hangXe +
                " biển số " + bienSo +
                " chạy " + tocDo + " km/h");
    }
    void phanhXe(){
        System.out.println("Xe " + hangXe +
                " biển số " + bienSo + " đang phanh");
    }

}
