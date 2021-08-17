public class ThucHanh06 {

    public static String printUppercase(String str) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isUpperCase(str.charAt(i))) {
                s += str.charAt(i);
            }

        }
        return s;
    }

    public static String printLetter(String str) {
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                continue;
            } else
                s += str.charAt(i);

        }
        return s;
    }

    public static int countChar(String str, char c) {
        int count = 0;
        for (int i = 0; i < str.length(); i++)
            if (str.charAt(i) == c) {
                count++;
            }
        return count;
    }

    public static int countWords(String str) {
        int count = 0;
        String[] s = str.split(" +");
        return s.length;
    }

    public static void countConsonantVowel(String str) {
        int countVowel = 0;
        int countConsonant = 0;
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (Character.isDigit(str.charAt(i))) {
                continue;
            } else if (c == 'a' || c == 'o' || c == 'e' || c == 'u' || c == 'i' || c == 'A' || c == 'O' || c == 'E' || c == 'U' || c == 'I') {
                countVowel++;
            } else if ((c > 'a' && c <= 'z') || (c > 'A' && c <= 'Z')) {
                countConsonant++;
            }
        }
        System.out.println("Số lượng ký tự nguyên âm là: " + countVowel);
        System.out.println("Số lượng ký tự phụ âm là: " + countConsonant);
    }
}