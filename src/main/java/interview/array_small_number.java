package interview;

import java.util.Scanner;

public class array_small_number {
    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        int[]num=new int[5];
        for(int i=0;i<num.length;i++){
            System.out.println("enter number :");
            num[i]=cs.nextInt();
        }

        int small=num[0];

        for(int i=0;i<num.length;i++){
            if(num[i]<small){
                small=num[i];
            }
        }
        System.out.println("small number is "+small);
    }
}
