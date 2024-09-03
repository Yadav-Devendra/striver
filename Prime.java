public class Prime {
    static void prime(int n){
        int count = 0;

        for (int i = 1; i <= Math.sqrt(n); i++) {
            if (n % i == 0){
                count += 1;
            }

            if (n / i != i ){
                count += 1;
            }
        }

        if (count == 2) {
            System.out.println("prime number");
        } else {
            System.out.println("not a prime number");
        }
    }
    public static void main(String[] args) {
        prime(36);
    }
}
