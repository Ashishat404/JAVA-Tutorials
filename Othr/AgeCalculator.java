// This is an Age Calculator Which Calculates your Age on your YYYY-MM-DD entered 

import java.time.LocalDate;
import java.util.Scanner;

public class AgeCalculator {
    public static void main(String args[]){ 
    Scanner Sc = new Scanner(System.in);
    System.out.println("Enter Your Birth Year");
    int y = Sc.nextInt();
    System.out.println("Enter Your Birth Month");
    int z = Sc.nextInt();
    System.out.println("Enter Your Birth Date");
    int a = Sc.nextInt();

    LocalDate current = LocalDate.now();
    LocalDate Actual = LocalDate.of(y,z,a);
    }
}
