package Arrays.SingleDimensionsArray;

public class SingleDimensionsArray {

    int[] arr = null;


    //Constructor to initiate the arary
    public SingleDimensionsArray(int sizeOfArray){
        arr = new int[sizeOfArray];
        //asisgn the minum index
        for(int i = 0; i < arr.length;i++){
            arr[i] = Integer.MIN_VALUE;
        }
    }

    public void insert(int location, int valueToBeInserted){
        try{
            if(arr[location] == Integer.MIN_VALUE){
            arr[location] = valueToBeInserted;
            System.out.println(valueToBeInserted + " This value was successfully entered to the array");
        }else {
            System.out.println("This value unsuccessfully, try again");
            }
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }

    }

    //Traversal array

    public void transverseArray(){
        try{
            for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i]+ " ");
             }
        }catch (Exception e){
            System.out.println(e);
        }

    }

    //Search of an element in a given array
    public void searchInArray(int valueToSearch){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == valueToSearch){
                System.out.println("Value was found in the index " + i);
                return;
            }
        }
        System.out.println(valueToSearch + " Value not found ");


    }

    //Delete an element from myArray =
    public void deleteAnElement(int valueToDeleteIndex){
        try{
            arr[valueToDeleteIndex] = Integer.MIN_VALUE;
            System.out.println("The value has been deleted successfully! ");
        }catch (Exception e){
            System.out.println(e);
        }
    }

    //Accesint to elements in twodimensionalarray



}


