package hashsets;

import java.util.HashSet;

public class hashset_one {
    public static void main(String[] args) {
        HashSet<Integer> abc=new HashSet<>();

        abc.add(10);
        abc.add(10);

        abc.add(20);

        System.out.println(abc.size());

        System.out.println(abc.contains(10));

        abc.remove(20);

        abc.add(30);

        
    }
}
