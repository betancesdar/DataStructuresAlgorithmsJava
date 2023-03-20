package Recursion.GCD;

public class Main {

    /*
    * GCD = GREATER COMMON DIVISOR = of two number it is a positive integer that divide the two number without a reminder
    *
    *
    * */
    public static void main(String [] args){
        var result = calculateGCD(8,4);
        System.out.println(result);
    }

    public static int calculateGCD(int a, int b){
        if(a < 0 || b < 0){ //constraint
            return -1;
        }
        if(b == 0) { //Base Case - Stopping case
            return a;
        }
        return calculateGCD(b, a%b); // Recursive case

    }
}
