package Recursion.SumDigits;
//question is :How to find the sum of a digits of a positive integer number using recursion?

public class Main {

    /*Logic: we need to sum the digits of a given integer
     * First: We need to look for the recursive case/flow if
     * in this case an integer ex. 10 if we divide by 10 10/10 = 1 reminder 0 = 1+0 =1
     * so we can say that if we receive a number more than two digits like 3 example
     *112 / 10 = 11 reminder 2 but with still have the 11 together so we need to call
     * again the function to divide it with the same 10 ex. 11/10 = 1 reminder 1 so now we have
     * 1 + 1 + 2 = 4
     * so our recursive case in this is f(n) = n%10  + f(n/10)
     * */
    public static void main(String [] args){
        Main main = new Main();
        var result = main.sumDigits(-10);

        System.out.println(result);
    }

    public int sumDigits(int n){
        if (n < 0 ) {
            System.out.println("Can not negative number"); // As the task ask me only to sum the positive number need another validation
            return 0;
        }
        if(n==0) { //this is the stop loop condition
            return 0;
        }
        return n % 10 + sumDigits(n/10);
        }

    }

