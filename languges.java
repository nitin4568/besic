import java.util.Scanner;

public class languges {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the nuber");
        int num = sc.nextInt();
        if (num == 1) {
            System.out.println("namste");
        } else if (num == 2) {
            System.out.println("hello");
        } else if (num == 3) {
            System.out.println("bonjor");
        }

        else {
            System.out.println("abe bhan ka luda hai kya ");
        }
    }
}
