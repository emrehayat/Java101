package repeatingevennumbers;

public class RepeatingEvenNumbers {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] numbers = {1, 12, 24, 33, 4, 33, 12, 4, 33, 37, 16, 15, 15, 16, 8};
        int[] duplicate = new int[numbers.length];
        int startingIndex = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers.length; j++) {
                if ((numbers[i] % 2 == 0) && (i != j) && (numbers[i] == numbers[j])) {
                    if (!isFind(duplicate, numbers[i])) {
                        duplicate[startingIndex++] = numbers[i];
                    }
                    break;
                }
            }
        }
        for (int value : duplicate) {
            if (value != 0) {
                System.out.println(value);
            }
        }
    }
}