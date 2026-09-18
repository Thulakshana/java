package interview;

import java.util.Scanner;

public class palidrom_words {
    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        System.out.println("enter word: ");
        String word=cs.nextLine();

        String reverse="";

        for(int i=word.length()-1;i>=0;i--){
            reverse=reverse+word.charAt(i);
        }

        if(word.equals(reverse)){
            System.out.println("that is palidrom");
        }else{
            System.out.println("that is not a palidrom");
        }
    }
}
