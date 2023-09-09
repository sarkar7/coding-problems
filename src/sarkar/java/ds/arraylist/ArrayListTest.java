package sarkar.java.ds.arraylist;

import sarkar.java.common.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class ArrayListTest {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        names.add("Sourabh");
        names.add("Ashish");
        names.add("Neeraj");
        names.add("Raj");
        names.add("Soumya");

        //System.out.println(names);
        //names.forEach(e -> System.out.println(e));
        //names.forEach(System.out::println);

        /*

        names.stream()
                .map(i -> i.concat("Sarkar"))
                .forEach(System.out::println);

        */

        List<Employee> employeeList = Employee.getEmployees();
        employeeList.stream()
                .filter(e -> e.getGender().equals("Male"))
                .peek(
                        e -> e.setName(e.getName().toUpperCase())
                ).forEach(System.out::println);




    }


}
