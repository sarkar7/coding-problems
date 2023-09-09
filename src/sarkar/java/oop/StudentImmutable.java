package sarkar.java.oop;

import java.util.*;

public final class StudentImmutable {

    private final String name;
    private final Integer age;
    private final Date dob; // mutable field
    private final Address address; // mutable object
    private final List<String> courses;
    private final HashMap<String,String> testMap;

    private StudentImmutable(String name, Integer age, Date dob, List<String> courses,
                             Address address, HashMap<String,String> hm) throws CloneNotSupportedException {
        this.name = name;
        this.age = age;
        this.dob = new Date(dob.getTime());
        this.courses = new ArrayList<>(courses);
        this.address = (Address) address.clone();

        // performing deep copy for object initialization
        HashMap<String,String> tempMap= new HashMap<>();
        String key;
        for (String s : hm.keySet()) {
            key = s;
            tempMap.put(key, hm.get(key));
        }
        this.testMap=tempMap;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public List<String> getCourses() {
        return new ArrayList<>(courses);
    }

    public Date getDob() {
        return new Date(dob.getTime());
    }

    public Address getAddress() throws CloneNotSupportedException {
        return (Address) address.clone();
    }

    public HashMap<String, String> getTestMap() {
        return (HashMap<String, String>) testMap.clone();
    }

    public static StudentImmutable createInstance(String name, Integer age, Date dob, List<String> courses, Address address, HashMap<String,String> hm) throws CloneNotSupportedException {
        return new StudentImmutable(name, age, dob, courses, address, hm);
    }


}
