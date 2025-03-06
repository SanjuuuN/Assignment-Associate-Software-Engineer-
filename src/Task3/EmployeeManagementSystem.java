import java.util.ArrayList;
import java.util.List;

public class EmployeeManagementSystem {
	public static void main(String[] args) {
		
        Employee firstEmployee = new Employee(101, "Sanjivani Gulve", 60000);
        Employee secondEmployee = new Employee(102, "Lakshana Rane", 55000);
        Employee thirdEmployee = new Employee(103, "Aanchal Kohale", 70000);

        // Storing employees in a list
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(firstEmployee);
        employeeList.add(secondEmployee);
        employeeList.add(thirdEmployee);

        // Displaying employee details using for each loop
        System.out.println("Employee Details:");
        for (Employee emp : employeeList) {
            emp.displayDetails();
        }
	}
}
