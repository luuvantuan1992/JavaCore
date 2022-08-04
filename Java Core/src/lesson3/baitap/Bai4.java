package lesson3.baitap;

public class Bai4 {
    static String str = "Ngôn ngữ lập trình Java ban đầu được phát triển bởi Sun Microsystems do James Gosling khởi xướng và phát hành vào năm 1995. Phiên bản mới nhất của Java Standard Edition là Java SE 8. Với sự tiến bộ của Java và sự phổ biến rộng rãi của nó, nhiều cấu hình đã được xây dựng để phù hợp với nhiều loại nền tảng khác nhau. Ví dụ: J2EE cho các ứng dụng doanh nghiệp, J2ME cho các ứng dụng di động.";

    public static void main(String[] args) {
        bai3();
    }

    static void bai3() {
        // bước 1: cắt các từ
        String[] split = str.toLowerCase().replaceAll("(\\.|;|,)", "")
//                .replaceAll("\\.", "")
//                .replaceAll(",", "")
//                .replaceAll(":", "")
                .split(" ");
        // bước 2: Tạo 1 mảng chứa các từ đã đếm rồi, 1 mảng chứa số lượng từ
        String arrStr[] = new String[split.length];
        int index = 0;
        for (int i = 0; i < split.length - 1; i++) {
            int count = 0;
            if (kiemTraTuDaDemRoi(arrStr, split[i]))continue;// đã được đếm rồi
            for (int j = i; j < split.length; j++) {
                if (split[i].equalsIgnoreCase(split[j])) count++;
            }
            arrStr[index++] = split[i];
            System.out.println(arrStr[i] + " có " + count + " từ");
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < split.length - 1; i++) {
            stringBuilder
                    .append(split[i].substring(0, 1).toUpperCase())
                    .append(split[i].substring(1, split[i].length()));
            if (i != split.length - 1 )
                stringBuilder.append(" ");
        }
        System.out.println(stringBuilder.toString());

    }

    /**
     * @return chỉ số cuối cùng khác null
     * của từ trong mẩng nếu từ đó chưa được đếm rồi -1 ngược lại
     */
    static boolean kiemTraTuDaDemRoi(String[] arrStr, String str) {
        for (int i = 0; i < arrStr.length; i++) {
            if (arrStr[i] == null) return false;
            if (str.equalsIgnoreCase(arrStr[i])) return true;
        }
        return false;
    }
}
