import java.util.Scanner;

public class SwapVariables {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter the value of a: ");
        a=sc.nextInt();
        System.out.println("Enter the value of b: ");
        b=sc.nextInt();

        System.out.println("Before swapping: ");
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        int temp=a;
        a=b;
        b=temp;

        System.out.println("After swapping: ");
        System.out.println("a = "+a);
        System.out.println("b = "+b);

        sc.close();
    }}

