package userLogin;

import java.util.Scanner;

public class UserLogin {
    public static void main(String[] args) {
        String userName, password, newPassword;
        int reset;

        Scanner inp = new Scanner(System.in);
        System.out.print("Kullanıcı adınız: ");
        userName = inp.nextLine();
        System.out.print("Şifreniz: ");
        password = inp.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş yaptınız!");
        } else {
            System.out.println("Yanlış veri girişi!");
        }

        if (!password.equals("java123")) {
            System.out.println("Şifrenizi sıfırlamak ister misiniz?\n1-Evet\n2-Hayır");
            reset = inp.nextInt();
            inp.nextLine();
            switch (reset) {
                case 1:
                    System.out.print("Yeni şifre: ");
                    newPassword = inp.nextLine();
                    if (!newPassword.equals(password)) {
                        System.out.println("Şifre oluşturuldu!");
                    } else {
                        System.out.println("Şifre oluşturulamadı, lütfen başka şifre giriniz!");
                    }
                    break;
                case 2:
                    System.out.println("Şifre sıfırlama işlemi iptal edildi.");
                    break;
                default:
                    System.out.println("1 veya 2 sayılarından birini giriniz!");
            }
        }
    }
}