package arraylists;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class arraylistmethods {
    public static void main(String[] args) {
        ArrayList<Integer> abc=new ArrayList<>();

        abc.add(11);
        abc.add(12);
        abc.add(13);
        abc.add(14);

        System.out.println(abc.size());

        System.out.println(abc.get(2));

        abc.remove(2);

        System.out.println(abc.size());

        System.out.println(abc.isEmpty());

        System.out.println(abc.contains(100));

        Collections.sort(abc);

        System.out.println("sorted "+abc);

        Collections.reverse(abc);
        System.out.println("reversed "+abc);


    }
}
