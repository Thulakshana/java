package arraylists;

import java.util.ArrayList;
import java.util.Scanner;

public class arraylists {


    public static void main(String[] args) {
        ArrayList<Integer> abc=new ArrayList<>();

        Scanner cs=new Scanner(System.in);

        for(int i=0;i<=5;i++){
            System.out.println("enter number ");
            abc.add(cs.nextInt());
        }
        System.out.println(abc.size());

        ////////////////////////////////////////////////////////////////////////////////////////

        ArrayList without_genarics=new ArrayList();

        without_genarics.add("apple");
        without_genarics.add(10);
        without_genarics.add(100);

        for(int i=0;i<without_genarics.size();i++){
            System.out.println(without_genarics.get(i));
        }



    }
}
