package others;

import java.util.Scanner;

public class loops {

    public static void forloop(){
        for(int i=0;i<5;i++){
            System.out.println(i);
        }
    }

    public static void whileloop(){

        String password="";
        while(!password.equals("1234")){
            Scanner cs=new Scanner(System.in);
            password=cs.nextLine();
            System.out.println("enter password ");
        }




    }
    public static void main(String[] args) {
        forloop();
        whileloop();
    }
}
