package sarkar.java.java8;

import sarkar.java.common.Employee;

import java.util.List;
import java.util.stream.Collectors;

public class GroupByTest {

    public static void main(String[] args) {

        List<Employee> employeeList = Employee.getEmployees();

        employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.groupingBy(Employee::getYearOfJoining)))
                .forEach((key, value) -> {
                    value.forEach((k, v) -> {
                        System.out.println(key + " - " + k + " - " + v.size());
                    });
                });

    }

}
