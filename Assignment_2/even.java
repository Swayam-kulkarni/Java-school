package Assignment_2;

public class even{
    public static void main(String args[]){
       System.out.println("Even Numbers from 1 to 100 are :"); 
        for(int num=1 ; num <= 100 ; num++){ 
            if(num % 2 == 0){
            System.out.print(num+"\t");
            }
        }
    }
}
