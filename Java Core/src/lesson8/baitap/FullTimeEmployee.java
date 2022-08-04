package lesson8.baitap;

public class FullTimeEmployee extends Employee {
    public FullTimeEmployee(String name, int paymentPerHour) {
        super(name, paymentPerHour);
        this.type = EnumEmployee.FULL_TIME;
    }
    public FullTimeEmployee() {
        this.type = EnumEmployee.FULL_TIME;
    }

    @Override
    public int caculatorSalary() {
        return this.paymentPerHour * 8;
    }
}
