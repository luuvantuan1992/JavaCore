package lesson8.baitap;

import java.io.File;
import java.io.IOException;

public class MainFile {

    public static void main(String[] args) {
        File file = new File("D:\\opt\\image\\16461429245705.png");
        if (file.exists()) {
            System.out.println("File tồn tại");
        } else {
            System.out.println("File không tồn tại");
            try {
                file.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        File folder = new File("D:\\opt\\image");
        if (folder.isFile()){
            System.out.println("Đây là file");
        } else if (folder.isDirectory()) {
            System.out.println("Đây là thư mục");
        }
        File folder2 = new File("D:\\opt\\image\\test\\abc");
        folder2.mkdirs();
    }
}
