import java.util.Scanner;

public class Main_16082021 {
    public static void main(String[] args) {

        //Bài 1: In ra cac ký tự viết hoa
        System.out.println("Bài 1");
        String s1 = inputString();
        System.out.println("Chuỗi có các chữ hoa: " + ThucHanh06.printUppercase(s1));

        //Bài 2: In ra các ký tự không phải số
        System.out.println("Bài 2");
        String s2 = inputString();
        System.out.println("Chuỗi có các chữ: " + ThucHanh06.printLetter(s2));

        //Bài 3: Kiểm tra ký tự c trong chuỗi s
        System.out.println("Bài 3");
        String s3 = inputString();
        char c = inputChar();
        int count = ThucHanh06.countChar(s3, c);
        if (count > 0) {
            System.out.format("Có %d ký tự %s trong chuỗi\n", count, c);
        } else System.out.format("Không có ký tự %s nào trong chuỗi\n", c);

        //Bài 4: Đếm số lượng các từ trong chuỗi
        System.out.println("Bài 4");
        String s4 = inputString();
        System.out.println("Số lượng các từ trong chuỗi: " + ThucHanh06.countWords(s4));

        //Bài 7: Đếm số lượng ký tự nguyên âm và phụ âm
        System.out.println("Bài 7");
        String s7 = inputString();
        ThucHanh06.countConsonantVowel(s7);

    }
    public static String inputString() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập chuỗi: ");
        String s = sc.nextLine();
        return s;
    }
    public static char inputChar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào ký tự cần kiểm ra trong chuỗi: ");
        char c = sc.next().charAt(0);
        return c;
    }
}