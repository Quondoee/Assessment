package test;

public class HourlyEmployee extends Employee  {
   private float hoursWorked;
   private double hourlyWage = 10.00;

    public HourlyEmployee(String name, char size, test.Cloth[] Cloth, double DISCOUNT) {
        super(name, size, Cloth, DISCOUNT);
    }


    @Override
    public void printInfo() {
        System.out.println("Name: " + getName() + "\n" + "Size: " + getSize() + "\n" +  );

    }

    @Override
    public void printPriceAfterDiscount(double Cloth) {

    }

    public float getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(float hoursWorked) {
        this.hoursWorked = hoursWorked;
    }

    public double getHourlyWage() {
        return hourlyWage;
    }

    public void setHourlyWage(double hourlyWage) {
        this.hourlyWage = hourlyWage;
    }

    @Override
    public boolean canGetFired() {
        return true;
    }

    @Override
    public double calculatePay() {
      double EarnedPay = hourlyWage * hoursWorked ;
        return EarnedPay;
    }
}
