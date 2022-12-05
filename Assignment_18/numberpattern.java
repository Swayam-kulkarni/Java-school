package Assignment_18;

import java.util.Scanner;
public class numberpattern {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in); 
        System.out.print("Enter the number of rows: "); 
        int rows = sc.nextInt();
        int num = 1;
        for (int i = 0; i < rows; i++){
            for (int j = 1; j < rows - i; j++){ 
                System.out.print(" ");
            }
            for (int k = 0; k <= i; k++) {
                System.out.print(num++); 
            }
            num = 1;
            System.out.println(); 
        }
        sc.close();
    } 
}
