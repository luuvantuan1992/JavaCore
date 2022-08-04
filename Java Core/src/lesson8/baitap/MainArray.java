package lesson8.baitap;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class MainArray {
    final static int ASC = -1;// sắp xếp tăng dần
    final static int DESC = 1;// giảm dần
    final static List<Employee> employeeList = new ArrayList<>();

    static {
        employeeList.addAll(ObjectFile.readFullTimeEmployee());
        employeeList.addAll(ObjectFile.readPartTimeEmployee());
    }
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int input = 0;
        while (true){
            System.out.println("Menu");
            Employee employee = null;
            System.out.println("1: Nhập 1 để thêm mới NV part time");
            System.out.println("2: Nhập 2 để thêm mới NV full time");
            System.out.println("3: Nhập 3 để sắp xếp theo chiều tăng dần theo tên");
            System.out.println("4: Nhập 4 để sắp xếp theo chiều giảm dần theo tên");
            System.out.println("0: Nhập 0 để thoát");
            input = scanner.nextInt();
            scanner.nextLine();
            if (input == 1){
                employee = new PartTimeEmployee();
            } else if (input == 2) {
              employee = new FullTimeEmployee();
            } else if (input == 3) {
                sort(ASC);
            } else if (input == 4) {
                sort(DESC);
            }else if (input == 0) {
                System.out.println("Thoát");

                List<FullTimeEmployee> fullTimeEmployees = new ArrayList<>();
                List<PartTimeEmployee> partTimeEmployees = new ArrayList<>();
                for (Employee e: employeeList
                     ) {
                    if (e.type == EnumEmployee.FULL_TIME) fullTimeEmployees.add((FullTimeEmployee) e);
                    else partTimeEmployees.add((PartTimeEmployee)e);
                }
                ObjectFile.write(fullTimeEmployees, ObjectFile.FULLTIME);
                ObjectFile.write(partTimeEmployees, ObjectFile.PARTTIME);
                break;
            }
            if (employee != null) {
                employee.input(scanner);
            } else {
                System.out.println("Danh sách sắp xếp theo chiều "
                        + (input == 3 ? "tăng dần" : "giảm dần"));
                for (Employee e: employeeList
                     ) {
                    System.out.println(e.getName());
                }
            }
        }
    }

    /**
     *
     * @param direct : 1: chiều tăng dần, -1 chiều giảm dần
     */
    private static void sort(int direct) {
        employeeList.sort(new Comparator<Employee>() {
            @Override
            public int compare(Employee o1, Employee o2) {
                return o1.getName().compareTo(o2.getName()) * direct;
            }
        });
    }
}
