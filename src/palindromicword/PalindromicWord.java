package palindromicword;

import java.util.Scanner;

public class PalindromicWord {
    static boolean isPalindrome() {
        Scanner inp = new Scanner(System.in);
        System.out.print("Kelimeyi giriniz: ");
        String word = inp.nextLine();

        int i = 0, j = word.length() - 1;

        while (i < j) {
            if (word.charAt(i) != word.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println("Palindrom kelime mi? => " + isPalindrome());
    }
}