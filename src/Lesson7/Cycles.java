package Lesson7;

public class Cycles {
    public static void main(String[] args) {
        String firstName = "Петр";
        String middleName = "Федерович";
        String secondName = "Иванов";
        String fullName = secondName + " " + firstName + " " + middleName;
        System.out.println("ФИО сотрудника — " + fullName);

        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + fullName.toUpperCase());

        fullName = "Иванов Семён Семёнович";
        System.out.println("Данные ФИО сотрудника — " + fullName.replace("ё", "е"));
    }
}
