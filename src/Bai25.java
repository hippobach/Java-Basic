import java.util.Scanner;

public class Bai25 {
    public static void main(String[] args) {
        char ch = 'a';
        char ch2 = 66;
        System.out.println(ch);
        System.out.println(ch2);
        char ch3;

        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao mot ky tu:");
        String s = sc.nextLine();
        char ch4 = s.charAt(0);
        System.out.println("Ky tu vua nhap vao: "+ch4);

//        So sanh thu tu cac ky tu trong bang ma ASCII
        System.out.println(Character.compare('a', 'b'));
//        Cac methods khac
        char ch5 = 'n';
        char ch6 = '3';
        char ch7 = 'K';
        char ch8 = ' ';

        System.out.println(Character.isDigit(ch5)); // false
        System.out.println(Character.isLetter(ch6)); // false
        System.out.println(Character.isLowerCase(ch7)); // false
        System.out.println(Character.isWhitespace(ch8)); // true
    }
}
