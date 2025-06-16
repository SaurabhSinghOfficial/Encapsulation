package in.kgcoding.Question_3;

public class testAccess {
    public static void main(String[] args) {
        Employee employee = new Employee("saurabh ", 30,30000);
        System.out.println(employee.employeeDetails());
//        employee.getName();

        employee.setName("singh ");
        System.out.println(employee.employeeDetails());
    }
}
