package FactoryDP;

public class AndroidDeveloper implements Employee{


    @Override
    public int Salary() {
        System.out.println("Getting Android developer salary");
        return 50000;
    }
}
