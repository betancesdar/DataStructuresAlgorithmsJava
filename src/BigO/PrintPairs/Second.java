package BigO.PrintPairs;

public class Second {

    /*
    * Task prints to the console the pairs from a given array;
    * eg. [1,3,4,5] should print 11,13,14,15
    * */
    public static void main(String [] args){
        int [] numbers = {1,3,5,7,8};
        printPairs(numbers);
    }

    public static void printPairs(int [] arr){

        for(int i = 0; i < arr.length; i++){ //--> O(n)
            for(int j = 0; j < arr.length; j++){ //--> O(n)
                System.out.println(arr[i] +""+ arr[j]);//--> O(1)
            }
        }
    }
}

//The time complexity of this function is = O(n^2)
