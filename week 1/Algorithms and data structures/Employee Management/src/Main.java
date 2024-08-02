
public class Main {
    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(5);

        Employee emp1 = new Employee("E001", "Alice", "Manager", 75000);
        Employee emp2 = new Employee("E002", "Bob", "Developer", 60000);
        Employee emp3 = new Employee("E003", "Charlie", "Designer", 55000);

        ems.addEmployee(emp1);
        ems.addEmployee(emp2);
        ems.addEmployee(emp3);

        System.out.println("All Employees:");
        ems.traverseEmployees();

        System.out.println("\nSearch for E002:");
        Employee searchedEmployee = ems.searchEmployee("E002");
        System.out.println(searchedEmployee != null ? searchedEmployee : "Employee not found!");

        System.out.println("\nDelete Employee E002:");
        ems.deleteEmployee("E002");
        ems.traverseEmployees();
    }
}

