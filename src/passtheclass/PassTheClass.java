package passtheclass;

import java.util.Scanner;

public class PassTheClass {
    public static void main(String[] args) {
        int mat, fizik, turkce, kimya, muzik, count = 0;
        double total = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Matematik notunuz: ");
        mat = input.nextInt();
        if (mat >= 0 && mat <= 100) {
            total += mat;
            count++;
        }

        System.out.print("Fizik notunuz: ");
        fizik = input.nextInt();
        if (fizik >= 0 && fizik <= 100) {
            total += fizik;
            count++;
        }

        System.out.print("Türkçe notunuz: ");
        turkce = input.nextInt();
        if (turkce >= 0 && turkce <= 100) {
            total += turkce;
            count++;
        }

        System.out.print("Kimya notunuz: ");
        kimya = input.nextInt();
        if (kimya >= 0 && kimya <= 100) {
            total += kimya;
            count++;
        }

        System.out.print("Müzik notunuz: ");
        muzik = input.nextInt();
        if (muzik >= 0 && muzik <= 100) {
            total += muzik;
            count++;
        }

        if (count == 0) {
            System.out.println("Geçerli bir not girmediniz!");
        } else {
            double average = total / 5;

            if (average < 55) {
                System.out.println("Sınıfta kaldınız!");
            } else {
                System.out.println("Sınıfı geçtiniz!");
            }

            System.out.println("Ortalamanız: " + average);
        }
    }
}