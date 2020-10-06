package Pack;
import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
import java.util.Arrays;
public class Third {
    public static void squarequation (int a, int b, int c){
        double x1;
        double x2;
        double d;
        d = Math.pow(b,2) - 4*a*c;
        System.out.println("d =  " +d);
        if (d>0){
            System.out.println("Уравнение имеет два решения ");
            x1 = (-b + Math.sqrt(d))/2*a;
            System.out.println("Первый корень =  " +x1);
            x2 = (-b - Math.sqrt(d))/2*a;
            System.out.println("Второй корень =  " +x2);
        }
        else if (d == 0){
            System.out.println("Уравнение имеет одно решение ");
            x1 = -b/2*a;
            System.out.println("Корень =  " +x1);
        }
        else
            System.out.println("Уравнение не имеет решения ");
    }
    public static void findzip (String str) {
        int firstIndex = str.indexOf("zip");
        int index;
        if (firstIndex != str.lastIndexOf("zip") && firstIndex != -1){
            index = str.lastIndexOf("zip");
            System.out.println(index);
        }
        else {
            index = -1;
            System.out.println(index);
        }
    }
    public static void findperfect (int n){
        int sum = 0;
        for(int i = 1; i < n; i++)
        {
            if(n % i == 0)
            {
                sum = sum + i;
            }
        }
        if(sum == n)
        {
            System.out.println("Данное число является идеальным ");
        }
        else
        {
            System.out.println("Данное число не является идеальным ");
        }
    }
    public static void flipchars (String str){
        char[]ch = str.toCharArray();
        char temp = ch[0];
        if (str.length() < 2)
            System.out.println("Несовместимо ");
        else if (ch[0] == ch[ch.length-1])
                System.out.println("Two is a pair ");
        else{
        ch[0] = ch[ch.length - 1];
        ch[ch.length - 1] = temp;
        System.out.println(String.valueOf(ch));}
    }
    public static void HEX (String str){
        if (str.length()!= 6 || str.charAt(0) != '#' || str.contains("-?[\\d]+") == true || str.contains(".*[g-zG-Z].*"))
            System.out.println("Данная строка не является HEX-кодом ");
            else
                System.out.println("Данная строка валидный HEX-код");
    }
    public static void sameunique() {
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        int un1 = 0;
        int un2 = 0;
        System.out.println("Пожалуйста, введите размерность первого массива ");
        int n1 = in.nextInt();
        System.out.println("Пожалуйста, введите размерность второго массива ");
        int n2 = in.nextInt();
        int[] arr1 = new int[n1];
        int[] arr2 = new int[n2];
        System.out.println("Пожалуйста, введите максимально возможное число в массиве ");
        int m = in.nextInt();
        for (int i = 0; i < arr1.length; i++) {

            arr1[i] = rand.nextInt(m + 1);
            System.out.println(arr1[i]);
        }
        System.out.println("---------------------------------------------------------");
        for (int i = 0; i < arr2.length; i++) {

            arr2[i] = rand.nextInt(m + 1);
            System.out.println(arr2[i]);
        }
        for (int j = 0; j < arr1.length; j++) {
            int num = arr1[j];
            boolean checking = false;
            for (int i = 0; i < j; i++) {
                if (num == arr1[i]) {
                    checking = true;
                }
            }
            if (!checking) {
                un1++;
            }
        }
        for (int j = 0; j < arr2.length; j++) {
            int num = arr2[j];
            boolean checking = false;
            for (int i = 0; i < j; i++) {
                if (num == arr2[i]) {
                    checking = true;
                }
            }
            if (!checking) {
                un2++;
            }
        }
        System.out.println("Количество уникальных чисел в первом массиве = " +un1);
        System.out.println("Количество уникальных чисел во втором массиве = " +un2);
        if (un1 == un2)
            System.out.println("Истина" );
        else
            System.out.println("Ложь" );
    }
    public static void kaprekar (int n){
        int square = n * n;
        int squareCopy = square;
        int len = 0;
        while (squareCopy != 0) {
            len++;
            squareCopy /= 10;
        }
        boolean isKaprekar = false;
        for (int i = 1; i < len; i++) {
            int divisor = (int) Math.pow(10, i);
            int quotient = square / divisor;
            int remainder = square % divisor;
            if (quotient + remainder == n) {
                isKaprekar = true;
            }
        }
        if (isKaprekar == true)
            System.out.println("Число " +n + " является числом Капрекара");
            else
            System.out.println("Число " +n + " не является числом Капрекара");
    }
    public static void zeroseq (String str){
        int n = 0;
        int lz = 0;
        for (int i = 0; i<str.length(); i++){
            if (str.charAt(i) == '0')
                n++;
            if (n > lz)
                lz = n;
            if (str.charAt(i) == '1')
                n = 0;
        }
        int[] zerostr = new int[lz];
        for (int i = 0; i<zerostr.length; i++){
            zerostr[i] = 0;
            System.out.print(zerostr[i]);
        }
        System.out.println();
    }
    public static void nextprime (int n){
        int temp;
        boolean isPrime = true;
        for(int i=2;i<=n/2;i++)
        {
            temp=n%i;
            if(temp==0)
            {
                isPrime=false;
                break;
            }
        }
        if(isPrime)
            System.out.println(n);
        else{
            n++;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                n++;
                i = 2;
            } else {
                continue;
            }
        }
        System.out.println(n);
        }
    }
    public static void righttriangle(int a, int b, int c){
        if (c*c == a*a + b*b || b*b == a*a + c*c || a*a == b*b + c*c)
            System.out.println("Треугольник прямоугольный");
        else
            System.out.println("Треугольник не является прямоугольным");
    }
}
