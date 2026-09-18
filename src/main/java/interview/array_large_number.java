package interview;

import java.util.Scanner;

public class array_large_number {
    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        int[]num=new int[5];
        for(int i=0;i<num.length;i++){
            System.out.println("enter number ");
            num[i]=cs.nextInt();
        }

        int large=num[0];
        for(int i=0;i<num.length;i++){
            if(num[i]>large){
                large=num[i];
            }
        }
        System.out.println("large number is "+large);
    }
}
