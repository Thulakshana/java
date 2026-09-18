package interview;

public class swap {
    public static void main(String[] args) {
        int a=10;
        int b=20;

        int temp=a;
        a=b; //a=20
        b=temp;

        System.out.println("a is "+a);
        System.out.println("b is "+b);

        int c=10;
        int d=20;

        c=c+d; //c=30
        d=c-d; //d=10;
        c=c-d; //c=20

        System.out.println("c is "+c);
        System.out.println("d is "+d);




    }
}
