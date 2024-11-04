package primenumbers;

public class PrimeNumbers {
    public static void main(String[] args) {
        System.out.print("1-100 Arası Asal Sayılar: ");
        for (int i = 2; i <= 100; i++) {
            boolean isPrime = true;

            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}