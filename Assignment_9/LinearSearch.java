package Assignment_9;

import java.util.Scanner;
public class LinearSearch {
    static int linearSearch(int a[], int n, int val){ 
        for (int i = 0; i < n; i++){
            if (a[i] == val){
                return i;
            }
        }
        return -1; 
    }

    public static void main(String args[]) {
        int a[] = {55, 29, 10, 40, 57, 41, 20, 24, 45,50}; // given array 
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the element to be searched : ");
        int val = sc.nextInt(); // value to be searched
        int n = a.length; // size of array
        int res = linearSearch(a, n, val);
        System.out.println();
        System.out.print("The elements of the array are : ");
        for (int i = 0; i < n; i++){
            System.out.print(" " + a[i]); 
        }
        System.out.println(); 
        System.out.println("Searching "+ val+"....."); 
        if (res == -1){
            System.out.println("Element is not present in the array"); 
        }
        else{
            System.out.println("Element "+ val + " is present at index " + res +" of array"); 
        }

        sc.close();
    }
}
