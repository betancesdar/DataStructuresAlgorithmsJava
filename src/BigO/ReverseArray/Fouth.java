package BigO.ReverseArray;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Fouth {

    /*
    * Create a method which takes an  array as a parameter and reverse
    * int [] array = {1,2,3,4} = 4,3,2,1
    * */
    public static void main(String [] args){
        int[] numbers = {1,2,3,4,5,6};
        reverse(numbers);


    }

    static void reverse(int [] arr){
        for(int i=0; i < arr.length/2; i++){ //----> O(n/2)
            int other = arr.length - i -1; // ----> O(1)
            int temp = arr[i]; //------> O(1)
            arr[i] = arr[other];//-----> O(1)
            arr[other] = temp;//----> O(1)
        }
        System.out.println(Arrays.toString(arr)); // ----> O(1)
    }

    /*The time complexity of this function it is O(n) */
}
