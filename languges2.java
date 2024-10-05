import java.util.Scanner;

public class languges2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.err.println("enter the number");4
        int num = sc.nextInt();
        switch (num) {
            case 1:
                System.out.println("namste");
                break;
            case 2:
                System.out.println("hello");
                break;
            case 3:
                System.out.println("bojor");
            default:
                System.out.println("abe thoda ka bahn ka luda hai kya");
                break;
        }

    }

}
