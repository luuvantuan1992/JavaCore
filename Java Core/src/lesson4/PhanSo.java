package lesson4;

public class PhanSo {
    private int tuSo;
    private int mauSo;

    // khi mình định nghĩa hàm khởi có tham số
    // thì hàm khởi mặc định sẽ bị ghi đè
    PhanSo (int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }
    // overloading:
    // giống tên hàm và khác tham số truyền vào(khác kiểu dữ liệu tham số, số lượng tham số)
    PhanSo () {
        this.tuSo = 0;
        this.mauSo = 1;
    }
    // Khi nào dùng overloading
    public void hienThi(){
        System.out.println(tuSo + "/" + mauSo);
    }
    void hienThi(long mauso, int tuSo){
        System.out.println(tuSo + "/" + mauSo);
    }
    void hienThi(int tuSo, long mauso){
        System.out.println(tuSo + "/" + this.mauSo);
    }


    public String toString(){
        int i = timUSCLN(tuSo, mauSo);
        return tuSo/i + "/" + mauSo/i;
    }

    PhanSo cong(PhanSo a) {
        PhanSo ketQua = new PhanSo();
        ketQua.tuSo = a.tuSo * this.mauSo + a.mauSo * this.tuSo;
        ketQua.mauSo = a.mauSo * this.mauSo;
        return ketQua;
    }

    public int timUSCLN(int a, int b) {
        while (a != b) {
            if (a > b) {
                a -= b;
            } else {
                b -= a;
            }
        }
        return a;
    }



    void setMauSo(int mauSo){ // mauSo = 2
        this.mauSo = mauSo;
    }
}
