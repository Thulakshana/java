package superkeyword;

public class child extends parent {
    String name="dissanayaka";

    public void parents(){
        System.out.println(super.name);
        System.out.println(name);
    }

    public static void main(String[] args) {
        child app1=new child();
        app1.parents();


    }
}
