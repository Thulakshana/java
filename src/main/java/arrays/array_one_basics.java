package arrays;

public class array_one_basics {
    public static void main(String[] args) {
int numbers[]=new int[5];
int numbers2[]={1,2,3,4,5};

numbers[0]=0;
numbers[1]=1;
numbers[2]=2;
numbers[3]=3;
numbers[4]=4;
//numbers[5]=5;
//numbers[6]=6;

        System.out.println(numbers[0]);
        System.out.println(numbers.length);


        numbers[0]=100;
        System.out.println(numbers[0]);


    }
}
