package Pack;

import java.util.Scanner;
import java.util.Random;
import java.lang.Math;
import java.util.ArrayList;
public class First {
    public static void remdiv(int a, int b) {
        int r;
        r = a % b;
        System.out.println("������� �� ������� = " + r);
    }

    public static void triarea(int a, int h) {
        int s;
        s = a * h / 2;
        System.out.println("������� ������������ = " + s);

    }

    public static void farm(int ch, int co, int p) {
        int chl = 2;
        int col = 4;
        int pl = 4;
        int r;
        r = chl * ch + col * co + pl * p;
        System.out.println("����� ���������� ��� � �������� = " + r);
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
                System.out.println("��������");
                break;
            }
            if (a - b == N) {
                System.out.println("��������� ");
                break;
            }
            if (a * b == N) {
                System.out.println("��������� ");
                break;
            }
            if (a / b == N) {
                System.out.println("������� ");
                break;
            } else {
                System.out.println("���������� �������� �������� ��������� ��� ������ ����� ");
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
        System.out.println("����������� ��� ��������� ����� = " + f);
    }

    public static void maxedge(int a, int b) {
        int c;
        c = a + b - 1;
        System.out.println("������������ �������� �������� ����� = " + c);
    }

    public static void cubsum() {
        double[] arr;
        int n;
        double r = 0;
        Scanner in = new Scanner(System.in);
        Random rand = new Random();
        System.out.println("����������, ������� ����������� ������� ");
        n = in.nextInt();
        System.out.println("����������, ������� ����������� ��������� ����� � ������� ");
        int j = in.nextInt();
        arr = new double[n];
        for (int i = 0; i < arr.length; i++) {

            arr[i] = rand.nextInt(j + 1);
            System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length; i++) {
            r = r + Math.pow(arr[i], 3);
        }
        System.out.println("����� ����� ����� ������� = " + r);
    }

    public static void atob(int a, int b, int c) {
        int r;
        r = a;
        for (int i = 1; i < b; i++) {
            r = r * 2;
        }
        if (r % c == 0) {
            System.out.println("�������");
        } else
            System.out.println("�� �������");
    }

    public static void main(String[] args) {
        int choice = 1;
        Scanner in = new Scanner(System.in);
        while (choice <= 60 && choice > 0) {
            System.out.println("����������, ������� ����� ������ �� 1 �� 60. ������� ����� ������ ����� ��� ������ ");
            choice = in.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("����������, ������� ������� ");
                    int a = in.nextInt();
                    System.out.println("����������, ������� �������� ");
                    int b = in.nextInt();
                    remdiv(a, b);
                    break;
                case 2:
                    System.out.println("����������, ������� ��������� ");
                    a = in.nextInt();
                    System.out.println("����������, ������� ������ ");
                    int h = in.nextInt();
                    triarea(a,h);
                    break;
                case 3:
                    System.out.println("����������, ������� ���������� ����� ");
                    int ch = in.nextInt();
                    System.out.println("����������, ������� ���������� ����� ");
                    int co = in.nextInt();
                    System.out.println("����������, ������� ���������� ������ ");
                    int p = in.nextInt();
                    farm(ch, co, p);
                    break;
                case 4:
                    System.out.println("����������, ������� prob ");
                    double prob = in.nextDouble();
                    System.out.println("����������, ������� prize ");
                    int prize = in.nextInt();
                    System.out.println("����������, ������� pay ");
                    int pay = in.nextInt();
                    profit(prob, prize, pay);
                    break;
                case 5:
                    System.out.println("����������, ������� ���������������� ����� ");
                    int N = in.nextInt();
                    System.out.println("����������, ������� ������ ����� ");
                    a = in.nextInt();
                    System.out.println("����������, ������� ������ ����� ");
                    b = in.nextInt();
                    whattodo(N, a, b);
                    break;
                case 6:
                    System.out.println("���������� ������� ������");
                    sym(in.next().charAt(0));
                    break;
                case 7:
                    System.out.println("����������, ������� ����� ");
                    a = in.nextInt();
                    addup(a);
                    break;
                case 8:
                    System.out.println("����������, ������� ������ ������� ");
                    a = in.nextInt();
                    System.out.println("����������, ������� ������ ������� ");
                    b = in.nextInt();
                    maxedge(a,b);
                    break;
                case 9:
                    cubsum();
                    break;
                case 10:
                    System.out.println("����������, ������� ������ ����� ");
                    a = in.nextInt();
                    System.out.println("����������, ������� ������ ����� ");
                    b = in.nextInt();
                    System.out.println("����������, ������� ������ ����� ");
                    int c = in.nextInt();
                    atob(a,b,c);
                    break;
                case 11:
                    System.out.println("����������, ������� ������ ");
                    in.nextLine();
                    String str = in.nextLine();
                    System.out.println("����������, ������� ���������� ��� ");
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
                    System.out.println("����������, ������� ����� ��������� ");
                    int n = in.nextInt();
                    sixteen.fibonacci(n);
                    break;
                case 17:
                    Second seventeen = new Second();
                    System.out.println("���������, ������� �������� ������ ");
                    in.nextLine();
                    str = in.nextLine();
                    seventeen.post(str);
                    break;
                case 18:
                    Second eighteen = new Second();
                    System.out.println("���������, ������� ������ ������ ");
                    in.nextLine();
                    String str1 = in.nextLine();
                    System.out.println("���������, ������� ������ ������ ");
                    String str2 = in.nextLine();
                    eighteen.strange(str1,str2);
                    break;
                case 19:
                    Second nineteen = new Second();
                    System.out.println("���������, ������� ����� ");
                    in.nextLine();
                    str = in.nextLine();
                    System.out.println("���������, ������� ������� ������� ");
                    String pre = in.nextLine();
                    System.out.println("���������, ������� ����� ");
                    str1 = in.nextLine();
                    System.out.println("���������, ������� ������� ������� ");
                    String suf = in.nextLine();
                    nineteen.isPrefix(str,pre);
                    nineteen.isSuffix(str1,suf);
                    break;
                case 20:
                    Second twenty = new Second();
                    System.out.println("���������, ������� ��� ");
                    n = in.nextInt();
                    twenty.seqstep(n);
                    break;
                case 21:
                    Third twentyone = new Third();
                    System.out.println("����������, ������� a ");
                    a = in.nextInt();
                    System.out.println("����������, ������� b ");
                    b = in.nextInt();
                    in.useDelimiter(",|\\s+");
                    System.out.println("����������, ������� c ");
                    c = in.nextInt();
                    twentyone.squarequation(a,b,c);
                    break;
                case 22:
                    Third twentytwo = new Third();
                    System.out.println("����������, ������� ������ ");
                    in.nextLine();
                    str = in.nextLine();
                    twentytwo.findzip(str);
                    break;
                case 23:
                    Third twentythree = new Third();
                    System.out.println("����������, ������� ����� ");
                    n = in.nextInt();
                    twentythree.findperfect(n);
                    break;
                case 24:
                    Third twentyfour = new Third();
                    System.out.println("����������, ������� ������");
                    in.nextLine();
                    str = in.nextLine();
                    twentyfour.flipchars(str);
                    break;
                case 25:
                    Third twentyfive = new Third();
                    System.out.println("����������, ������� ������");
                    in.nextLine();
                    str = in.nextLine();
                    twentyfive.HEX(str);
                    break;
                case 26:
                    Third twentysix = new Third();
                    twentysix.sameunique();
                    break;
                case 27:
                    Third twentyseven = new Third();
                    System.out.println("����������, ������� �����");
                    n = in.nextInt();
                    twentyseven.kaprekar(n);
                    break;
                case 28:
                    Third twentyeight = new Third();
                    System.out.println("����������, ������� ����� ");
                    in.nextLine();
                    str = in.nextLine();
                    twentyeight.zeroseq(str);
                    break;
                case 29:
                    Third twentynine = new Third();
                    System.out.println("����������, ������� ����� ");
                    n = in.nextInt();
                    twentynine.nextprime(n);
                    break;
                case 30:
                    Third thirty = new Third();
                    System.out.println("����������, ������� � ");
                    a = in.nextInt();
                    System.out.println("����������, ������� b ");
                    b = in.nextInt();
                    System.out.println("����������, ������� c ");
                    c = in.nextInt();
                    thirty.righttriangle(a,b,c);
                    break;
                case 31:
                    Fourth thirtyone = new Fourth();
                    System.out.println("����������, ������� ���������� ����, ������ ��� ������ 100 ");
                    n = in.nextInt();
                    while (n > 100) {
                        System.out.println("���������� ���� �� ����� ��������� 100! �������� ���� ��� ��� ");
                        n = in.nextInt();
                    }
                    System.out.println("����������, ������� ���������� �������� � ������, ������ ��� ������ 80 ");
                    int k = in.nextInt();
                    while (k > 80) {
                        System.out.println("���������� �������� � ������ �� ����� ��������� 80! �������� ���� ��� ��� ");
                        k = in.nextInt();
                    }
                    System.out.println("���������� ������� ������ ");
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
                            System.out.println("���������� ���� � ������ ��������� ���������� ������, ��������� ���� ��� ���! ");
                            str = in.nextLine();
                        }
                        else
                            pass = true;
                    }
                    thirtyone.Bessie(n,k,str);
                    break;
                case 32:
                    Fourth thirtytwo = new Fourth();
                    System.out.println("����������, ������� ������ ");
                    in.nextLine();
                    str = in.nextLine();
                    thirtytwo.cluster(str);
                    break;
                case 33:
                    Fourth thirtythree = new Fourth();
                    System.out.println("����������, ������� ������ ");
                    in.nextLine();
                    str = in.nextLine();
                    System.out.println("����������, ������� ������ ");
                    str1 = in.nextLine();
                    thirtythree.toCamelCase(str);
                    thirtythree.toSnakeCase(str1);
                    break;
                case 34:
                    Fourth thirtyfour = new Fourth();
                    double[] arr = new double[4];
                    for (int i = 0; i < arr.length; i++)
                    {
                        System.out.println("����������, ������� �����");
                        arr[i] = in.nextDouble();
                    }
                    thirtyfour.overtime(arr);
                    break;
                case 35:
                    Fourth thirtyfive = new Fourth();
                    System.out.println("����������, ������� ��� � ������� ���������");
                    in.nextLine();
                    String weight = in.nextLine();
                    System.out.println("����������, ������� ���� � ������� ���������");
                    String height = in.nextLine();
                    thirtyfive.BMI(weight,height);
                    break;
                case 36:
                    Fourth thirtysix = new Fourth();
                    System.out.println("����������, ������� �����");
                    a = in.nextInt();
                    thirtysix.burger(a);
                    break;
                case 37:
                    Fourth thirtyseven = new Fourth();
                    System.out.println("���������, ������� ������");
                    in.nextLine();
                    str = in.nextLine();
                    thirtyseven.starlight(str);
                    break;
                case 38:
                    Fourth thirtyeight = new Fourth();
                    System.out.println("����������, ������� ������");
                    in.nextLine();
                    str=in.nextLine();
                    System.out.println("����������, ������� ������");
                    str1 = in.nextLine();
                    thirtyeight.rhyme(str,str1);
                    break;
                case 39:
                    Fourth thirtynine = new Fourth();
                    System.out.println("����������, ������� ����� ");
                    in.nextLine();
                    str1 = in.nextLine();
                    System.out.println("����������, ������� ����� ");
                    str2 = in.nextLine();
                    thirtynine.numb32(str1,str2);
                    break;
                case 40:
                    Fourth fourty = new Fourth();
                    System.out.println("����������, ������� ������");
                    in.nextLine();
                    str = in.nextLine();
                    System.out.println("����������, ������� ������ ");
                    char un = in.next().trim().charAt(0);
                    fourty.uniqbook(str,un);
                    break;
                case 41:
                    Fifth fourtyone = new Fifth();
                    System.out.println("����������, ������� ������");
                    in.nextLine();
                    str = in.nextLine();
                    System.out.println("����������, ������� ����������� �������");
                    n = in.nextInt();
                    int arr1[] = new int[n];
                    System.out.println("����������, ������� ������");
                    for (int i = 0; i<arr1.length; i++){
                        arr1[i] = in.nextInt();
                    }
                    fourtyone.encrypt(str);
                    fourtyone.decrypt(arr1);
                    break;
                case 42:
                    Fifth fourtytwo = new Fifth();
                    System.out.println("����������, ������� ������");
                    in.nextLine();
                    str = in.nextLine();
                    System.out.println("����������, ������� �������� �������");
                    str1 = in.nextLine();
                    System.out.println("����������, ������� �������� �������");
                    str2 = in.nextLine();
                    System.out.println(fourtytwo.canMove(str,str1,str2));
                    break;
                case 43:
                    Fifth fourtythree = new Fifth();
                    System.out.println("������� ����� �����");
                    in.nextLine();
                    str = in.nextLine();
                    System.out.println("������� ����� �����");
                    str1 = in.nextLine();
                    System.out.println(fourtythree.canComplete(str,str1));
                    break;
                case 44:
                    Fifth fourtyfour = new Fifth();
                    ArrayList<Integer> arrl =new ArrayList<Integer>();
                    boolean end = false;
                    System.out.println("����������, ������� ������ �����. ������� ����� < 0, ����� ��������� ����");
                    while (!end){
                        a = in.nextInt();
                        if (a >= 0)
                        arrl.add(a);
                        else
                            end = true;
                    }
                    int arr2[] = new int[arrl.size()];
                    for (int i = 0; i < arr2.length; i++){
                        arr2[i] = arrl.get(i).intValue();
                    }
                    fourtyfour.sumdigProd(arr2);
                    break;
                case 45:
                    Fifth fourtyfive = new Fifth();
                    System.out.println("����������, ������� ����������� �������");
                    n = in.nextInt();
                    String[] arrStr = new String[n];
                    str = null;
                    System.out.println("����������, ������� ������ �����");
                    in.nextLine();
                    for (int i = 0; i < arrStr.length; i++) {
                        str=in.nextLine();
                        arrStr[i] = str;
                    }
                    fourtyfive.sameVowelGroup(arrStr);
                    break;
                case 46:
                    Fifth fourtysix = new Fifth();
                    System.out.println("����������, ������ ����� �����");
                    Long card = in.nextLong();
                    System.out.println(fourtysix.validateCard(card));
                    break;
                case 47:
                    Fifth fourtyseven = new Fifth();
                    int bin = 0;
                    System.out.println("����������, ������� �����");
                    a = in.nextInt();
                    while (bin != 1 && bin != 2) {
                        System.out.println("�� ����� ����� �������� �����? 1 - ����������, 2 - �������");
                        bin = in.nextInt();
                        if (bin == 1)
                            System.out.println(fourtyseven.numToEng(a));
                        else if (bin == 2)
                            System.out.println(fourtyseven.numToRus(a));
                        else
                            System.out.println("������������ �������!");
                    }
                    break;
                case 48:
                    Fifth fourtyeight = new Fifth();
                    System.out.println("����������, ������� ������");
                    in.nextLine();
                    str = in.nextLine();
                    System.out.println(fourtyeight.getSha256Hash(str));
                    break;
                case 49:
                    Fifth fourtynine = new Fifth();
                    System.out.println("����������, ������� ������");
                    in.nextLine();
                    str = in.nextLine();
                    System.out.println(fourtynine.correctTitle(str));
                    break;
                case 50:
                    Fifth fifty = new Fifth();
                    System.out.println("����������, ������� �����");
                    a = in.nextInt();
                    System.out.println(fifty.hexLattice(a));
                    break;
                case 51:
                    Sixth fiftyone = new Sixth();
                    System.out.println("����������, ������� �����");
                    a = in.nextInt();
                    System.out.println(fiftyone.bell(a));
                    break;
                case 52:
                    Sixth fiftytwo = new Sixth();
                    System.out.println("����������, �������� ����� ��� ������");
                    in.nextLine();
                    str = in.nextLine();
                    String [] array = str.trim().split(" ");
                    if(array.length==1)
                    {
                        System.out.println(fiftytwo.translateWord(str));
                    }
                    else
                        {
                            System.out.println(fiftytwo.translateSentence(str));
                        }
                    break;
                case 53:
                    Sixth fiftythree = new Sixth();
                    System.out.println("����������, ������� ������");
                    in.nextLine();
                    str = in.nextLine();
                    System.out.println(fiftythree.validColor(str));
                    break;
                case 54:
                    Sixth fiftyfour = new Sixth();
                    bin = 0;
                    while (bin != 1 && bin != 2) {
                        System.out.println("� ����� ������ ���������? 1 - URL ������, 2 - URL ������ � ���. ��������");
                        bin = in.nextInt();
                        if (bin == 1){
                            System.out.println("����������, ������� ������");
                            in.nextLine();
                            str = in.nextLine();
                            System.out.println(fiftyfour.stripUrlParams(str));
                        }
                        else if (bin == 2) {
                            System.out.println("����������, ������� ������");
                            in.nextLine();
                            str = in.nextLine();
                            System.out.println("����������, ������� ����������� �������");
                            n = in.nextInt();
                            arrStr = new String[n];
                            System.out.println("����������, ������� ������ �����");
                            in.nextLine();
                            for (int i = 0; i < arrStr.length; i++) {
                                arrStr[i] = in.nextLine();
                            }
                            System.out.println(fiftyfour.stripUrlParams(str,arrStr));
                        }
                        else
                            System.out.println("������������ �������!");
                    }
                    break;
                case 55:
                    Sixth fiftyfive = new Sixth();
                    System.out.println("���������� ������� ������");
                    in.nextLine();
                    str = in.nextLine();
                    fiftyfive.getHashTags(str);
                    break;
                case 56:
                    Sixth fiftysix = new Sixth();
                    System.out.println("����������, ������� �����");
                    a = in.nextInt();
                    System.out.println(fiftysix.ulam(a));
                    break;
                case 57:
                    Sixth fiftyseven = new Sixth();
                    System.out.println("����������, ������� ������");
                    in.nextLine();
                    str = in.nextLine();
                    System.out.println(fiftyseven.longestNonrepeatingSubstring(str));
                    break;
                case 58:
                    Sixth fiftyeight = new Sixth();
                    System.out.println("����������, ������� �����");
                    a = in.nextInt();
                    System.out.println(fiftyeight.convertToRoman(a));
                    break;
                case 59:
                    Sixth fiftynine = new Sixth();
                    System.out.println("����������, ������� ������");
                    in.nextLine();
                    str = in.nextLine();
                    System.out.println(fiftynine.formula(str));
                    break;
                case 60:
                    Sixth sixty = new Sixth();
                    System.out.println("����������, ������� �����");
                    a = in.nextInt();
                    System.out.println(sixty.palindromeDescendant(a));
                    break;
            }

        }
    }
}
