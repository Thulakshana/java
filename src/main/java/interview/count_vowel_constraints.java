package interview;

import java.util.Scanner;

public class count_vowel_constraints {
    public static void main(String[] args) {
        Scanner cs=new Scanner(System.in);
        System.out.println("enter word: ");
        String word=cs.nextLine();

        int vowel=0;
        int constr=0;

        for(int i=0;i<=word.length()-1;i++){
            char ch=word.charAt(i);

            if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
                vowel++;
            }else{
                constr++;
            }
        }
        System.out.println("vowel count is "+vowel);
        System.out.println("const count is "+constr);
    }
}
