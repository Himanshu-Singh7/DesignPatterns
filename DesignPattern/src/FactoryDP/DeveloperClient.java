package FactoryDP;

public class DeveloperClient {
    public static void main(String[] args) {
        Employee androidDeveloper = EmployeeFactory.getEmployee("Android Developer");
        System.out.println(androidDeveloper);
        System.out.println("Salary : "+ androidDeveloper.Salary());

        Employee webDeveloper = EmployeeFactory.getEmployee("Web Developer");
        System.out.println(webDeveloper);
        int salary = webDeveloper.Salary();
        System.out.println("Salary : " +salary);

    }
}
