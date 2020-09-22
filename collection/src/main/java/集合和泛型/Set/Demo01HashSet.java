package 集合和泛型.Set;

import org.junit.Test;

import java.util.HashSet;
import java.util.Iterator;

public class Demo01HashSet {
    @Test
    public void hashset(){
        HashSet<String> set = new HashSet<String>();
        set.add("a");
        set.add("b");
        set.add("c");
        System.out.println(set);

        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
