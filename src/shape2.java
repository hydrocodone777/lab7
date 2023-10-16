public class shape2 {
    public static void main(String[] args) {
        for (int c = 5; c >= 1; --c) {
            for (int r = 1; r <= c; ++r) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}