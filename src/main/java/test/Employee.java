package test;

public abstract class Employee extends Customer implements TerminateAble , Payable {
   protected final double DISCOUNT = 0.10;
    public Employee(String name, char size, test.Cloth[] Cloth, double DISCOUNT) {
        super(name, size, Cloth);

    }

    public double getDISCOUNT() {
        return DISCOUNT;
    }
}
