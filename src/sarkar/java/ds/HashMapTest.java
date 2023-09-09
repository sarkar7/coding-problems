package sarkar.java.ds;

import sarkar.java.common.Employee;

import java.security.KeyStore;
import java.util.*;

public class HashMapTest {

    public static void main(String[] args) {

        List<Employee> employeeList = Employee.getEmployees();
        // System.out.println(employeeList);

        //Remove Duplicates from list
        Set<Employee> uniqueEmployees = new HashSet<>(employeeList);
        // System.out.println(uniqueEmployees);


        /*

        Map<String, Integer> map = new HashMap<>();
        employeeList.forEach(
                i -> map.put(i.getName(), i.getAge())
        );
        System.out.println(map);


        //Sort the map by its value
        map.entrySet()
                .stream()
                .sorted(Map.Entry.comparingByValue())
                .forEach(System.out::println);
        */

        Map<String, Employee> map = new HashMap<>();
        employeeList.forEach(
                i -> map.put(i.getName(), i)
        );

        map.entrySet()
                .stream()
                .filter(i -> i.getValue().getSalary() > 54000)
                //.map(m -> m.getValue().setName("a"))
                .forEach(j -> System.out.println(j.getValue()));


    }

}
