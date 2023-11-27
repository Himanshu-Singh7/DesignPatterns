package FactoryDP;

public class WebDeveloper implements Employee{
    @Override
    public int Salary() {
        System.out.println("Getting web developer salary");
        return 40000;
    }
}
