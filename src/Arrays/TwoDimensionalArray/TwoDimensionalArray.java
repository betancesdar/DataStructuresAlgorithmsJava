package Arrays.TwoDimensionalArray;

public class TwoDimensionalArray {
    int[][] arr= null ;
    //Constructor
    public TwoDimensionalArray(int rows, int columns){
        this.arr = new int[rows][columns];
        for(int row = 0; row < arr.length; row++){
            for(int col = 0; col < arr.length; col++){
                arr[row][col] = Integer.MIN_VALUE;
            }
        }
    }

    //Inserting elements into a TwoDimensionalArry:

    public void insert(int row,int col, int value){
        try{
            if(arr[row][col] == Integer.MIN_VALUE){
                arr[row][col] = value;
                System.out.println(value + " Was inserted successfully!");
            }else {
                System.out.println(value + " Was not inserted, try again!");
            }

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);
        }
    }

    //Accesing to an element of the two dimensional array
    public void accessCell(int row, int col){
        System.out.println("\nAccessing to row#" + row + ", to Col# " + col); //--> O(1)
        try{
            System.out.println("Cell value is: " + arr[row][col]);  //--> O(1)
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println(e);  //--> O(1)
        }
    }

    //Traverse two dimensional array
    public void traverse2DArray() {
        for(int row = 0; row < arr.length; row++){ //---> O(M)
            for (int col = 0; col < arr.length; col++){ //---> O(N)
                System.out.println(arr[row][col] + " "); //---> O(1)
            }
            System.out.println(); //---> O(1)
        }
    }
    //Searchin a value
    public void searchingValue(int value){
        for(int row = 0; row < arr.length; row++){  //---> O(m) == O(mn)
            for(int col = 0; col < arr[0].length; col++){ //---> O(n)
                if (arr[row][col] == value){ //---> O(1)
                    System.out.println("Value was found at row: " + row + " Col: " + col); //---> O(1)
                    return;
                }
            }
        }
        System.out.println("Value was not found");
    }

    public void deleteValueFrom2DArray(int row, int col){
        try {
            System.out.println("Successfully deleted: " + arr[row][col]); //--> O(1)
            arr[row][col] = Integer.MIN_VALUE; //---> 0(1)
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);//---> 0(1)
        }
    }

}
