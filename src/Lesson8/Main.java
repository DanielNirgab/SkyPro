package Lesson8;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {

    public static void yearCheck (int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year +" год не является високосным");
        }
    }

    public static void versionCheck (int system, int yearOfIssue) {
        int currentYear = LocalDate.now().getYear();
        // 0 — iOS или 1 — Android
        if (system == 1) {
            if (yearOfIssue < currentYear) {
                System.out.println("Установите облегченную версию приложения для Android по ссылке");
            } else {
                System.out.println("Установите версию приложения для Android по ссылке");
            }
        } else if (system == 0) {
            if (yearOfIssue < currentYear) {
                System.out.println("Установите облегченную версию приложения для iOS по ссылке");
            } else {
                System.out.println("Установите версию приложения для iOS по ссылке");
            }
        }
    }

    public static void daysForDeliveryCheck (int deliveryDistance) {
        int days = 1;
        if (deliveryDistance < 20){
            System.out.println("Потребуется дней: " + days);
        } else if (deliveryDistance >= 20 && deliveryDistance < 60) {
            days += 1;
            System.out.println("Потребуется дней: " + days);
        } else if (deliveryDistance >= 60 && deliveryDistance < 100) {
            days += 2;
            System.out.println("Потребуется дней: " + days);
        } else {
            System.out.println("Доставки на такое расстояние не предусмотрено");
        }
    }

    public static void doubleSymbolCheck (String line) {

        for (int i = 1; i < line.length(); i++) {
            if (line.charAt(i) == line.charAt(i-1)){
                System.out.println("Найден дубль: " + line.charAt(i));
                break;
            } else if (i == line.length()-1) {
                System.out.println("Дублей не найдено");
            }
        }
    }

    public static void arrayReverse (int [] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                int temp = 0;
                    temp = numbers[i];
                    numbers[i] = numbers[j];
                    numbers[j] = temp;
                }
            }
        System.out.println(Arrays.toString(numbers));
    }


    public static void main(String[] args) {
        yearCheck(2400);
        versionCheck(0, 2022);
        daysForDeliveryCheck(99);
        doubleSymbolCheck("abcdefghijkk");
        arrayReverse(new int[]{3, 2, 1, 6, 5});
    }

}
