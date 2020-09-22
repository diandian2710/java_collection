package 集合和泛型.Set;

import org.junit.Test;

import java.util.HashSet;

public class Demo02HashSetSaveString {
    @Test
    public void test(){
        HashSet<String> set = new HashSet<String>();
        String s1 = "abc";
        String s2 = "abc";
        String s3 = "重地";
        String s4 = "通话";

        set.add(s1);
        set.add(s2);
        set.add(s3);
        set.add(s4);

        set.add("abc");
        System.out.println(set);
    }
}
