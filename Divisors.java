public class Divisors {
    static void divisors(int n){
        int old = n;
        int temp = 0;
        int sum = 0;

        while (n > 0) {
            temp = n % 10;
            sum = (sum * 10) + temp;
            n = n / 10;
        }

        if (old == sum){
            System.out.println("Palindrome");
            return;
        }

        System.out.println("Not a palindrome");
    }
    public static void main(String[] args) {
        divisors(121);
    }
}
