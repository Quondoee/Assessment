package test;

public abstract class Customer extends Person {
 private clothingitems[] Cloth;
    public Customer(String name, char size , Cloth[] Cloth) {
        super(name, size);
    }
    public abstract void printPriceAfterDiscount(double Cloth);
}
