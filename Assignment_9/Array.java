package Assignment_9;

import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        int n=sc.nextInt();
        int[] myList = new int[n];
        for(int i=0; i<n; i++){
        //reading array elements from the user 
            System.out.print("Enter the element at "+ i +" : "); 
            myList[i]=sc.nextInt();
        }
        // Print all the array elements
        for (int i = 0; i < myList.length; i++){
            System.out.print(myList[i] + ", "); 
        }
        // Summing all elements
        double total = 0;
        for (int i = 0; i < myList.length; i++){
            total += myList[i]; 
        }
        System.out.println("\nTotal is " + total);
        // Finding the largest element
        int max = myList[0];
        for (int i = 1; i < myList.length; i++){
            if (myList[i] > max){ 
                max = myList[i];
            } 
        }
        System.out.println("Length of Array is : " + myList.length);
        System.out.println("Max element is : " + max); 

        sc.close();
    }
}
