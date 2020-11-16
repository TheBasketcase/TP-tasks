package Pack;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.util.ArrayList;

public class Fifth {
    public static void encrypt (String str){
        int charCode = (int) str.charAt(0);
        int[] res = new int[str.length()];
        res[0] = charCode;
        for (int i = 1; i < str.length(); i++)
        {
            res[i] = (int)str.charAt(i) - charCode;
            charCode = (int)str.charAt(i);
        }
        System.out.print("[\"");
        for (int i = 0; i < res.length-1; i++) {
            System.out.print(res[i]+ "\", \"");
        }

        System.out.print(res[res.length-1] + "]" + "\n");
    }
    public static void decrypt(int[] arr)
    {
        int charCode = arr[0];
        String res = Character.toString((char)charCode);
        for (int i = 1; i < arr.length; i++)
        {
            res += (char)(charCode + arr[i]);
            charCode += arr[i];
        }
        System.out.println(res);
    }
    public static boolean canMove(String piece, String start, String fin)
    {
        int boardStart = "ABCDEFGH".indexOf(start.charAt(0));
        int boardFin = "ABCDEFGH".indexOf(fin.charAt(0));
        int rankStart = (int)start.charAt(1) - (int)'0';
        int rankFin = (int)fin.charAt(1) - (int)'0';

        switch (piece)
        {
            case "Rook":
                return (boardStart == boardFin) || (rankStart == rankFin);
            case "Bishop":
                return Math.abs(boardFin - boardStart) == Math.abs(rankStart - rankFin);
            case "Queen":
                return (boardStart == boardFin) || (rankStart == rankFin)
                        || Math.abs(boardFin - boardStart) == Math.abs(rankStart - rankFin);
            case "Pawn":
                return Math.abs(rankFin - rankStart) == 1;
            case "Knight":
                return (Math.abs(rankFin - rankStart) == 2) && (Math.abs(boardFin - boardStart) == 1)
                        || (Math.abs(rankFin - rankStart) == 1) && (Math.abs(boardFin - boardStart) == 2);
            case "King":
                return Math.abs(rankFin - rankStart) == 1 || Math.abs(boardFin - boardStart) == 1;
            default:
                return false;
        }
    }
    public static boolean canComplete(String part, String whole)
    {
        int partIndex = 0;
        int wholeIndex = 0;
        while (partIndex < part.length() && wholeIndex < whole.length())
        {
            if (part.charAt(partIndex) == whole.charAt(wholeIndex))
            {
                partIndex++;
                wholeIndex++;
            }
            else
            {
                wholeIndex++;
            }
        }
        return wholeIndex < whole.length() || partIndex == part.length();
    }
    public static void sumdigProd(int ... args){
        int sum = 0;
        for (int x : args)
            sum += x;

        while (sum > 10)
        {
            int temp = sum;
            int product = 1;
            while (temp > 0)
            {
                product *= (temp % 10);
                temp /= 10;
            }
            sum = product;
        }
        System.out.println(sum);
    }
    public static boolean sameChars(String a, String b)
    {
        for (int i = 0; i < a.length(); i++)
            if (!b.contains(a.substring(i, i+1)))
                return false;
        for (int i = 0; i <b.length(); i++)
            if (!a.contains(b.substring(i, i+1)))
                return false;
        return true;
    }

    public static void sameVowelGroup(String[] strs)
    {
        String vowels = "";
        for (int i = 0; i < strs[0].length(); i++)
        {
            String letter = strs[0].substring(i, i+1).toUpperCase();
            if ("AOUIEY".contains(letter)
                    && !vowels.contains(letter))
                vowels += letter;
        }
        ArrayList<String> res = new ArrayList<String>();
        for (String word : strs)
        {
            String vowelsHere = "";
            for (int i = 0; i < word.length(); i++)
            {
                String letter = word.substring(i, i+1).toUpperCase();
                if ("AOUIEY".contains(letter))
                    vowelsHere += letter;
            }
            if (sameChars(vowels, vowelsHere))
                res.add(word);
        }
        String arr[] = res.toArray(new String[0]);
        System.out.print("[ ");
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.print("]" + "\n");
    }
    public static boolean validateCard(long n)
    {
        String s = Long.toString(n);
        if (s.length() < 14 || s.length() > 19) return false;
        int check = Integer.parseInt(s.substring(s.length() - 1));
        int sum = 0;
        for (int i = 0; i < s.length() - 1; i++)
        {
            int num = Integer.parseInt(s.substring(s.length() - i - 2, s.length() - i - 1));
            if (i % 2 == 0)
            {
                int doubled = num * 2;
                if (doubled > 9)
                    num = (doubled / 10) + (doubled % 10);
                else
                    num = doubled;
            }
            sum += num;
        }
        int res = 10 - (sum % 10);
        return res == check;
    }
    public static String numToEng(int n)
    {
        if (n == 0) return "zero";

        int[] digits = {n / 100, (n % 100) / 10, n % 10};
        String[] singleDigitNums = {"zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"};
        String[] tens = {"zero", "ten", "twenty", "thirty", "fourty", "fifty", "sixty",
                "seventy", "eighty", "ninety"};
        String[] teens = {"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen",
                "sixteen", "seventeen", "eighteen", "nineteen"};

        String result = "";
        if (digits[0] > 0)
        {
            result += singleDigitNums[digits[0]] + " hundred";
        }

        if (digits[1] == 1)
        {
            if (result.length() > 0) result += " ";
            result += teens[digits[2]];
            return result;
        }
        else if (digits[1] > 1)
        {
            if (result.length() > 0) result += " ";
            result += tens[digits[1]];
        }

        if (digits[2] > 0)
        {
            if (result.length() > 0) result += " ";
            result += singleDigitNums[digits[2]];
        }

        return result;
    }

    public static String numToRus(int n)
    {
        if (n == 0) return "ноль";

        int[] digits = {n / 100, (n % 100) / 10, n % 10};
        String[] singleDigitNums = {"ноль", "один", "два", "три", "четыре",
                "пять", "шесть", "семь", "восемь", "девять"};
        String[] hundreds = {"ноль", "сто", "двести", "триста", "четыреста",
                "пятьсот", "шестьсот", "семьсот", "восемьсот", "девятьсот"};
        String[] tens = {"ноль", "десять", "двадцать", "тридцать", "сорок", "пятьдесят", "шестьдесят",
                "семьдесят", "восемьдесят", "девяносто"};
        String[] teens = {"десять", "одиннадцать", "двенадцать", "тринадцать", "четырнадцать", "пятнадцать",
                "шестнадцать", "семьнадцать", "восемьнадцать", "девятнадцать"};

        String result = "";
        if (digits[0] > 0)
        {
            result += hundreds[digits[0]];
        }

        if (digits[1] == 1)
        {
            if (result.length() > 0) result += " ";
            result += teens[digits[2]];
            return result;
        }
        else if (digits[1] > 1)
        {
            if (result.length() > 0) result += " ";
            result += tens[digits[1]];
        }

        if (digits[2] > 0)
        {
            if (result.length() > 0) result += " ";
            result += singleDigitNums[digits[2]];
        }

        return result;
    }
    public static String getSha256Hash(String s) {
        byte[] bytes = null;
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            bytes = md.digest(s.getBytes(StandardCharsets.UTF_8));
        } catch (Exception e) {
        }
        ;
        BigInteger number = new BigInteger(1, bytes);
        StringBuilder result = new StringBuilder(number.toString(16));
        while (result.length() < 32) {
            result.insert(0, '0');
        }
        return result.toString();
    }
    public static String correctTitle(String s)
    {
        s = s.toLowerCase();
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++)
        {
            if (!(words[i].contentEquals("and") || words[i].contentEquals("of")
                    || words[i].contentEquals("the") || words[i].contentEquals("in")))
            {
                String newWord = words[i].substring(0, 1).toUpperCase() + words[i].substring(1);
                words[i] = newWord;
            }
        }
        return String.join(" ", words);
    }
    public static String hexLattice(int n)
    {
        int size = 1;
        while(true)
        {
            if (3 * size * (size - 1) + 1 == n) break;
            if (3 * size * (size - 1) + 1 > n) return "Invalid";
            size++;
        }
        int lines = size * 2 - 1;
        String result = "";
        for (int line = 0; line < lines / 2; line++)
        {
            String newLine = "";
            for (int i = 0; i < size - line; i++)
                newLine += " ";
            for (int cell = 0; cell < size + line; cell++)
                newLine += "o ";
            for (int i = 0; i < size - line -1; i++)
                newLine += " ";
            newLine += "\n";
            result += newLine;
        }
        for (int line = lines / 2; line < lines; line++)
        {
            String newLine = "";
            for (int i = 0; i < size - (lines - line) + 1; i++)
                newLine += " ";
            for (int cell = 0; cell < size + (lines - line) - 1; cell++)
                newLine += "o ";
            for (int i = 0; i < size - (lines - line); i++)
                newLine += " ";
            newLine += "\n";
            result += newLine;
        }
        return result;

    }
}
