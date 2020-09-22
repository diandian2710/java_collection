package 集合和泛型.Set;

import java.util.HashSet;
import java.util.Objects;

public class Demo03HashSetSavePerson {
    public static void main(String[] args) {

        // 创建HashSet集合存储Student
        HashSet<Student> set = new HashSet<>();
        Student stu1 = new Student("张三", 18);
        Student stu2 = new Student("张三", 18);
        Student stu3 = new Student("张三", 18);
        Student stu4 = new Student("张", 18);

        set.add(stu1);
        set.add(stu2);
        set.add(stu3);
        set.add(stu4);
        System.out.println(set);        // 没重写equals和hashCode方法,重复的值也存入了
        System.out.println(stu1.hashCode());
        System.out.println(stu2.hashCode());
        System.out.println(stu4.hashCode());
        System.out.println(stu1==stu2);
        System.out.println(stu1.equals(stu2));
        // 没重写
        //[Student{name='张三', age=18}, Student{name='张三', age=18}, Student{name='张三', age=18}]
        //764977973
        //381259350
        //false
        //false
        //重写后
        //[Student{name='张三', age=18}]
        //24022538
        //24022538
        //false
        //true
    }

}


/*
    HashSet存储自定义类型的元素

   Set集合报错元素唯一
        存储的元素（String,Integer,.... Student,Person ）,必须重写hashCode方法和equals方法
  要求：
    同名，同年龄的人视为一个人
 */
class Student{
    private String name;
    private int age;

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Student)) return false;
        Student student = (Student) o;
        return getAge() == student.getAge() &&
                Objects.equals(getName(), student.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getName(), getAge());
    }

}
