public class fullpiramid {
    // public class halfpiramid {
    public static void main(String[] args) {
        int n = 4;
        int m = 4;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            for (int k = 1; k <= m; k++) {
                for (int l = 1; l <= k; l++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}