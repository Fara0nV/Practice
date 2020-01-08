package Recursion49;

public class TestForRecursion{
    public static void main(String[] args) {
        /* counter(1);
    }
    // Factorial 4! = 4 * 3 * 2 * 1
    // 1! = 1
    // 15! = 15 * 14 * 13 *12 ... * 1
    // 0! = 1
    // someMethod()-->someMethod()-->someMethod() stack Overflow
    // counter(3)-->counter(2)-->counter(1)
    private static void counter(int n){
        if(n == 0)
            return;
        System.out.println(n);
        counter(n - 1); */

        System.out.println(factorial(4));
    }

    // factorial(4)
    // 4 * factorial(3) 4 * 6 = 24
    // 3 * factorial(2) 3 * 2 = 6
    // 2 * factorial(1) 2 * 1 = 2
    // factorial(1) = return 1

    private static int factorial(int n){
        if(n==1)
            return 1;
        return n * factorial(n - 1);
    }
}
