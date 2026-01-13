package CoreJava.scannerclass;
import java.util.Scanner;

public class Entering_name {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //printing single word
        System.out.print("Enter your name (2 words at least): ");
        String name = sc.next();
        System.out.println("Your name is: "+ name);

        //printing whole line
        System.out.print("Enter your name (2 words at least): ");
        String name1= sc.nextLine();
        System.out.println("Your name is: "+ name1);
    }
}
