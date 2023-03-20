package Recursion.Power;

//Task:
//How to calculate the power of a number using recursion?

public class Main {

    /*
    * Recursive case: Xn = x * x n-1
    *
    * */
    public static void main(String [] args){
        var result = calculatePower(2,3);
        System.out.println(result);
    }

    public static double calculatePower(double n, int exponent){
        if (exponent == 0) {
            return 1;
        } else if (n == 0) {
            return 0;
        } else if (exponent < 0) {
            return calculatePower(1 / n, -exponent);
        } else {
            return n * calculatePower(n, exponent - 1);
        }
    }
}
