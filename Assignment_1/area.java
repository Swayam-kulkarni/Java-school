package Assignment_1;

public class area {
    public static void main(String args[]){ 
        int r, l, b;
        r = 10;
        l = 10;
        b = 5;
        double PI = 3.14, area_c, area_r; area_c = PI * r * r;
        area_r = l * b;
        System.out.println("Radius of Circle = " + r); 
        System.out.println("Area of Circle = " + area_c); 
        System.out.println("Length & Breadth of Rectangle = " + l + "\t" + b); 
        System.out.println("Area of Rectangle = " + area_r);
    }
}

