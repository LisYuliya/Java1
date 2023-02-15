import java.util.Arrays;
import java.util.Scanner;

public class task {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("task 1");
        System.out.print("Input a number a: ");
        int a = in.nextInt();
        System.out.print("Input a number b: ");
        int b = in.nextInt();
        in.close();
        System.out.println(isSumBetween10And20(a, b));

        System.out.println("task 2");
        System.out.println(isPositive(1));

        System.out.println("task 3");
        printString("hello", 2);

        System.out.println("task 4");
        System.out.println(isLeapYear(2024));

        System.out.println("task 5");
        int[] arr = createArray(5, 6);
        System.out.println(Arrays.toString(arr));

        System.out.println("task 6");
        String[] arr1 = { "aaa", "aab", "aa" };
        String[] arr2 = { "abc", "bca", "cda" };
        System.out.println(findCommonPrefix(arr1));
        System.out.println(findCommonPrefix(arr2));

        System.out.println("task 7");
        int[] arr3 = { 1, 1, 0, 0, 1, 0, 1, 1, 0, 0 };
        invertArray(arr3);
        System.out.println(Arrays.toString(arr3));

        System.out.println("task 8");
        int[] arr4 = { 6, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        multiplyLessThanSix(arr4);
        System.out.println(Arrays.toString(arr4));

        System.out.println("task 9");
        int[][] arr5 = new int[5][5];
        fillDiagonal(arr5);

        System.out.println("task 10");
        int[] arr6 = { 50, 15, 32, 2, 11, 45, 58, 2, 46, 81, 9, 8 };
        int[] result = findMinMax(arr6);
        System.out.println("Минимальное значение: " + result[0]);
        System.out.println("Максимальное значение: " + result[1]);

    }

    public static boolean isSumBetween10And20(int a, int b) {
        // проверить, что сумма a и b лежит между 10 и 20

        int summ = a + b;
        return (summ >= 10 && summ <= 20);

    }

    public static boolean isPositive(int x) {
        // проверить, что х положительное
        if (x > 0) {
            return true;
        }
        return false;

    }

    public static void printString(String source, int repeat) {
        // напечатать строку source repeat раз
        String s = new String();
        for (int i = 0; i < repeat; i++) {
            s += source;

        }
        System.out.println(s);
        ;

    }

    public static boolean isLeapYear(int year) {
        // проверить, является ли год високосным. если да - return true
        if (year % 4 == 0) {
            if ((year % 100 != 0) || (year % 400 == 0)) {
                return true;
            }
        }
        return false;
    }

    public static int[] createArray(int len, int initialValue) {
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
        }
        return arr;
    }

    public static String findCommonPrefix(String[] source) {
        if (source == null || source.length == 0) {
            return "";
        }
        String prefix = source[0];
        for (int i = 1; i < source.length; i++) {
            while (source[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length() - 1);
                if (prefix.isEmpty()) {
                    return "";
                }
            }
        }
        return prefix;
    }

    public static void invertArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
    }

    public static void multiplyLessThanSix(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
    }

    public static void fillDiagonal(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i][i] = 1;
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int[] findMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return new int[] { min, max };
    }

}
