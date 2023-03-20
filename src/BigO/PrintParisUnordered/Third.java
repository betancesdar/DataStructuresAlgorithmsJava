package BigO.PrintParisUnordered;

public class Third {

    /*
    * Task prints to the console the pairs from a given array;
    * eg. [1,3,4,5] should print 11,13,14,15
    * */
    public static void main(String [] args){
        int [] numbers = {1,3,4,5};
        printUnorderPairs(numbers);
    }

    public static void printUnorderPairs(int [] arr){

        for(int i = 0; i < arr.length; i++){ //--> O(n)
            for(int j = i+1; j < arr.length; j++){ //--> O(n ^ 2)
                System.out.println(arr[i] +", "+ arr[j]);//--> O(1)
            }
        }
    }
}

//The time complexity of this function is = O(n) * O(n ^ 2) = O(n ^ 2)
