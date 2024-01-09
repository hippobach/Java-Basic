import java.util.Scanner;

public class Bai26_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập chuỗi: ");
        String input = sc.nextLine();

//        Tách chuỗi thành 2 chuỗi: chuỗi ký tự và chuỗi số
        StringBuilder chuoi = new StringBuilder();
        StringBuilder so = new StringBuilder();

        for (int i=0; i<input.length(); i++) {
            char c = input.charAt(i);
            if (Character.isDigit(c)) {
                so.append(c);
            } else if (Character.isLetter(c)) {
                chuoi.append(c);
            }
        }
        System.out.println("Chuỗi ký tự: "+chuoi);
        System.out.println("Chuỗi số: "+so);
    }
}
