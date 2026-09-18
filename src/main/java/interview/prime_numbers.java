package interview;

import java.util.Scanner;

public class prime_numbers {
    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        System.out.println("enter number : ");
        int number=cs.nextInt();

       boolean isprime=true;

       if(number<=1){
           isprime=false;
       }else{
           for(int i=2;i<number;i++){
               if(number%i==0){
                   isprime=false;
                   break;
               }
           }
           if(isprime){
               System.out.println("that is prime number");
           }else{
               System.out.println("that is not a prime number");
           }
       }
    }
}
