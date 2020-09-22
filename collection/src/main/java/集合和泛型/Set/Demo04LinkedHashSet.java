package 集合和泛型.Set;

import org.junit.Test;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class Demo04LinkedHashSet {
    @Test
    public void linkedHashSet(){
        HashSet<String> set = new HashSet<String>();
        set.add("www");
        set.add("abc");
        set.add("asda");
        set.add("java");
        System.out.println("无序不重复"+set);


        LinkedHashSet<String> linkset = new LinkedHashSet<>();
        linkset.add("www");
        linkset.add("abc");
        linkset.add("asda");
        linkset.add("java");
        System.out.println("有序不重复，先存入先取出"+linkset);
    }
}


