package hashmap;

import java.util.HashMap;

public class hashmap_one {
    public static void main(String[] args) {
        HashMap<Integer,String> abc=new HashMap<>();
        abc.put(1,"malan");
        abc.put(2,"sakuna");
        abc.put(3,"deshan");
        abc.put(4,"kavidu");
        abc.put(5,"nipuna");

        System.out.println(abc.get(1));
        System.out.println(abc.get(0));

        System.out.println(abc.containsValue("nipuna"));

        System.out.println(abc.containsKey(4));

        System.out.println(abc.size());

        abc.remove(3);

        System.out.println(abc.size());





    }
}
