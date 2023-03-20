package BigO.SumProductArray;

public class Main {
    /*
    * -Create a function which calculate the sum and product of elements of array
    * -find the time complexity for the created method.
    * */
    public static void main(String [] args){
        int [] array = {1,2,3,4,5,6,7};
        calc(array);

    }

    public static void calc(int [] arr){
        int sum = 0; //-----> o(1)
        int product = 1; //----> o(1)

        for(int i = 0; i < arr.length; i++){ //-------> o(n)
            sum += arr[i]; // ----->o(1)
            product *= arr[i]; // ----->o(1)
        }

        System.out.println(sum+ ", " + product); // ----->o(1)

        //Time complexity for this method will be O(n)

    }




}
