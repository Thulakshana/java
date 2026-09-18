package interview;

public class find_largetst_from_three {
    public static void main(String[] args) {
        int a=11;
        int b=12;
        int c=44;

        if(a>b && a>c){
            System.out.println("a is larger");
        }else if(b>a && b>c){
            System.out.println("b is the larger");
        }else{
            System.out.println("c is the larger");
        }
    }
}
