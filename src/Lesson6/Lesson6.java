package Lesson6;

import java.util.Arrays;

public class Lesson6 {

        static int[] arr = generateRandomArray();

        public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
        }
        public static void main(String[] args) {
            int summ = 0;
            for (int value : arr) {
                summ = summ + value;
            }
            System.out.println("Сумма трат за месяц составила " + summ + " рублей");

        //Task 2
            int min = 0;
            int max = 0;
            for (int i = 1; i < arr.length; i++){
                if (arr[i] < arr[i-1]) {
                    min = arr[i];
                } else if (arr[i] > arr[i-1]) {
                    max = arr[i];
                }
                }
            System.out.println("Минимальная сумма трат за день составила " + min + " рублей. Максимальная сумма трат за день составила " + max + " рублей");

        //Task 3
            double averageSumm = 0;
            for (int k : arr) {
                averageSumm += k;
            }
            System.out.println("Средняя сумма трат за месяц составила " + (averageSumm / arr.length) + " рублей.");

        //Task 4
            char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
            for (int z = reverseFullName.length-1; z >= 0 ; z--) {
                System.out.print(reverseFullName[z]);
            }
    }
}
