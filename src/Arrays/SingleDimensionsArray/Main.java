package Arrays.SingleDimensionsArray;

public class Main {

    public static void main(String [] args){
        SingleDimensionsArray singleDimension = new SingleDimensionsArray(10);
        singleDimension.insert(0,1);
        singleDimension.insert(1,2);
        singleDimension.insert(2,3);


        System.out.println("Array Traversed");
        singleDimension.transverseArray();
        System.out.println("");

        singleDimension.searchInArray(1);


    }
}
