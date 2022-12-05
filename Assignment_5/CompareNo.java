package Assignment_5;

public class CompareNo {
    public void max(int a, int b, int c){ 
        if(a>b && a>c){
            System.out.println("Maximum Number is : "+ a); 
        }
        else if(b>a && b>c){
            System.out.println("Maximum Number is : "+ b); 
        }
        else if(c>a && c>b){
            System.out.println("Maximum Number is : "+ c); 
        }
    }

    public void min(int a, int b, int c){
        if(a<b && a<c){
            System.out.println("Minimum Number is : "+ a);
        }
        else if(b<a && b<c){ 
            System.out.println("Minimum Number is : "+ b);
        }
        else if(c<a && c<b){
            System.out.println("Minimum Number is : "+ c);
        } 
    }
    public static void main(String args[]){
        CompareNo obj = new CompareNo(); 
        obj.max(54, 41, 12);
        obj.min(54, 41, 12);
    }

}
