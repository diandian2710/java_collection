package 集合和泛型.Iterator;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;

/**
 * java.util.Iterator接口：迭代器
 *   Iterator接口的常用方法如下：
 *      public E next():返回迭代的下一个元素。
 *      public boolean hasNext():如果仍有元素可以迭代，则返回 true。
 *  Iterator迭代器，是一个接口，我们无法直接使用，需要Iterator接口的实现类对象，获取实现类的方式比较特殊
 *  Collection接口中有一个iterator方法，这个方法返回的是迭代器对象
 */
public class Demo01Iterator {
    public static void main(String[] args) {
        demo01();
    }
    public static void demo01(){
        // 迭代器的使用步骤：
        // 1.使用集合的方法iterator()获取迭代器对象实现类对象，使用Iterator接口接收(多态)
        // 2. 使用Iterator接口中的hasNext()方法，判断是否还有下一个元素
        // 3. 使用Iterator接口的Next()方法，取出集合中的下一个元素

        Collection<String> coll = new HashSet<String>();  // 创建集合对象
        coll.add("a");
        coll.add("b");
        coll.add("c");
        coll.add("d");

        Iterator<String> iterator = coll.iterator();    // 创建迭代器
        while (iterator.hasNext()){                     // 使用迭代器遍历
            String s = iterator.next();
            System.out.println(s);
        }
    }
}