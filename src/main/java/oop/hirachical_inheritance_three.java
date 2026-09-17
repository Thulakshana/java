package oop;

public class hirachical_inheritance_three extends hirachical_inheritance_one {
    protected void hirachical_three(){
        System.out.println("that is three");
    }
    public static void main(String[] args) {
        hirachical_inheritance_three app1=new hirachical_inheritance_three();
        app1.hirachical_three();
    }
}
