package HighTask;

public class Сycles {
    public static void main(String[] args) {
        for (int i = 1; i <=30 ; i++) {
        if (i % 3 == 0 && i % 5 == 0) {
            System.out.println(i + ": " + "ping" + " " + "pong");
        } else if (i % 3 == 0) {
                System.out.println(i + ": " + "ping");
            } else if (i % 5 == 0) {
                System.out.println(i + ": " + "pong");
            } else {
                System.out.println(i +":");
            }
        }

        int f1 = 0;
        int f2 = 1;
        System.out.println();
        System.out.print(f1 + " ");
        System.out.print(f2 + " ");
        for (int i = 3; i <= 10; i++) {
            int f3 = f1+f2;
            f1 = f2;
            f2 = f3;
            System.out.print(f3 + " ");
        }
    }
}
