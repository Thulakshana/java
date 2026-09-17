package oop;

public class multilevel_inheritance_latest extends multilevel_inheritance_new {
    protected void latest_mobile_phone(){
        System.out.println("that mobile can be brows internet");
    }
    public static void main(String[] args) {
        multilevel_inheritance_latest app1=new multilevel_inheritance_latest();
        app1.old_mobile_phone();
        app1.new_mobile();
        app1.latest_mobile_phone();
    }
}
