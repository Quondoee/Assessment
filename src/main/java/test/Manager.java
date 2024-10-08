package test;

public class Manager extends Employee {
   protected  final double EXTRA_DISCOUNT = 5.00;
   private double salary;
    public Manager(String name, char size, test.Cloth[] Cloth, double EXTRA_DISCOUNT , double salary) {
        super(name, size, Cloth, EXTRA_DISCOUNT);
    }

    @Override
    public void printInfo() {

    }

    @Override
    public void printPriceAfterDiscount(double Cloth) {

    }

    public double getEXTRA_DISCOUNT() {
        return EXTRA_DISCOUNT;
    }

    @Override
    public boolean canGetFired() {
        return true;
    }

    @Override
    public  double calculatePay() {
        return  salary;
    }
}
