package Task1;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
        System.out.println("Задание 1:\nЯ\nхорошо\nзнаю\nJava.");
        System.out.println("Задание 2:");
        System.out.printf("(46 + 10) * (10 / 3) = %.2f\n", ((46.0 + 10.0) * (10.0 / 3.0)));
        System.out.println("(29) * (4) * (-15) = " + ((29) * (4) * (-15)));
        System.out.println("Задание 3:");
        double number = 10500;
        double result = (number / 10.0) / 10.0;
        System.out.println("(number / 10) / 10 = " + result);
        System.out.println("Задание 4:");
        double result2 = 3.6 * 4.1 * 5.9;
        System.out.println("3.6 * 4.1 * 5.9 = " + result2);
        System.out.println("Задание 5:");
        Scanner scanner = new Scanner(System.in);
        int[] mass = new int[64];
        int index = 0;
        while (true) {
            System.out.println("Введите число: ");
            int num = scanner.nextInt();
            mass[index++] = num;
            System.out.println("Продолжить ввод? Да/Нет");
            String answer = scanner.next();
            if (index == 64 || answer.equals("Да")) {
                break;
            }
        }

        for (int i = 0; i < index; i++) {
            System.out.println(mass[i]);
        }

        System.out.println("Задание 6:\nВведите число: ");
        int b = scanner.nextInt();

        if (b % 2 != 0) {
            System.out.println("Нечетное");
        } else if (b > 100) {
            System.out.println("Выход за пределы диапазона");
        } else {
            System.out.println("Четное");
        }
    }
}
