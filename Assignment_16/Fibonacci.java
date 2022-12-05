package Assignment_16;

public class Fibonacci {
    public static void main(String[] args) {
        int a, b, c;
        a = 0;
        b = 1;
        System.out.println("The Fibonacci series till 15 terms are :");
        for(int i=1;i<=15;++i){
            System.out.print(a + " "); 
            c = a + b;
            a = b;
            b = c;
        }
    }
}
