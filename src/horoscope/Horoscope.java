package horoscope;

import java.util.Scanner;

public class Horoscope {
    public static void main(String[] args) {
        int day, month;
        boolean isError = false;
        String horoscope = "";

        System.out.println("1: Ocak\n2: Şubat\n3: Mart\n4: Nisan\n5: Mayıs\n6: Haziran\n7: Temmuz\n8: Ağustos\n9: Eylül\n10: Ekim\n11: Kasım\n12: Aralık");

        Scanner inp = new Scanner(System.in);
        System.out.print("Doğduğunuz ay: ");
        month = inp.nextInt();
        System.out.print("Doğduğunuz gün: ");
        day = inp.nextInt();

        if (1<=month && month<=12) {
            if (month == 1) {
                if (1 <= day && day <= 31) {
                    if (day < 22) {
                        horoscope = "Oğlak";
                    } else {
                        horoscope = "Kova";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 2) {
                if (1 <= day && day <= 29) {
                    if (day < 20) {
                        horoscope = "Kova";
                    } else {
                        horoscope = "Balık";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 3) {
                if (1 <= day && day <= 31) {
                    if (day < 21) {
                        horoscope = "Balık";
                    } else {
                        horoscope = "Koç";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 4) {
                if (1 <= day && day <= 30) {
                    if (day < 21) {
                        horoscope = "Koç";
                    } else {
                        horoscope = "Boğa";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 5) {
                if (1 <= day && day <= 31) {
                    if (day < 22) {
                        horoscope = "Boğa";
                    } else {
                        horoscope = "İkizler";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 6) {
                if (1 <= day && day <= 30) {
                    if (day < 23) {
                        horoscope = "İkizler";
                    } else {
                        horoscope = "Yengeç";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 7) {
                if (1 <= day && day <= 31) {
                    if (day < 23) {
                        horoscope = "Yengeç";
                    } else {
                        horoscope = "Aslan";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 8) {
                if (1 <= day && day <= 31) {
                    if (day < 23) {
                        horoscope = "Aslan";
                    } else {
                        horoscope = "Başak";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 9) {
                if (1 <= day && day <= 30) {
                    if (day < 23) {
                        horoscope = "Başak";
                    } else {
                        horoscope = "Terazi";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 10) {
                if (1 <= day && day <= 31) {
                    if (day < 23) {
                        horoscope = "Terazi";
                    } else {
                        horoscope = "Akrep";
                    }
                } else {
                    isError = true;
                }
            } else if (month == 11) {
                if (1 <= day && day <= 30) {
                    if (day < 22) {
                        horoscope = "Akrep";
                    } else {
                        horoscope = "Yay";
                    }
                } else {
                    isError = true;
                }
            } else {
                if (1 <= day && day <= 31) {
                    if (day < 22) {
                        horoscope = "Yay";
                    } else {
                        horoscope = "Oğlak";
                    }
                } else {
                    isError = true;
                }
            }
        } else {
            isError = true;
        }
        if (isError) {
            System.out.println("Geçersiz bir giriş yaptınız, yeniden deneyiniz!");
        } else {
            System.out.println("Burcunuz: " + horoscope);
        }
    }
}