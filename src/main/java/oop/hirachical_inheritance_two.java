package oop;

public class hirachical_inheritance_two extends hirachical_inheritance_one{
    protected void hirachical_two(){
        System.out.println("that is two");
    }
    public static void main(String[] args) {
        hirachical_inheritance_two app1=new hirachical_inheritance_two();
        app1.hirachical_one();
    }
}
