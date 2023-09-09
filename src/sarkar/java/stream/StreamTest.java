package sarkar.java.stream;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import sarkar.java.common.Employee;

public class StreamTest {

	public static void main(String[] args) {

		List<Employee> employees = Employee.getEmployees();


        // Filter
        employees.stream()
                .filter(e -> e.getSalary() >= 60000)
                .forEach(e -> System.out.println(e.getName()));
        System.out.println("**************");

        // Grouping
        Map<Double, Long> counting = employees.stream()
                .collect(Collectors.groupingBy(Employee::getSalary, Collectors.counting()));

        counting.forEach((k, v) -> System.out.println(k + " - " + v));
        System.out.println("**************");

        // Sorting based on name
        employees.stream()
                .sorted(Comparator.comparing(Employee::getName))
                .forEach(e -> System.out.println(e.getName()));
        System.out.println("**************");

        // Reverse Sorting based on name
        employees.stream()
                .sorted(Comparator.comparing(Employee::getName).reversed())
                .forEach(e -> System.out.println(e.getName()));
        System.out.println("**************");

        // Calculating Average
        double avgSal = employees.stream()
                .mapToDouble(Employee::getSalary)
                .average()
                .getAsDouble();
        System.out.println(avgSal);
        System.out.println("**************");


        // increase the salary of employees by 10% whose salary is less than 10K and sort them by name using descending order
        employees.stream()
                .filter(e -> e.getSalary() < 20000)
                .map(employee -> {
                    double hike = employee.getSalary()*10/100;
                    employee.setSalary(employee.getSalary() + hike);
                    return employee;
                })
                .sorted(Comparator.comparing(Employee::getName).reversed())
                .forEach(e -> System.out.println(e.getName()));


	}

}
