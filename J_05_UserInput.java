import java.util.Scanner;

public class J05_UserInput {
    public static void main(String[] args) {
        System.out.println( "taking input from user");
        Scanner sc = new Scanner(System.in);  
        // System.in --> Reads from keyboard
        System.out.println("Enter Number 1");
        // int a = sc.nextInt();
        float a = sc.nextFloat();
        System.out.println("Enter number 2");
        // int b = sc.nextInt();
        float b = sc.nextFloat();
        // int sum = a+b ;
        float sum = a+b ;
        System.out.println("sum of number is ");
        System.out.println(sum);

   /*  boolean b1 = sc.hasNextInt();  it is used to check weather the user input is Int or not.
    System.out.println(b1);
    */

    /* String str = sc.nextLine();
       System.out.println(str);
       it's used to read the whole line 
     */
    }
}

