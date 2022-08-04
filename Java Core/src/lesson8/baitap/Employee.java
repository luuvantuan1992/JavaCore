package lesson8.baitap;

import java.io.Serializable;
import java.util.*;

public abstract class Employee implements IEmployee, Serializable {
    private String name;
    protected int paymentPerHour;
    protected EnumEmployee type;

    public Employee(String name, int paymentPerHour) {
        this.name = name;
        this.paymentPerHour = paymentPerHour;
    }
    public Employee() {
    }

    @Override
    public String getName() {
        return this.name;
    }

    public void input(Scanner scanner) {
        System.out.println("*******************************************");
        System.out.println("Nhập thông tin nhân viên "
                + (type == EnumEmployee.FULL_TIME ? "full time" : "part time"));
        System.out.print("Họ và tên: ");
        this.name = scanner.nextLine();
//        Map<String, Employee> employeeSet = new HashMap<>();
//        employeeSet.put(this.name, this);
//        employeeSet.containsKey(this.name)
        while (MainArray.employeeList.contains(this)) {
            System.out.println("Employee đã trùng nhập lại họ và tên");
            this.name = scanner.nextLine();
        }
        System.out.print("Lương trên 1 giờ: ");
        this.paymentPerHour = scanner.nextInt();
        scanner.nextLine();
        MainArray.employeeList.add(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }
}
