package arrays;

import java.util.Arrays;

public class array_methods {
    public static void main(String[] args) {
        int arr[]={2,8,5,6,8,44,66,888,33,3,2,1};

        System.out.println(Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        int index=Arrays.binarySearch(arr,44);
        System.out.println(index);

        int arr2[]={1,2,3,4,5,6,7,8,9};
        System.out.println(Arrays.equals(arr,arr2));

    }
}
