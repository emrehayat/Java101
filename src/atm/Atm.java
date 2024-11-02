package atm;

import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password;
        int right = 3;
        int balance = 5000;
        int select;

        while (right > 0) {
            System.out.print("Kullanıcı adınızı giriniz: ");
            userName = input.nextLine();
            System.out.print("Şifrenizi giriniz: ");
            password = input.nextLine();

            if (userName.equals("patika") && password.equals("dev123")) {
                System.out.println("Bankamıza hoşgeldiniz!");
                do {
                    System.out.println("1-Para yatır\n2-Para Çek\n3-Bakiye Sorgula\n4-Çıkış Yap");
                    System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Para miktarı: ");
                            int price = input.nextInt();
                            balance += price;
                            break;
                        case 2:
                            System.out.print("Para miktarı: ");
                            int price2 = input.nextInt();
                            if (price2 > balance) {
                                System.out.println("Bakiye yetersiz!");
                            } else {
                                balance -= price2;
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                    }
                } while (select != 4);
                System.out.println("Çıkış yaptınız. Tekrar görüşmek üzere.");
                break;
            } else {
                right --;
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz.");
                } else {
                    System.out.println("Hatalı kullanıcı adı veya şifre! Tekrar deneyiniz.");
                    System.out.println("Kalan hakkınız: " + right);
                }
            }
        }
    }
}