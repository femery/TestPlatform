package array.t253;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

/**
 * @Auther: hsx
 * @Date: 2020/3/12
 * @Description: array.t253
 * @version: 1.0
 */
public class t253 {
    public static void main(String[] args) {

        TreeMap<Integer,Integer> map = new TreeMap<>();
        map.put(10,1);
        map.put(5,1);
        map.put(11,-1);
        map.put(15,-1);
        for(Map.Entry entry:map.entrySet()){
            System.out.println(entry.getKey()+"   "+entry.getValue());
        }
        Map<Integer,Integer> m=new HashMap<>();
        System.out.println(map.get(1));

    }
}
