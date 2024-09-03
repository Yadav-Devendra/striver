public class ReverseNumber {

    static void reverse(int n){
        int temp = 0;
        int sum = 0;

        while (n > 0) {
            temp = n % 10;
            sum = (sum * 10) + temp;
            n = n / 10;
        }

        System.out.println(sum);
    }
    public static void main(String[] args) {
        reverse(456);
    }
}
