public class Pattern10 {

    static void pattern1(int n){
        for (int i = 0; i < 2*n - 2; i++) {
            int stars = i;
            if (i > n){
                stars = 2*n - i;
            }
            for (int j = 0; j < stars; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 12;
        pattern1(n);
    }
}
