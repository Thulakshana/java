package oop;

public class encapsulation_one {
    private String name;
    private int age;

    public int getAge(){
        return age;
    }

    public void setAge(int age){
        if(age<=0){
            System.out.println("invalid age");
        }else{
            this.age=age;
        }
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name=name;
    }

    public static void main(String[] args) {
        encapsulation_one app1=new encapsulation_one();

        app1.setAge(10);
        app1.setName("thula");

        System.out.println(app1.getAge());
        System.out.println(app1.getName());

    }
}
