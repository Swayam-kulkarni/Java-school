package Assignment_2;

public class odd {
    public static void main(String[] args){
        System.out.println("Odd Numbers from 1 to 100 are :");
        for(int num=1 ; num <= 100 ; num++){
            if(num % 2 == 1){
                System.out.print(num+"\t");
            }
        }
    }
}
