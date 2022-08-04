package lesson8.baitap;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class ObjectFile {


    final static String PARTTIME = "D:\\opt\\image\\parttime.bin";
    final static String FULLTIME = "D:\\opt\\image\\fulltime.bin";

    public static List<PartTimeEmployee> readPartTimeEmployee() {
        List<PartTimeEmployee> sArr = new ArrayList<>();
        try {
            //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
            FileInputStream fis = new FileInputStream(PARTTIME);
            ObjectInputStream ois = new ObjectInputStream(fis);
            //Bước 2: Đọc dữ liệu
            sArr = ((List<PartTimeEmployee>) ois.readObject());
//            for (Object o: objectList
//                 ) {
//                sArr.add((T)o);
//            }
            //Bước 3: Đóng luồng
            fis.close();
            ois.close();
        } catch (Exception ex) {
            System.out.println("Loi doc file: " + ex);
        }
        return sArr;
    }

    public static List<FullTimeEmployee> readFullTimeEmployee() {
        List<FullTimeEmployee> sArr = new ArrayList<>();
        try {
            //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
            FileInputStream fis = new FileInputStream(FULLTIME);
            ObjectInputStream ois = new ObjectInputStream(fis);
            //Bước 2: Đọc dữ liệu
            sArr = ((List<FullTimeEmployee>) ois.readObject());
            //Bước 3: Đóng luồng
            fis.close();
            ois.close();
        } catch (Exception ex) {
            System.out.println("Loi doc file: " + ex);
        }
        return sArr;
    }

    public static <T> void write(List<T> s, String fileStr) {
        try {
            //Bước 1: Tạo đối tượng luồng và liên kết nguồn dữ liệu
            FileOutputStream fos = new FileOutputStream(fileStr);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            //Bước 2: Ghi mảng đối tượng vào file
            oos.writeObject(s);
            //Bước 3: Đóng luồng
            fos.close();
            oos.close();
        } catch (IOException ex) {
            System.out.println("Loi ghi file: " + ex);
        }
    }
}