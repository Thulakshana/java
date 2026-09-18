package interview;

import java.util.Scanner;

public class evenofodd {
    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        System.out.println("enter value : ");
        int number=cs.nextInt();

        if(number%2==0){
            System.out.println("that is even number");
        }else{
            System.out.println("that is odd number");
        }
    }
}
