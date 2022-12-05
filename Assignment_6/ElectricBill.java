package Assignment_6;

import java.util.Scanner;

public class ElectricBill {
    private String n;
    private int units;
    private double bill;
    
    public void accept() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter customer name: ");
        n = sc.nextLine();
        System.out.print("Enter units consumed: ");
        units = sc.nextInt();
        sc.close();
    }
    
    public void calculate() {
        if (units <= 100)
            bill = units * 2;
        else if (units <= 300)
            bill = 200 + (units - 100) * 3;
        else {
            double amt = 200 + 600 + (units - 300) * 5;
            double surcharge = (amt * 2.5) / 100.0;
            bill = amt + surcharge;
        }
    }
    
    public void print() {
        System.out.println("Name of the customer\t\t: " + n);
        System.out.println("Number of units consumed\t: " + units);
        System.out.println("Bill amount\t\t\t: " + bill);
    }
    
    public static void main(String args[]) {
        ElectricBill obj = new ElectricBill();
        obj.accept();
        obj.calculate();
        obj.print();
    }
}
