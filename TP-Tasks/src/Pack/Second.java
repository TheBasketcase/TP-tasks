package Pack;

import java.util.Scanner;
import java.util.Random;
public class Second {
    public static void repeater(String str, int j) {
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            for (int h = 0; h < j; h++) {

                res += str.substring(i, i + 1);
            }
        }
        System.out.println(res);
    }

    public static void diff() {
        int[] arr;
        int n;
        int max = 0;
        int min = 0;
        int d;
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Пожалуйста, введите размерность массива ");
        n = in.nextInt();
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {

            arr[i] = (rand.nextInt(200) - 100);
            ;
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        System.out.println("Наибольшее число в массиве = " + max);
        System.out.println("Наименьшее число в массиве = " + min);
        d = max - min;
        System.out.println("Разница между наибольшим и наименьшим числами в массиве = " + d);
    }

    public static boolean checkavg() {
        int arr[];
        int n;
        double avg = 0;
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Пожалуйста, введите размерность массива ");
        n = in.nextInt();
        System.out.println("Пожалуйста, введите максимально возможное число в массиве ");
        int j = in.nextInt();
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {

            arr[i] = rand.nextInt(j + 1);
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            avg = arr[i] + avg;
        }
        avg = avg / arr.length;
        System.out.println("Среднее значение элементов массива = " + avg);
        if (avg % 10 == 0) {
            System.out.println("Целое");
            return true;
        } else {
            System.out.println("Нецелое");
            return false;
        }
    }

    public static void cumulativesum() {
        int arr[];
        int n;
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Пожалуйста, введите размерность массива ");
        n = in.nextInt();
        System.out.println("Пожалуйста, введите максимально возможное число в массиве ");
        int j = in.nextInt();
        arr = new int[n];
        for (int i = 0; i < arr.length; i++) {

            arr[i] = rand.nextInt(j + 1);
            System.out.println(arr[i]);
        }
        System.out.println("--------------------------------------------------------");
        int newarr[] = new int[arr.length];
        newarr[0] = arr[0];
        for (int i = 1; i < newarr.length; i++)
            newarr[i] = newarr[i - 1] + arr[i];

        for (int i = 0; i < newarr.length; i++)
            System.out.println(newarr[i] + " ");
    }

    public static void getdec() {
        String num;
        int quant = 0;
        String number;
        Scanner in = new Scanner(System.in);
        System.out.println("Пожалуйста, введите число ");
        num = in.nextLine();
        number = num.substring(num.lastIndexOf(".") + 1);
        if (number.length() == num.length()) {
            quant = 0;
        } else {
            quant = number.length();
        }
        System.out.println("Количество десятичных знаков = " + quant);
    }

    public static void fibonacci() {
        Scanner in = new Scanner(System.in);
        int fib1 = 1;
        int fib2 = 1;
        System.out.println("Пожалуйста, введите число Фибоначчи ");
        int n = in.nextInt();
        int i = 0;
        while (i < n - 1) {
            int fib_sum = fib1 + fib2;
            fib1 = fib2;
            fib2 = fib_sum;
            i = i + 1;
        }
        System.out.println("Число Фибоначчи = " + fib2);
    }

    public static void post() {
        String str;
        Scanner in = new Scanner(System.in);
        System.out.println("Пожауйста, введите почтовый индекс ");
        str = in.nextLine();
        for (int i = 0; i < str.length(); i++) {
            if (str.contains(" ") || str.contains("[a-zA-Z]+") == false || str.contains("-?[\\d]+") == false || str.length() > 5) {
                System.out.println("false ");
                break;
            } else {
                System.out.println("true ");
                break;
            }
        }
    }

    public static void strange() {
        Scanner in = new Scanner(System.in);
        System.out.println("Пожауйста, введите первую строку ");
        String str1 = in.nextLine();
        System.out.println("Пожауйста, введите вторую строку ");
        String str2 = in.nextLine();
        int n = str1.length() - 1;
        int m = str2.length() - 1;
        if (str1.isEmpty() == false && str2.isEmpty() == false){
            if (str1.charAt(0) == str2.charAt(m) && str1.charAt(n) == str2.charAt(0)) {
                    System.out.println("true ");
                }
                else {
                System.out.println("false ");
            }
        }
        if (str1.isEmpty() == true && str2.isEmpty() == true)
            System.out.println("true ");
        if (str1.isEmpty() == true && str2.isEmpty() == false)
            System.out.println("false ");
        if (str1.isEmpty() == false && str2.isEmpty() == true)
            System.out.println("false ");
    }
    public static void isPrefix(){
        Scanner in = new Scanner(System.in);
        System.out.println("Пожауйста, введите слово ");
        String str = in.nextLine();
        System.out.println("Пожауйста, введите искомый префикс ");
        String pre = in.nextLine();
        pre = pre.replace("-", "");
        if (str.startsWith(pre) == true){
            System.out.println("true ");
        }
            else{
                System.out.println("false ");
            }
    }
    public static void isSuffix(){
        Scanner in = new Scanner(System.in);
        System.out.println("Пожауйста, введите слово ");
        String str = in.nextLine();
        System.out.println("Пожауйста, введите искомый суффикс ");
        String suf = in.nextLine();
        suf = suf.replace("-", "");
        if (str.endsWith(suf) == true){
            System.out.println("true ");
        }
        else{
            System.out.println("false ");
        }
    }
    public static void seqstep(){
        Scanner in = new Scanner(System.in);
        System.out.println("Пожауйста, введите шаг ");
        int n = in.nextInt();
        int r = 0;
        if (n == 0) {
            System.out.println(r);
        }
        else{
            for (int i = 1; i <= n; i++){
                if (n%2 == 0)
                    r = n;
                else
                    r = n + 2;
            }
            System.out.println(r);
        }
    }
}
