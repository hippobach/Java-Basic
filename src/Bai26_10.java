import java.util.Scanner;

public class Bai26_10 {
    public static void main(String[] args) {
//        chuỗi Panlydrome
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào một chuỗi: ");
        String str = sc.nextLine();

        String chuoiDao = new StringBuilder(str).reverse().toString();
        if (str.equalsIgnoreCase(chuoiDao)) {
            System.out.println("Đây là chuỗi Panlyndrome");
        } else {
            System.out.println("Đây không phải là chuỗi Polyndrome");
        }
    }
}
