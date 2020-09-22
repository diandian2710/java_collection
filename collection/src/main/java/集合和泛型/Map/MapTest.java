package 集合和泛型.Map;

import org.junit.Test;

import java.util.*;

public class MapTest {
    @Test
    public void test(){
        HashMap<Student, String> map = new HashMap<>();
        map.put(new Student(1,"haha"), "上海");
        map.put(new Student(2,"asda"), "北京");
        map.put(new Student(3,"aha"), "广州");

        System.out.println(map);

        Set<Map.Entry<Student, String>> entries = map.entrySet();
        for (Map.Entry<Student, String> entry : entries) {
            System.out.println(entry);
        }

        Iterator<Map.Entry<Student, String>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<Student, String> next = iterator.next();
            Student key = next.getKey();
            String value = next.getValue();
            System.out.println(key+"_____"+value);
        }
        Set<Student> students = map.keySet();
        for (Student student : students) {
            System.out.println(student);
        }
    }

}

class Student {
    private int age;
    private String name;

    public Student() {
    }

    public Student(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}
