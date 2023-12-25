import java.util.Scanner;

public class Bai14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao so nguyen tu 1 -> 99: ");
        int n = sc.nextInt();
        while (n < 1 || n > 99) {
            System.out.println("Moi ban nhap lai n: (1 <= n <= 99 )");
            n = sc.nextInt();
        }
        System.out.println("Ban da nhap xong n = "+ n);
    }
}
