package 集合和泛型.generic;


import java.util.ArrayList;
import java.util.Iterator;

public class GenericWildCards {
    public static void main(String[] args) {
        ArrayList<Integer> lsit01 = new ArrayList<Integer>();
        lsit01.add(1);
        lsit01.add(2);
        lsit01.add(3);

        ArrayList<String> lsit02 = new ArrayList<String>();
        lsit02.add("a");
        lsit02.add("b");
        lsit02.add("c");

        PrintArray(lsit01);
        PrintArray(lsit02);

        // ArrayList<?> lsit03 = new ArrayList<?>(); 定义不能使用通配符
    }

    // 定义一个方法，能遍历所有的ArrayList集合
    public static void PrintArray(ArrayList<?> list){
        Iterator<?> iterator = list.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            System.out.println(next);
        }

    }
}
