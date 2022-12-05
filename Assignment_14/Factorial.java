package Assignment_14;

import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        int n, c, fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a number : "); 
        n = sc.nextInt();
        if(n<0){
            System.out.println("Number should be non-negative."); 
        }
        else{
            for(c= 1 ; c <=n ; c++)
            fact =fact*c;
            System.out.println("Factorial of "+n+" is ="+fact); 
        }
        sc.close();
    }
}
