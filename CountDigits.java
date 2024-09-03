public class CountDigits {

    static void count(int n){
        int count = 0;

        while (n > 0) {
            count += 1;
            n = n / 10;
        }

        System.out.println(count);
    }
    public static void main(String[] args) {
        count(1800);
    }
}
