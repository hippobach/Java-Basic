import java.util.Scanner;

public class Bai17_1 {
    public static void main(String[] args) {
//        Nhap n => in ra n!
//        for & while
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao so nguyen n:");
        int n = sc.nextInt();
        int gt = 1;
//        for (int i=1; i<=n; i++) {
//            gt*=i;
//        }
//        System.out.println("Giai thua cua "+n+" la: "+gt);
        int i = 1;
        while (i<=n) {
            gt*=i;
            i++;
        }
        System.out.println("Giai thua cua "+n+" la: "+gt);
    }
}
