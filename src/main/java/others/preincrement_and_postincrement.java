package others;

public class preincrement_and_postincrement {
    public static void pre(){
        int a=10;
        System.out.println("pre is " + ++a); //increment first use later
        System.out.println("pre past is "+a);
    }

    public static void post(){
        int b=10;
        System.out.println("post is "+ b++); //use first increment later
        System.out.println("after "+ b);
    }

    public static void pre_loop(){
        for(int i=0;i<=5;++i){
            System.out.println(i);
        }
    }

    public static void post_loop(){
        for(int i=0;i<=5;i++){
            System.out.println(i);
        }
    }


public static void while_loop(){
        int b=0;

        while(b<=5){
            System.out.println(b);
            ++b;
        }
}

    public static void main(String[] args) {
pre();
post();

pre_loop();
post_loop();

while_loop();
    }
}
