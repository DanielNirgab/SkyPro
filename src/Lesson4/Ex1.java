package Lesson4;

public class Ex1 {
    public static void main(String[] args) {
        System.out.println("1st Task");
    // Task 1
        int i = 0;
        while (i<10) {
            i++;
            System.out.print(i + " ");
        }
        System.out.println();
        for (i=10; i > 0; i--) {
            System.out.print(i + " ");
        }

    // Task 2
        System.out.println("\n");
        System.out.println("2nd Task");

        int friday = 3;
        for (int dayMonth = 0; dayMonth <= 31; dayMonth++) {
            if (friday == dayMonth) {
                System.out.println("Сегодня пятница, " + dayMonth + "-е число. Необходимо подготовить отчет");
                friday+=7;
            }
        }
    // Task 3
        System.out.println();
        System.out.println("3rd Task");

        int currentYear = 2022;
        for (int cometYear = currentYear - 200; cometYear < currentYear + 100; cometYear++) {
            if (cometYear % 79 == 0) {
                System.out.println(cometYear);
            }
        }
    }
}
