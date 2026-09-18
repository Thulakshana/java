package throws_throw;

public class class_one {
    public static void add(int age,int marks) throws ArithmeticException{
        if(age<=0){
            throw new ArithmeticException("invalid");
        }else if(age>=100){
            throw new ArithmeticException("invalid");
        }

        System.out.println(age+marks);
    }

    public static void main(String[] args) {
        add(10,50);
    }
}
