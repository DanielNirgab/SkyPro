package Lesson5;

import java.util.Arrays;

public class Ex5 {
    public static void main(String[] args) {
    //Task1

        int [] firstMas = new int[3];
        firstMas[0] = 1;
        firstMas[1] = 2;
        firstMas[2] = 3;
        double [] second = {1.57, 7.654, 9.986};
        String [] third = {"Ivan", "Petr", "Anna"};

    //Task2
    System.out.println("Task2");

        for (int i = 0; i < firstMas.length ; i++) {
            if (i == firstMas.length-1) {
                System.out.println(firstMas[i]);
                break;
            }
                System.out.print(firstMas[i] + ", ");
        }
        for (int z = 0; z < second.length ; z++) {
            if (z == second.length-1) {
                System.out.println(second[z]);
                break;
            }
            System.out.print(second[z] + ", ");
        }
        for (int j = 0; j < third.length ; j++) {
            if (j == third.length-1) {
                System.out.println(third[j]);
                break;
            }
            System.out.print(third[j]+ ", ");
        }

    // Task3
    System.out.println();
    System.out.println("Task3");

        for (int i = firstMas.length-1; i >= 0 ; i--) {
            if (i == 0) {
                System.out.println(firstMas[i]);
                break;
            }
            System.out.print(firstMas[i] + ", ");
        }
        for (int z = second.length-1; z >= 0 ; z--) {
            if (z == 0) {
                System.out.println(second[z]);
                break;
            }
            System.out.print(second[z] + ", ");
        }
        for (int j = third.length-1; j >= 0 ; j--) {
            if (j == 0) {
                System.out.println(third[j]);
                break;
            }
            System.out.print(third[j]+ ", ");
        }

    // Task4
    System.out.println();
    System.out.println("Task4");

        for (int i = 0; i < firstMas.length; i++) {
            if (firstMas[i]%2!=0) {
                firstMas[i] += 1;
            }
        }
        System.out.println(Arrays.toString(firstMas));
    }
}
