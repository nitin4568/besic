import java.util.Scanner;

public class fabbonaci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        int next;
        System.out.println("fabbonaci");
        for (int i = 0; i < n; i++) {

            System.out.println(a + "");

            // System.out.println(next = a + b);
            next = a + b;
            a = b;
            b = next;
        }
    }
}
// import java.util.Scanner;

// public class Fibonacci {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the number of terms:");
// int n = sc.nextInt();
// int a = 0;
// int b = 1;
// int next;

// System.out.println("Fibonacci series:");
// for (int i = 0; i < n; i++) {
// System.out.print(a + " ");
// next = a + b;
// a = b;
// b = next;
// }
// //
// }
