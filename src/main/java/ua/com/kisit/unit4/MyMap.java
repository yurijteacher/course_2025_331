package ua.com.kisit.unit4;

import java.util.HashMap;
import java.util.Map;

public class MyMap {

    public static void main(String[] args) {

        // <key, value>
        Map<Integer,String> map = new HashMap<>();

        map.put(1,"C++");
        map.put(2,"Java");
        map.put(3,"Python");
        map.put(4,"C#");
        map.put(5,"Swift");

        System.out.println(map.get(1));

        for (Map.Entry<Integer,String> entry : map.entrySet()) {
            System.out.print(entry.getKey()+". ");
            System.out.println(entry.getValue());
        }

        map.remove(3);
        System.out.println(map);

    }


}
