package Pack;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.lang.Math;
import java.math.BigDecimal;
public class Fourth {
    public static void Bessie(int n, int k, String str) {
        String[] lines = str.split(" ");
        String res = "";
        int currentLine = 0;
        for (String line: lines)
        {
            if (line.length() + currentLine <= k)
            {
                if (res.length() > 0) res += " ";
                res += line;
                currentLine += line.length();
            }
            else
            {
                res += "\n" + line;
                currentLine = line.length();
            }
        }
        System.out.println(res);
    }
    public static void cluster(String str){
        ArrayList<String> res = new ArrayList<String>();

        int opened = 0;
        int start = 0;
        int end = 0;
        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) == '(')
                opened++;
            else
                opened--;
            if (opened == 0)
            {
                end = i + 1;
                res.add(str.substring(start, end));
                start = end;
            }
        }
        String [] arr = res.toArray((new String[0]));
        if (arr.length == 0)
        {
            System.out.println("[ ]");
            return;
        }
        System.out.print("[\"");
        for (int i = 0; i < arr.length - 1; i++)
        {
            System.out.print(arr[i] + "\", \"");
        }
        System.out.println(arr[arr.length-1] + "\"]");
    }
    public static void toCamelCase(String str){
        StringBuffer sb = new StringBuffer(str);
        for (int i = 0; i<sb.length(); i++) {
            if (sb.charAt(i) == '_') {
                sb.setCharAt(i + 1, Character.toUpperCase(sb.charAt(i + 1)));
                sb.deleteCharAt(i);
            }
        }
            System.out.println(sb.toString());
    }
    public static void toSnakeCase(String str){
        StringBuffer sb = new StringBuffer(str);
        for (int i = 0; i<sb.length(); i++) {
            if(Character.isUpperCase(sb.charAt(i))){
                sb.setCharAt(i, Character.toLowerCase(sb.charAt(i)));
                sb.insert(i, "_");
            }
        }
        System.out.println(sb.toString());
    }
    public static void overtime(double[] arr){
        double pay = 1.0;
        double rem = 0.0;
        double remw = 0.0;
            if (arr[0] >= 17) {
                rem = arr[1] - arr[0];
                pay = rem * arr[2] * arr[3];
            }
            else if (arr[1] > 17){
                rem = arr[1] - 17;
                remw = (17 - arr[0]) * arr[2];
                pay = rem*arr[2]*arr[3];
                pay = pay + remw;
            }
            else{
                remw = arr[1] - arr[0];
                pay = remw * arr[2];
            }
        System.out.println('$'+pay);
    }
    public static void BMI(String weight, String height){
        String westr = weight.substring(0, weight.indexOf(' '));
        String hestr = height.substring(0, height.indexOf(' '));
        double we = Double.parseDouble(westr);
        double he = Double.parseDouble(hestr);
        if (weight.contains("pounds"))
            we = we/2.205;
        if (height.contains("inches"))
            he = he/39.37;
        double mass = we/Math.pow(he,2);
        Double massfin = BigDecimal.valueOf(mass).setScale(1, RoundingMode.HALF_UP).doubleValue();
        if (mass < 18.5)
            System.out.println("Данный вес = "+massfin+" является недостаточным");
        else if (mass >= 25)
            System.out.println("Данный вес = "+massfin+" является избыточным");
        else
            System.out.println("Данный вес = "+massfin+" является нормальным");
    }
    public static void burger(int a){
        int i = 1;
        String str = String.valueOf(a);
        if (str.contains("0"))
            i = 1;
        else if (a >= 1 && a < 10)
            i = 0;
        else {
            while (a != 0) {
                i++;
                a = a / 10;
            }
        }
        System.out.println(i);
    }
    public static void starlight (String str){
        StringBuilder sb = new StringBuilder();
        char last = ' ';
        for (int i  = 0; i<str.length(); i++){
            char c = str.charAt(i);
            if (c != last){
                int count = 1;
                for (int j = 1; j<str.length(); j++){
                    if (str.charAt(j) == c){
                        if (str.charAt(j) == str.charAt(j-1))
                            count++;
                    }
                    else if (count>1) break;
                }
                int repeats = count;
                if (repeats > 1)
                    sb.append(c).append("*").append(repeats);
                else sb.append(c);
            }
            last = c;
        }
        System.out.println(sb.toString());
    }
    public static void rhyme (String str1, String str2){
        str1 = str1.toUpperCase();
        str2 = str2.toUpperCase();
        String last1 = str1.substring(str1.lastIndexOf(" ")+1);
        String last2 = str2.substring(str2.lastIndexOf(" ")+1);
        String vow1 = "";
        String vow2 = "";
        for (int i = 0; i < last1.length(); i++)
            if ("AEIOUY".contains(last1.substring(i, i+1)))
                vow1 += last1.charAt(i);
        for (int i = 0; i < last2.length(); i++)
            if ("AEIOUY".contains(last2.substring(i, i+1)))
                vow2 += last2.charAt(i);
        if (vow1.equals(vow2))
                    System.out.println("Строки рифмуются");
                else
                    System.out.println("Строки не рифмуются");

    }
    public static void numb32 (String str1, String str2){
        boolean flag = false;
        char r =' ';
        for (int i = 0; i<str1.length(); i++) {
            r = str1.charAt(i);
            if (str1.length() - (i+1) <= 0)
                break;
            if (r == str1.charAt(i + 1) && r == str1.charAt(i + 2)) {
                flag = true;
                break;
            } else
                flag = false;
        }
            for (int i = 0; i<str2.length(); i++){
                if (str2.length()-(i+1) == 0)
                    break;
                if (str2.charAt(i) == r && str2.charAt(i+1) == r) {
                    flag = true;
                    break;
                }
                    else
                        flag = false;
            }
            if (flag)
                System.out.println("True");
        else
            System.out.println("False");
    }
    public static void uniqbook (String str, char a){
        String un = "";
        boolean cond = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == a)
                cond = !cond;
            if (cond)
                un += str.charAt(i);
        }
        String b =String.valueOf(a);
        un = un.replace(b,"");
           long f = un.chars()
                    .distinct()
                    .count();
        System.out.println(f);
    }
}
