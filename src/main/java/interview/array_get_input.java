package interview;

import java.util.Scanner;

public class array_get_input {
    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);

        int[]num=new int[5];

        for(int i=0;i<num.length;i++){
            System.out.println("enter numbers: ");
            num[i]=cs.nextInt();
        }

        for(int x=0;x<=num.length;x++){
            System.out.println(num[x]);
        }

    }
}
