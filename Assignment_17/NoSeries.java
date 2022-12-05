package Assignment_17;

public class NoSeries{
    public static void NumPyramid(int n) {
        int i, j,num;
        for(i=0; i<n; i++){ // outer loop for rows
            num=1;
            for(j=0; j<=i; j++){ // inner loop for rows
                System.out.print(num+ " ");
                num++; 
            }
            System.out.println(); 
        }
    }
    public static void main(String[] args) {
        NumPyramid(5);
    }
}