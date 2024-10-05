//package java.dsa;

import java.nio.file.SecureDirectoryStream;
import java.util.*;

public class first {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter the age");
        // Scanner sc = nexInt();
        int age = sc.nextInt();
        if (age > 18) {
            System.out.println("adult");
        } else {
            System.out.println("not adult");
        }

    }
}
