package 集合和泛型.Collection;

import org.junit.Test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Demo02Collection {
    @Test
    public void collectionTest(){
        ArrayList<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        list.add("c");
        list.add("e");
        list.add("d");
        System.out.println(list);
        list.clear();
        Collections.addAll(list, "a", "b", "c", "e", "d");
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
        Collections.sort(list);
        System.out.println(list);
        System.out.println("=====================使用Comparable接口");

        ArrayList<Person> people = new ArrayList<>();
        Person haha = new Person(18, "haha");
        Person xis = new Person(11, "xis");
        Person asdad = new Person(2, "asdad");
        people.add(haha);
        people.add(xis);
        people.add(asdad);
        System.out.println(people);
        Collections.sort(people);
        System.out.println(people);
        System.out.println("+++++++++++++++++++使用Comparator比较器");
        ArrayList<Person2> person2s = new ArrayList<>();
        Person2 shshs = new Person2(18, "haha");
        Person2 sadasd = new Person2(11, "xis");
        Person2 ier = new Person2(2, "asdad");
        person2s.add(shshs);
        person2s.add(sadasd);
        person2s.add(ier);
        System.out.println(person2s);
        Collections.sort(person2s, new Comparator<Person2>() {
            @Override
            public int compare(Person2 o1, Person2 o2) {

                return o1.getAge() - o2.getAge();
            }
        });

        System.out.println(person2s);


    }
}

class Person implements Comparable<Person>{
    private int age;
    private String name;

    public Person() {
    }

    public Person(int age, String name) {
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
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        return this.age - o.age; //按照年龄升序排列
//      return o.age - this.age; //按照年龄降序排列
    }

}

class Person2{
    private int age;
    private String name;

    public Person2(int age, String name) {
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
        return "Person2{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}


