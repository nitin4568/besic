import java.util.Scanner;

public class odd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the num ");
        int a = sc.nextInt();
        if (a % 2 == 0) {
            System.out.println("Even");

        } else {
            System.out.println("odd");
        }

    }
}