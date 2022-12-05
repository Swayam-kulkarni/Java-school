package Assignment_3;

import java.lang.Math;
public class Math_Functions {
    public static void main(String[] args){
        int x=10, y=20;
        // return the maximum of two numbers
        System.out.println("Maximum number of x and y is: " +Math.max(x, y));
        // return the minimum of two numbers
        System.out.println("Minimum number of x and y is: " +Math.min(x, y));

        // return the square root of y
        System.out.println("Square root of y is: " + Math.sqrt(y));
        // return the cube root of x
        System.out.println("Square root of x is: " + Math.cbrt(x));

        //returns x^y
        System.out.println("Power of x raised to y is: " + Math.pow(x, y));
        //returns y^x
        System.out.println("Power of y raised to x is: " + Math.pow(y, x));

        // return the logarithm of x & y
        System.out.println("Logarithm of x is: " + Math.log(x)); 
        System.out.println("Logarithm of y is: " + Math.log(y));



    }
}
