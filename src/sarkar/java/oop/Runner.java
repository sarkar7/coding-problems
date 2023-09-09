package sarkar.java.oop;

import java.util.HashMap;

public class Runner {

    public static void main(String[] args) {

        Student student1 = new Student(1, "sourabh");
        Student student2 = new Student(1, "sourabh");

        System.out.println("student1 hashCode - " + student1.hashCode());
        System.out.println("student2 hashCode - " + student2.hashCode());


        System.out.println("Is it equal - " + student1.equals(student2));

        HashMap<Student, Integer> map = new HashMap<>();
        map.put(student1, 1);
        map.put(student2, 2);
        System.out.println(map);
        System.out.println(map.get(student2));

        student1.setId(454353);
        student1.setName("sarkar");
        System.out.println("student1 hashCode - " + student1.hashCode());

        System.out.println(map);
        System.out.println(map.get(student1));


    }

}
