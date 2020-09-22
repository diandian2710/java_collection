package 集合和泛型.Collection;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

/**
 * 在Collection接口定义着单列集合框架中最最共性的内容。
 *
 * 共性方法：
 *      public boolean add(E e)：  把给定的对象添加到当前集合中 。
 *      public void clear() :清空集合中所有的元素。
 *      public boolean remove(E e): 把给定的对象在当前集合中删除。
 *      public boolean contains(E e): 判断当前集合中是否包含给定的对象。
 *      public boolean isEmpty(): 判断当前集合是否为空。
 *      public int size(): 返回集合中元素的个数。
 *      public Object[] toArray(): 把集合中的元素，存储到数组中。
 */
public class Demo1Collection {
    public static void main(String[] args) {
        demo01();
    }

    public static void demo01(){
        // 创建集合对象，可以使用多态
        // Collection<String> coll = new ArrayList<>();
        Collection<String> coll = new HashSet<String>();
        System.out.println(coll);
        // add 方法
        boolean b1 = coll.add("张三");
        System.out.println(b1);
        System.out.println(coll);
        coll.add("李四");
        coll.add("李四");     // HashSet会自动去重
        coll.add("王五");
        coll.add("赵六");
        coll.add("田七");
        System.out.println(coll);

        // remove方法 : 存在元素会删除元素返回True，不存在删除失败返回False
        boolean b2 = coll.remove("赵六");
        System.out.println(b2);
        System.out.println(coll);
        boolean b3 = coll.remove("赵四");
        System.out.println(b3);

        // contains() 方法  是否包含某个元素，包含True,否则false
        boolean b4 = coll.contains("张三");
        System.out.println(b4);
        boolean b5 = coll.contains("张六");
        System.out.println(b5);

        // isEmpty()方法   :为空True,不为空True
        boolean b6 = coll.isEmpty();
        System.out.println(b6);

        // size()方法
        System.out.println(coll.size());

        //toArray(): 把集合中的元素，存储到数组中。
        Object [] arr = coll.toArray();
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        //public void clear() :清空集合中所有的元素。
        coll.clear();
        System.out.println(coll);
        System.out.println(coll.isEmpty());
    }
}