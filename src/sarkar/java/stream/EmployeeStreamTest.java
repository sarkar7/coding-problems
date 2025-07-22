package sarkar.java.stream;

import sarkar.java.common.Employee;

import java.util.*;
import java.util.stream.Collectors;

public class EmployeeStreamTest {

    public static void getCountOfMaleFemale(List<Employee> employeeList) {
        Map<String, Long> noOfMaleAndFemaleEmployees=
                employeeList.stream()
                        .collect(Collectors.groupingBy
                                (Employee::getGender, Collectors.counting()));
        System.out.println(noOfMaleAndFemaleEmployees);
    }

    public static void getDepartmentName(List<Employee> employeeList){
        employeeList.stream()
                .map(Employee::getDepartment)
                .distinct()
                .forEach(System.out::println);
    }

    public static void getGender(List<Employee> employeeList) {
        Map<String, Double> avgAge = employeeList.stream()
                .collect(Collectors.groupingBy
                        (Employee::getGender,
                                Collectors.averagingInt
                                        (Employee::getAge)));
        System.out.println(avgAge);
    }

    public static void getNameOfEmp(List<Employee> employeeList) {
        employeeList.stream()
                .filter(e -> e.getYearOfJoining() > 2015)
                .map(Employee::getName)
                .forEach(System.out::println);
    }

    public static void countByDept(List<Employee> employeeList) {
        Map<String, Long> countByDept = employeeList.stream()
                .collect(Collectors.groupingBy
                        (Employee::getDepartment,
                                Collectors.counting()));
        Set<Map.Entry<String, Long>> entrySet = countByDept.entrySet();
        for (Map.Entry<String, Long> entry : entrySet)
        {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }


    public static void avgSalary(List<Employee> employeeList) {
        Map<String, Double> avgSalary = employeeList.stream()
                .collect(Collectors.groupingBy
                        (Employee::getDepartment,
                                Collectors.averagingDouble(Employee::getSalary)));
        Set<Map.Entry<String, Double>> entrySet = avgSalary.entrySet();
        for (Map.Entry<String, Double> entry : entrySet) {
            System.out.println(entry.getKey()+" : "+entry.getValue());
        }
    }


    public static void oldestEmp(List<Employee> employeeList) {
        Optional<Employee> oldestEmp = employeeList.stream()
                .max(Comparator
                        .comparingInt(Employee::getAge));
        Employee oldestEmployee = oldestEmp .get();

        System.out.println("Name : "+oldestEmployee.getName());
        System.out.println("Age : "+oldestEmployee.getAge());
        System.out.println("Department : "+oldestEmployee.getDepartment());
    }

    public static void getEmpSalary(List<Employee> employeeList) {
        DoubleSummaryStatistics empSalary = employeeList.stream()
                .collect(Collectors
                        .summarizingDouble(Employee::getSalary));

        System.out.println("Average Salary = "+empSalary.getAverage());
        System.out.println("Total Salary = "+empSalary.getSum());
    }

    public static void listDownDept(List<Employee> employeeList) {
        Map<String, List<Employee>> empList = employeeList.stream()
                .collect(Collectors
                        .groupingBy(Employee::getDepartment));

        Set<Map.Entry<String, List<Employee>>> entrySet = empList.entrySet();

        for (Map.Entry<String, List<Employee>> entry : entrySet)
        {
            System.out.println("--------------------------------------");
            System.out.println("Employees In "+entry.getKey() + " : ");
            System.out.println("--------------------------------------");

            List<Employee> list = entry.getValue();
            for (Employee e : list)
            {
                System.out.println(e.getName());
            }
        }
    }

    public static void seniorEmp(List<Employee> employeeList) {
        Optional<Employee> seniorEmp = employeeList.stream()
                .sorted(Comparator
                        .comparingInt(Employee::getYearOfJoining)).findFirst();

        Employee seniorMostEmployee = seniorEmp.get();

        System.out.println("Senior Most Employee Details :");
        System.out.println("----------------------------");
        System.out.println("ID : "+seniorMostEmployee.getId());
        System.out.println("Name : "+seniorMostEmployee.getName());
        System.out.println("Age : "+seniorMostEmployee.getAge());
    }
}
