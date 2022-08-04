package lesson8.baitap;

import java.util.Scanner;

public class PartTimeEmployee extends Employee {
    int workingHour;

    public PartTimeEmployee(String name, int paymentPerHour, int workingHour) {
        super(name, paymentPerHour);
        this.workingHour = workingHour;
        this.type = EnumEmployee.PART_TIME;
    }
    public PartTimeEmployee() {
        this.type = EnumEmployee.PART_TIME;
    }

    @Override
    public void input(Scanner scanner) {
        super.input(scanner);
        System.out.print("Số giờ làm trong ngày: ");
        this.workingHour = scanner.nextInt();
        scanner.nextLine();
    }

    @Override
    public int caculatorSalary() {
        return this.workingHour * this.paymentPerHour;
    }
}
