package Task4;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void showOdd() {
        for (int i = 1; i <= 99; i += 2) {
            System.out.println(i);
        }
    }

    public static void showDividedThreeAndFive() {
        for (int i = 3; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("Делится на 3 и на 5: " + i);
            } else if (i % 3 == 0) {
                System.out.println("Делится на 3: " + i);
            } else if (i % 5 == 0) {
                System.out.println("Делится на 5: " + i);
            }
        }
    }

    public static boolean sumAndCheck(int a, int b, int c) {
        return (a + b) == c;
    }

    public static boolean checkOneBiggerThanTwo(int a, int b, int c) {
        return b > a && c > b;
    }

    public static boolean checkThreeInMass(int[] mass) {
        return mass[0] == 3 || mass[mass.length - 1] == 3;
    }

    public static boolean containsOneOrThree(int[] mass) {
        for (int num : mass) {
            if (num == 3 || num == 1) {
                return true;
            }
        }
        return false;
    }

    public static void isSorted(int[] mass) {
        System.out.println("array: ");
        for (int num: mass) {
            System.out.print(num + " ");
        }
        System.out.println();
        for (int i = 0; i < mass.length - 1; i++) {
            if (mass[i] > mass[i + 1]) {
                System.out.println("Please, try again");
                return;
            }
        }
        System.out.println("OK");
    }


    public static void writeArrayAndShow() {
        System.out.print("Array length: ");
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int[] mass = new int[N];
        System.out.println("Numbers of array:");
        for (int i = 0; i < N; i++) {
            mass[i] = scanner.nextInt();
        }
        System.out.print("Result: [");
        for (int i = 0; i < N; i++) {
            System.out.print(mass[i]);
            if (i < N - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static int[] swapMassAndShow(int[] array1) {
        System.out.println("Array 1:" );
        System.out.println(Arrays.toString(array1));
        int num = array1[0];
        array1[0] = array1[array1.length-1];
        array1[array1.length-1] = num;
        System.out.println("Array 2:" );
        System.out.println(Arrays.toString(array1));
        return array1;
    }

    public static void findUnique(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        int[] counts = new int[max + 1];
        for (int j : array) {
            counts[j]++;
        }

        for (int count : counts) {
            if (count == 1) {
                System.out.println(count);
                return;
            }
        }
    }

    public static void mergeSortArray(int[] array, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        int[] l = new int[mid];
        int[] r = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            l[i] = array[i];
        }
        for (int i = mid; i < n; i++) {
            r[i - mid] = array[i];
        }
        mergeSortArray(l, mid);
        mergeSortArray(r, n - mid);

        merge(array, l, r, mid, n - mid);
    }

    public static void merge(
            int[] a, int[] l, int[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i] <= r[j]) {
                a[k++] = l[i++];
            }
            else {
                a[k++] = r[j++];
            }
        }
        while (i < left) {
            a[k++] = l[i++];
        }
        while (j < right) {
            a[k++] = r[j++];
        }
    }

    public static void createArrayAndSort(int n) {
        int[] array = new int[n];
        Random random = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = random.nextInt(100);
        }

        mergeSortArray(array, n);
        System.out.print("Result: [");
        for (int i = 0; i < n; i++) {
            System.out.println(array[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        System.out.println("Задание 1.1: ");
        showOdd();
        System.out.println("Задание 1.2: ");
        showDividedThreeAndFive();
        System.out.println("Задание 1.3: ");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.print("Введите третье число: ");
        int c = scanner.nextInt();
        System.out.println(sumAndCheck(a, b, c));
        System.out.println("Задание 1.4: ");
        System.out.print("Введите первое число: ");
        a = scanner.nextInt();
        System.out.print("Введите второе число: ");
        b = scanner.nextInt();
        System.out.print("Введите третье число: ");
        c = scanner.nextInt();
        System.out.println(checkOneBiggerThanTwo(a, b, c));
        System.out.println("Задание 1.5: ");
        int[] mass = {1, 2, 4, 2, 3};
        checkThreeInMass(mass);
        System.out.println("Задание 1.6: ");
        System.out.println(containsOneOrThree(mass));
        System.out.println("Задание 2.1: ");
        int[] mass2 = {1, 2, 5, 7, 12};
        isSorted(mass2);
        isSorted(mass);
        System.out.println("Задание 2.2: ");
        writeArrayAndShow();
        System.out.println("Задание 2.3: ");
        int[] array1 = {1, 2, 5, 7, 12};
        swapMassAndShow(array1);
        System.out.println("Задание 2.4: ");
        findUnique(array1);
        System.out.println("Задание 2.5: ");
        createArrayAndSort(5);
    }
}
