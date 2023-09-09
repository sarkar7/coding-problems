package sarkar.java.reflection;

public class Employee {

    private String name;
    private Integer age;
    private Double salary;

    private Employee(String name, Integer age, Double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public static Employee getInstance(String name, Integer age, Double salary) {
        return new Employee(name, age, salary);
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public Double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                '}';
    }

}
