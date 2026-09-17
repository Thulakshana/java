package oop;

public class abscract_normal_class extends abstract_class_one {
    //me class origanaly abscract class methods
    //originally abstract methods in the parent:
    //implementing/overriding the abstract method.
    @Override
    public void call(){
        System.out.println("call");
    }
    @Override
    public void message(){
        System.out.println("message");
    }

    public static void main(String[] args) {
        abscract_normal_class app1=new abscract_normal_class();
        app1.internet();
        app1.call();
        app1.message();

// me anonymous subclass  ekak
        //Again, call() and message() are implementations of the abstract methods.

        abstract_class_one app2=new abstract_class_one() {
            @Override
            public void call() {
                System.out.println("that is abscract method");
            }

            @Override
            public void message() {
                System.out.println("that is abscract methd 2");

            }
        };
        app2.call();
        app2.message();
        app2.internet();
        System.out.println(app2.name);

        abstract_class_one app3=new abstract_class_one() {
            @Override
            public void call() {
                System.out.println("that is third implement");
            }

            @Override
            public void message() {
                System.out.println("that is third implement");

            }
        };
        app3.call();
        app3.message();


    }
}
