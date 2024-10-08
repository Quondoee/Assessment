package test;

public class Student extends Customer {
    private long studentID;
    private long studentsCounter;
    private final double DISCOUNT = 5.00;
    public Student(String name, char size, test.Cloth[] Cloth , double DISCOUNT) {
        super(name, size, Cloth );
    }

    @Override
    public void printInfo() {

    }

    @Override
    public void printPriceAfterDiscount(double Cloth) {

    }

    public long getStudentID() {
        return studentID;
    }

    public void setStudentID(long studentID) {
        this.studentID = studentID;
    }

    public long getStudentsCounter() {
        return studentsCounter;
    }

    public void setStudentsCounter(long studentsCounter) {
        this.studentsCounter = studentsCounter;
    }

    public double getDISCOUNT() {
        return DISCOUNT;
    }
}
