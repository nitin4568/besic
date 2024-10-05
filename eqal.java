import java.util.Scanner;

public class eqal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the variabal");
        int a = sc.nextInt();
        System.out.println("enter the second varibal");
        int b = sc.nextInt();
        if (a == b) {
            System.out.println("eqal");

        } else if (a > b) {
            System.out.println(" ais greater than b");
        } else {
            System.out.println("a is les than b");
        }
    }
}
