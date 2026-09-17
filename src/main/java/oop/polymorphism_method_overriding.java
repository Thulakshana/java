package oop;

public class polymorphism_method_overriding {

    protected void same_name(){
        System.out.println("one");
    }

    protected void same_name(String name){
        System.out.println(name);
    }
    protected void same_name(int x){
        System.out.println(x);
    }
    public static void main(String[] args) {
        polymorphism_method_overriding app1=new polymorphism_method_overriding();
        app1.same_name();
        app1.same_name(10);
        app1.same_name("thula");
    }
}
