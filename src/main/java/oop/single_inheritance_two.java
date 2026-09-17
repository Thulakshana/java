package oop;

public class single_inheritance_two extends single_inheritance_one {

    protected void message(){
        System.out.println("new phone can be send messages");
    }
    public static void main(String[] args) {
        single_inheritance_two app2=new single_inheritance_two();
        app2.call();
        app2.message();

    }
}
