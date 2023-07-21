public class MainEmployee {
    public static void main(String[] args) {
        Employee employee = new Employee("Kadir Buğra", 1200, 45, 2015);
        System.out.println(employee);
        System.out.println("Tax: " + employee.tax());
        System.out.println("Bonus: " + employee.bonus());
        employee.raiseSalary();
        System.out.println("Updated Salary: " + employee.getSalary());
    }

}
