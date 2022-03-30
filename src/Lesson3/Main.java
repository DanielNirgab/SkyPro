package Lesson3;


import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Task 1
        System.out.println("Task1");
        System.out.println("Отправьте цифру соответствующую вашей ОС? 0 - iOS; 1 - Android");
        Scanner scanner = new Scanner(System.in);
        int clientOS = scanner.nextInt();
        if (clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientOS == 1){
            System.out.println("Установите версию приложения для Android по ссылке");
        } else {
            System.out.println("Приложение доступно только для iOS или Android");
        }

        //Task 2
        System.out.println();
        System.out.println("Task 2");
        int clientDeviceYear = 2014;
        if (clientDeviceYear < 2015 && clientOS == 0){
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("Установите версию приложения для iOS по ссылке");
        } else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("Установите версию приложения для Android по ссылке");
        }

        //Task 3
        System.out.println();
        System.out.println("Task 3");
        int year = 2400;
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0){
            System.out.println(year + " год является високосным");
        } else {
            System.out.println(year +" год не является високосным");
        }

    //Task 4
        System.out.println();
        System.out.println("Task 4");
        int days = 1;
        int deliveryDistance = 95;
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

    //Task 5
        System.out.println();
        System.out.println("Task 5");
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Month is not valid");
        }
    }
}
