package Pack;

import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
public class First {
    public static void remdiv(int a, int b) {
        int r;
        r = a % b;
        System.out.println("Остаток от деления = " + r);
    }

    public static void triarea(int a, int h) {
        int s;
        s = a * h / 2;
        System.out.println("Площадь треугольника = " + s);

    }

    public static void farm(int ch, int co, int p) {
        int chl = 2;
        int col = 4;
        int pl = 4;
        int r;
        r = chl * ch + col * co + pl * p;
        System.out.println("Общее количество ног у животных = " + r);
    }

    public static boolean profit(double prob, int prize, int pay) {
        if (prob * prize > pay) {
            System.out.println("true");
            return true;
        } else
            System.out.println("false");
        return false;
    }

    public static void whattodo(int N, int a, int b) {
        while (true) {
            if (a + b == N) {
                System.out.println("Сложение");
                break;
            }
            if (a - b == N) {
                System.out.println("Вычитание ");
                break;
            }
            if (a * b == N) {
                System.out.println("Умножение ");
                break;
            }
            if (a / b == N) {
                System.out.println("Деление ");
                break;
            } else {
                System.out.println("Невозможно получить подобный результат для данных чисел ");
                break;
            }
        }
    }

    public static void sym(char a) {
        Character c = a;
        System.out.println((int) c);
    }

    public static void addup(int a) {
        int f = 0;
        for (int i = 1; i <= a; i++) {
            f = f + i;
        }
        System.out.println("Прибавление для введённого числа = " + f);
    }

    public static void maxedge(int a, int b) {
        int c;
        c = a + b - 1;
        System.out.println("Максимальное значение третьего ребра = " + c);
    }

    public static void cubsum() {
        double[] arr;
        int n;
        double r = 0;
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("Пожалуйста, введите размерность массива ");
        n = in.nextInt();
        System.out.println("Пожалуйста, введите максимально возможное число в массиве ");
        int j = in.nextInt();
        arr = new double[n];
        for (int i = 0; i < arr.length; i++) {

            arr[i] = rand.nextInt(j + 1);
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            r = r + Math.pow(arr[i], 3);
        }
        System.out.println("Сумма кубов чисел массива = " + r);
    }

    public static void atob(int a, int b, int c) {
        int r;
        r = a;
        for (int i = 1; i < b; i++) {
            r = r * 2;
        }
        if (r % c == 0) {
            System.out.println("Делится");
        } else
            System.out.println("Не делится");
    }

    public static void main(String[] args) {
        int choice = 1;
        Scanner in = new Scanner(System.in);
        while (choice <= 60 && choice > 0) {
            System.out.println("Пожалуйста, введите номер задачи от 1 до 60. Введите любое другое число для выхода ");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Пожалуйста, введите делимое ");
                    int a = in.nextInt();
                    System.out.println("Пожалуйста, введите делитель ");
                    int b = in.nextInt();
                    remdiv(a, b);
                    break;
                case 2:
                    System.out.println("Пожалуйста, введите основание ");
                    a = in.nextInt();
                    System.out.println("Пожалуйста, введите высоту ");
                    int h = in.nextInt();
                    triarea(a,h);
                    break;
                case 3:
                    System.out.println("Пожалуйста, введите количество куриц ");
                    int ch = in.nextInt();
                    System.out.println("Пожалуйста, введите количество коров ");
                    int co = in.nextInt();
                    System.out.println("Пожалуйста, введите количество свиней ");
                    int p = in.nextInt();
                    farm(ch, co, p);
                    break;
                case 4:
                    System.out.println("Пожалуйста, введите prob ");
                    double prob = in.nextDouble();
                    System.out.println("Пожалуйста, введите prize ");
                    int prize = in.nextInt();
                    System.out.println("Пожалуйста, введите pay ");
                    int pay = in.nextInt();
                    profit(prob, prize, pay);
                    break;
                case 5:
                    System.out.println("Пожалуйста, введите результатирующее число ");
                    int N = in.nextInt();
                    System.out.println("Пожалуйста, введите первое число ");
                    a = in.nextInt();
                    System.out.println("Пожалуйста, введите второе число ");
                    b = in.nextInt();
                    whattodo(N, a, b);
                    break;
                case 6:
                    System.out.println("Пожалуйста введите символ");
                    sym(in.next().charAt(0));
                    break;
                case 7:
                    System.out.println("Пожалуйста, введите число ");
                    a = in.nextInt();
                    addup(a);
                    break;
                case 8:
                    System.out.println("Пожалуйста, введите первую сторону ");
                    a = in.nextInt();
                    System.out.println("Пожалуйста, введите вторую сторону ");
                    b = in.nextInt();
                    maxedge(a,b);
                    break;
                case 9:
                    cubsum();
                    break;
                case 10:
                    System.out.println("Пожалуйста, введите первое число ");
                    a = in.nextInt();
                    System.out.println("Пожалуйста, введите второе число ");
                    b = in.nextInt();
                    System.out.println("Пожалуйста, введите третье число ");
                    int c = in.nextInt();
                    atob(a,b,c);
                    break;
                case 11:
                    System.out.println("Пожалуйста, введите строку ");
                    in.nextLine();
                    String str = in.nextLine();
                    System.out.println("Пожалуйста, введите количество раз ");
                    int j = in.nextInt();
                    Second eleven = new Second();
                    eleven.repeater(str, j);
                    break;
                case 12:
                    Second twelve = new Second();
                    twelve.diff();
                    break;
                case 13:
                    Second thirteen = new Second();
                    thirteen.checkavg();
                    break;
                case 14:
                    Second fourteen = new Second();
                    fourteen.cumulativesum();
                    break;
                case 15:
                    Second fifteen = new Second();
                    fifteen.getdec();
                    break;
                case 16:
                    Second sixteen = new Second();
                    sixteen.fibonacci();
                    break;
                case 17:
                    Second seventeen = new Second();
                    seventeen.post();
                    break;
                case 18:
                    Second eighteen = new Second();
                    eighteen.strange();
                    break;
                case 19:
                    Second nineteena = new Second();
                    nineteena.isPrefix();
                    break;
                case 20:
                    Second nineteenb = new Second();
                    nineteenb.isSuffix();
                    break;
                case 21:
                    Second twenty = new Second();
                    twenty.seqstep();
                    break;
                case 22:
                    Third twentyone = new Third();
                    System.out.println("Пожалуйста, введите a ");
                    a = in.nextInt();
                    System.out.println("Пожалуйста, введите b ");
                    b = in.nextInt();
                    in.useDelimiter(",|\\s+");
                    System.out.println("Пожалуйста, введите c ");
                    c = in.nextInt();
                    twentyone.squarequation(a,b,c);
                    break;
                case 23:
                    Third twentytwo = new Third();
                    System.out.println("Пожалуйста, введите строку ");
                    in.nextLine();
                    str = in.nextLine();
                    twentytwo.findzip(str);
                    break;
                case 24:
                    Third twentythree = new Third();
                    System.out.println("Пожалуйста, введите число ");
                    int n = in.nextInt();
                    twentythree.findperfect(n);
                    break;
                case 25:
                    Third twentyfour = new Third();
                    System.out.println("Пожалуйста, введите строку");
                    in.nextLine();
                    str = in.nextLine();
                    twentyfour.flipchars(str);
                    break;
                case 26:
                    Third twentyfive = new Third();
                    System.out.println("Пожалуйста, введите строку");
                    in.nextLine();
                    str = in.nextLine();
                    twentyfive.HEX(str);
                    break;
                case 27:
                    Third twentysix = new Third();
                    twentysix.sameunique();
                    break;
                case 28:
                    Third twentyseven = new Third();
                    System.out.println("Пожалуйста, введите число");
                    n = in.nextInt();
                    twentyseven.kaprekar(n);
                    break;
                case 29:
                    Third twentyeight = new Third();
                    System.out.println("Пожалуйста, введите число ");
                    in.nextLine();
                    str = in.nextLine();
                    twentyeight.zeroseq(str);
                    break;
                case 30:
                    Third twentynine = new Third();
                    System.out.println("Пожалуйста, введите число ");
                    n = in.nextInt();
                    twentynine.nextprime(n);
                    break;
                case 31:
                    Third thirty = new Third();
                    System.out.println("Пожалуйста, введите а ");
                    a = in.nextInt();
                    System.out.println("Пожалуйста, введите b ");
                    b = in.nextInt();
                    System.out.println("Пожалуйста, введите c ");
                    c = in.nextInt();
                    thirty.righttriangle(a,b,c);
                    break;
                case 32:
                    Fourth thirtyone = new Fourth();
                    System.out.println("Пожалуйста, введите количество слов, равное или меньше 100 ");
                    n = in.nextInt();
                    while (n > 100) {
                        System.out.println("Количество слов не может превышать 100! Сделайте ввод ещё раз ");
                        n = in.nextInt();
                    }
                    System.out.println("Пожалуйста, введите количество символов в строке, равное или меньше 80 ");
                    int k = in.nextInt();
                    while (k > 80) {
                        System.out.println("Количество символов в строке не может превышать 80! Сделайте ввод ещё раз ");
                        k = in.nextInt();
                    }
                    System.out.println("Пожалуйста введите строку ");
                    in.nextLine();
                    str = in.nextLine();
                    int spc = 0;
                    boolean pass = false;
                    while(pass==false) {
                        for (int i = 0; i < str.length(); i++) {
                            if (str.charAt(i) == ' ') {
                                spc++;
                            }
                        }
                        if (spc > n - 1) {
                            spc = 0;
                            System.out.println("Количество слов в строке превышает допустимый предел, совершите ввод ещё раз! ");
                            str = in.nextLine();
                        }
                        else
                            pass = true;
                    }
                    thirtyone.Bessie(n,k,str);
                case 33:
                    Fourth thirtytwo = new Fourth();
                    System.out.println("Пожалуйста, введите строку ");
                    in.nextLine();
                    str = in.nextLine();
                    thirtytwo.cluster(str);
                case 34:
                    Fourth thirtythree = new Fourth();
                    System.out.println("Пожалуйста, введите строку ");
                    in.nextLine();
                    str = in.nextLine();
                    thirtythree.toCamelCase(str);
                case 35:
                    Fourth thirtyfour = new Fourth();
                    System.out.println("Пожалуйста, введите строку ");
                    in.nextLine();
                    str = in.nextLine();
                    thirtyfour.toSnakeCase(str);
                case 36:
                    Fourth thirtyfive = new Fourth();
                    double[] arr = new double[4];
                    for (int i = 0; i < arr.length; i++)
                    {
                        System.out.println("Пожалуйста, введите число");
                        arr[i] = in.nextDouble();
                    }
                    thirtyfive.overtime(arr);
                case 37:
                    Fourth thirtysix = new Fourth();
                    System.out.println("Пожалуйста, введите вес и единицу измерения");
                    in.nextLine();
                    String weight = in.nextLine();
                    System.out.println("Пожалуйста, введите рост и единицу измерения");
                    String height = in.nextLine();
                    thirtysix.BMI(weight,height);
                case 38:
                    Fourth thirtyseven = new Fourth();
                    System.out.println("Пожалуйста, введите число");
                    a = in.nextInt();
                    thirtyseven.burger(a);
                case 39:
                    Fourth thirtyeight = new Fourth();
                    System.out.println("Пожалуйса, введите строку");
                    in.nextLine();
                    str = in.nextLine();
                    thirtyeight.starlight(str);
                case 40:
                    Fourth thirtynine = new Fourth();
                    System.out.println("Пожалуйста, введите строку");
                    in.nextLine();
                    str=in.nextLine();
                    System.out.println("Пожалуйста, введите строку");
                    String str1 = in.nextLine();
                    thirtynine.rhyme(str,str1);
            }
        }
    }
}
