package Assignment_10;

public class SelectionSort {
    /* function to sort an array with selection sort */
    void sort(int a[]){
        int i, j, small;
        int n = a.length;
        for (i = 0; i < n-1; i++){
            small = i; //minimum element in unsorted array 
            for (j = i+1; j < n; j++)
            if (a[j] < a[small]) {
                small = j; 
            }
            // Swap the minimum element with the first element 
            int temp = a[small];
            a[small] = a[i];
            a[i] = temp;
        } 
    }
    public static void main(String[] args) {
        int a[] = { 9, 67, 34,12,96,1, 49, 4, 19, 10};
        SelectionSort s = new SelectionSort(); 
        System.out.println("\nBefore sorting array elements are : ");
        int i;
        int n = a.length;
        for (i = 0; i < n; i++){
            System.out.print(a[i] + " "); 
        }
        s.sort(a);
        System.out.println("\nAfter sorting array elements are : ");
        for (i = 0; i < n; i++){ 
            System.out.print(a[i] + " ");
        }
        System.out.println(); 
    }
}
