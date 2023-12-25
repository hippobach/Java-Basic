import java.util.Scanner;

public class Bai12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap vao mot so: ");
        int n = sc.nextInt();
        String traloi = (n % 2 == 0) ? "Chan" : "Le";
        System.out.println(traloi);
    }
}
