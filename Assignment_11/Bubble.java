package Assignment_11;

public class Bubble{
    void bubbleSort(int a[]){
        int n = a.length;
        int i, j, temp;
        for (i = 0; i < n; i++){
            for (j = i + 1; j < n; j++){
                if (a[j] < a[i]) {
                    temp = a[i]; 
                    a[i] = a[j]; 
                    a[j] = temp;
                } 
            }
        } 
    }
    public static void main(String[] args) {
        int a[] = {35, 12, 45, 98, 87, 75, 10, 31, 11, 26};
        Bubble b = new Bubble();
        System.out.println("Before sorting array elements are :"); 
        int n = a.length;
        for (int i = 0; i < n; i++){
            System.out.print(a[i] + " "); 
        }
        b.bubbleSort(a);
        System.out.println();
        System.out.println("After sorting array elements are :"); 
        for (int i = 0; i < n; i++){
            System.out.print(a[i] + " "); 
        }
    }
}
