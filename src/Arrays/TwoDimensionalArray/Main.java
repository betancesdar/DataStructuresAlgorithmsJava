package Arrays.TwoDimensionalArray;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){

        TwoDimensionalArray tda = new TwoDimensionalArray(3,3);

        tda.insert(0,0,1);
        tda.insert(0,1,2);
        tda.insert(0,2,3);

        tda.insert(1,0,4);
        tda.insert(1,1,5);
        tda.insert(1,2,6);

        tda.insert(2,0,7);
        tda.insert(2,1,8);
        tda.insert(2,2,9);

        System.out.println(Arrays.deepToString(tda.arr));

        tda.accessCell(2,2);
        tda.traverse2DArray();
        tda.searchingValue(8);
        tda.deleteValueFrom2DArray(2,2);
        System.out.println(Arrays.deepToString(tda.arr));

        int apples = 5;
        int bananas = 10;
        System.out.println("John has " + apples + bananas + " fruits");

    }
}
