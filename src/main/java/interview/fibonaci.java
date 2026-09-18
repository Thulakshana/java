package interview;

import java.util.Scanner;

public class fibonaci {
    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        System.out.println("enter terms :");
        int terms=cs.nextInt();

        int a_first=0;
        int b_secont=1;

        for(int i=0;i<=terms;i++){
            System.out.println(a_first+" ");

            int next=a_first+b_secont;
            a_first=b_secont;
            b_secont=next;
        }
    }
}
