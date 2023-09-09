package sarkar.java.object.cloning;

public class Main {

    public static void main(String[] args) throws CloneNotSupportedException {
        Employee emp1 = new Employee("Sourabh", 31, 116000.00);
        Employee emp2 = (Employee) emp1.clone();
        System.out.println(emp2);

        System.out.println(emp1 == emp2);
        System.out.println(emp1.equals(emp2));
    }

}
