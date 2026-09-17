package oop;

public class cons_one {


    cons_one(){
        System.out.println("that is normal contructor");

    }
    int x;
    cons_one(int x){
        this.x=x;
        System.out.println(x);
        System.out.println("that is constructor overloading");
    }
    cons_one(int z,int y){
        System.out.println(z+y);
        System.out.println("That is constructor overloading two");
    }

    public static void main(String[] args) {
        cons_one app1=new cons_one();
        cons_one app2=new cons_one(10);
        cons_one app3=new cons_one(10,11);

    }
}
