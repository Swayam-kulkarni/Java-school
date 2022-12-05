package Assignment_1;

public class area2 {
    public static void main(String[] args) {
        int r1, r2;
        r1 = 20;
        r2 = 30;
        double PI = 3.14, area_c1, area_c2, diff; 
        area_c1 = PI * r1 * r1;
        area_c2 = PI * r2 * r2;
        diff = area_c1 - area_c2;
        System.out.println("Radius of Circles = " + r1+ "\t" + r2); 
        System.out.println("Area of Circle 1 = " + area_c1); 
        System.out.println("Area of Circle 2 = " + area_c2); 
        System.out.println("Difference = " + diff);
    }
}
