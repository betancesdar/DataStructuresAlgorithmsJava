package Recursion.DecimaBinary;

public class Main {
    public static void main(String [] args){
        var result = decimalToBinary(15);
        System.out.println(result);
    }

    public static int decimalToBinary(int n){
        if(n == 0)
        {
            return 0;
        }
        return n % 2 + 10 * decimalToBinary(n/2);
    }
}
