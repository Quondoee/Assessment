package test;

public abstract class Person {

    private String name;
    private char size;

    public Person(String name , char size){
        this.name = name;
        this.size = size;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char Size) {
        this.size = size;
    }
    public abstract void printInfo();

    }

