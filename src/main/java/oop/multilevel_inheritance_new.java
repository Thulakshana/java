package oop;

public class multilevel_inheritance_new extends multilevel_inheritance_old{

    protected void new_mobile(){
        System.out.println("that mobile can be message");
    }
    public static void main(String[] args) {
        multilevel_inheritance_new app1=new multilevel_inheritance_new();
        app1.old_mobile_phone();
        app1.new_mobile();

    }
}
