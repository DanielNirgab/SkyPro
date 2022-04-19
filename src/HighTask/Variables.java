package HighTask;

public class Variables {
    public static void main(String[] args) {
        // Task 6
        System.out.println("Task6");

        int age = 23;
        int salary = 58_000;
        int limit;
        if (age >= 23) {
            limit = salary * 3;

            if (salary >= 50_000) {
                limit *= 1.2;
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей");
            } else if (salary >= 80_000) {
                limit *= 1.5;
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей");
            } else {
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей");
            }

        } else if (age >= 16 && age < 23) {
            limit = salary * 2;
            if (salary >= 50_000) {
                limit *= 1.2;
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей");
            } else if (salary >= 80_000) {
                limit *= 1.5;
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей");
            } else {
                System.out.println("Мы готовы выдать вам кредитную карту с лимитом " + limit + " рублей");
            }
        } else {
            System.out.println("Для вашего возраста нет предложений");
        }

        //Task 7
        System.out.println();
        System.out.println("Task7");

            int age1 = 25;
            int salary1 = 60_000;
            int wantedSum = 130_000;
            double baseRate = 0.1;
            double maxPayment = salary1*0.5;
            double baseMonthPayment;

            if (age1<23) {
                baseRate += 0.01;
                if (salary1 > 80_000) {
                    baseRate -= 0.007;
                }
                baseMonthPayment = wantedSum * (baseRate+1)/12;
                if (baseMonthPayment > maxPayment) {
                    System.out.println("Максимальный платеж при ЗП " + salary1 + " равен " + maxPayment + " рублей. Платеж по кредиту " +
                            baseMonthPayment + " рублей. Отказано.");
                } else {
                    System.out.println("Максимальный платеж при ЗП " + salary1 + " равен " + maxPayment + " рублей. Платеж по кредиту " +
                            baseMonthPayment + " рублей. Одобрено.");
                }
            }
            if (age1 >= 23 && age1 < 30){
                baseRate += 0.005;

                if (salary1 > 80_000) {
                    baseRate -= 0.007;
                }
                baseMonthPayment = wantedSum * (baseRate+1)/12;
                if (baseMonthPayment > maxPayment) {
                    System.out.println("Максимальный платеж при ЗП " + salary1 + " равен " + maxPayment + " рублей. Платеж по кредиту " +
                            baseMonthPayment + " рублей. Отказано.");
                } else {
                    System.out.println("Максимальный платеж при ЗП " + salary1 + " равен " + maxPayment + " рублей. Платеж по кредиту " +
                            baseMonthPayment + " рублей. Одобрено.");
                }
            }
    }
}
