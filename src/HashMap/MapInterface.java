package HashMap;

import java.util.HashMap;
import java.util.Map;

public class MapInterface {
    public static void main(String[] args) {
        Map<Character,Integer> map= new HashMap<>();
        map.put('a',1);
        map.put('b',2);
        // below are the ways to print map
        //keyset
        for(char ch: map.keySet()){
            System.out.println(map.get(ch));

        }
        //entryset
        //map.entrySet();
        for(Map.Entry<Character,Integer> entry : map.entrySet()){
            System.out.println(entry.getValue());
        }
        // below is getordefault method implementation
        System.out.println(map.getOrDefault('c',-1));

    }
}
