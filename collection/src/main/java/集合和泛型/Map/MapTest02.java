package 集合和泛型.Map;

import org.junit.Test;

import java.util.HashMap;
import java.util.Scanner;

public class MapTest02 {
    public static void main(String[] args) {
        System.out.println("请录入一个字符串");
        String line = new Scanner(System.in).nextLine();
        findChar(line);

        new Scanner(System.in).close();
    }

        private static void findChar (String line){
            HashMap<Character, Integer> characterIntegerHashMap = new HashMap<>();
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                if (!characterIntegerHashMap.containsKey(c)) {
                    characterIntegerHashMap.put(c, 1);
                } else {
                    Integer counter = characterIntegerHashMap.get(c);
                    characterIntegerHashMap.put(c, ++counter);
                }
            }

            System.out.println(characterIntegerHashMap);


        }
}


