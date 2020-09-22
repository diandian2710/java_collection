package 集合和泛型.Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapDemo03 {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("黄晓明","杨颖");
        map.put("冷锋","龙小云");
        map.put("杨过","小龙女");
        System.out.println(map);
        Set<Map.Entry<String,String>> entryset = map.entrySet();
        System.out.println(entryset);

        Iterator<Map.Entry<String,String>> it = entryset.iterator();
        while(it.hasNext()){
            Map.Entry<String,String> entry = it.next();
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"--"+value);
        }
        System.out.println("-------------------------------");
        for(Map.Entry<String,String> entry:entryset){
            String key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"--"+value);
        }

    }
}
