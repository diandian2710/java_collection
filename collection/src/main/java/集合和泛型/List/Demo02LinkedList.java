package 集合和泛型.List;

import java.util.LinkedList;

public class Demo02LinkedList {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo03();
    }
    public static void demo01(){
        // 创建LinkedList集合对象
        LinkedList<String> linked = new LinkedList<String>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        linked.add("d");
        System.out.println(linked);
        //public void addFirst(E e):将指定元素插入此列表的开头。
        //public void push(E e):将元素推入此列表所表示的堆栈。（和上面的方法等价）
        linked.addFirst("www.");
        //linked.push("www.");
        System.out.println(linked);
        //public void addLast(E e):将指定元素添加到此列表的结尾。(等价于add方法)
        linked.addLast(".com");
        System.out.println(linked);
    }
    public static void demo02(){
        LinkedList<String> linked = new LinkedList<String>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        // linked.clear();
        if(!linked.isEmpty()){
            String first = linked.getFirst();
            String last = linked.getLast();
            System.out.println(first);
            System.out.println(last);
        }else {
            System.out.println("LinkedList为空。");
        }
    }
    public static void demo03(){
        LinkedList<String> linked = new LinkedList<String>();
        linked.add("a");
        linked.add("b");
        linked.add("c");
        System.out.println(linked);
        //      public E removeFirst():移除并返回此列表的第一个元素。
        //    public E removeLast():移除并返回此列表的最后一个元素。
        //    public E pop():从此列表所表示的堆栈处弹出一个元素。
        String first = linked.removeFirst();
        String last = linked.removeLast();
        System.out.println(first);
        System.out.println(last);
        System.out.println(linked);
    }

}
