package CoreJava.scannerclass;
import java.util.Scanner;

public class simpleinterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Principle: ");
        float p = sc.nextFloat();

        System.out.print("Enter rate of interest: ");
        float r = sc.nextFloat();

        System.out.print("Enter durtion: ");
        float t = sc.nextFloat();

        System.out.println("Principle: " + p);
        System.out.println("Rate of Interest: " + r);
        System.out.println("Time: "+t);

        float si = (p*r*t)/100;
        System.out.print("Simple interest is: "+si);
    }
}
