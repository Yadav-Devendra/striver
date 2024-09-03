import java.lang.Math;

public class Armstrong {
    static void armstrong(int n){

        int old = n;
        int cube = 0;
        int temp = 0;

        int count = (int) (Math.log10(n) + 1);

        while (n > 0) {
            temp = n % 10;
            cube = cube + (int) (Math.pow(temp, count));
            n = n / 10;
        }

        if (old == cube){
            System.out.println("Armstrong");
            return;
        }

        System.out.println("Not a armstrong");
    }
    public static void main(String[] args) {
        armstrong(153);
    }
}
