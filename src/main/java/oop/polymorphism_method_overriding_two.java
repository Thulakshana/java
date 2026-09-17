package oop;

public class polymorphism_method_overriding_two extends polymorphism_method_overriding_one{
    protected void method_one(){
        System.out.println("that is class two");
    }
    public static void main(String[] args) {
        polymorphism_method_overriding_two app1=new polymorphism_method_overriding_two();
        app1.method_one();

        polymorphism_method_overriding_one app2=new polymorphism_method_overriding_one();
        app2.method_one();

    }
}
