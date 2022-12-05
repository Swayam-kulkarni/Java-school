package Assignment_17;

public class STAR{
    public static void StarPyramid1(int n) {
        int i, j; //Pattern 1
        for(i=1; i<=n; i++){ 
            for(j=0; j<i; j++){
                System.out.print("* "); 
            }
            System.out.println(); 
        }
    }
    public static void StarPyramid2(int n) {
        int i, j; //Pattern 2
        for(i=n-1; i>=0; i--){ 
            for(j=0; j<=i; j++){
                System.out.print("* "); 
            }
        System.out.println(); 
        }
    }
    public static void main(String[] args) {
        StarPyramid1(5);
        System.out.println("\n");
        StarPyramid2(5); 
    }
}
