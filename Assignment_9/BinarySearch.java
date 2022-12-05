package Assignment_9;

import java.util.Scanner;
public class BinarySearch {
    int binarySearch(int arr[], int l, int r, int x){
        if (r >= l){
            int mid = l + (r - l) / 2; 
            if (arr[mid] == x){
                return mid; 
            }
            else if (arr[mid] > x){
                return binarySearch(arr, l, mid - 1, x);
            } 
            else{
                return binarySearch(arr, mid + 1, r, x); 
            }
        } 
        else{
            return -1; 
        }
    }
    public static void main(String args[]){
        BinarySearch ob = new BinarySearch();
        int arr[] = { 2, 3, 4, 10, 40, 60, 80, 110};
        int n = arr.length;
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the Element to be searched : "); 
        int x = sc.nextInt();
        int result = ob.binarySearch(arr, 0, n - 1, x); 
        System.out.println("Searching "+ x +"....."); 
        if (result == -1){
            System.out.println("Element not present"); 
        }
        else{
            System.out.println("Element "+ x +" found at index "+ result);
        } 
        sc.close();
    }
}
