import java.util.Scanner;

public class Bai21_1 {
//    Giai phuong trinh bac 2
    public static void main(String[] args) {
        System.out.println("CUng giai phuong trinh bac 2 don gian nao:");
        Scanner sc = new Scanner(System.in);
        double a, b, c;
        a = sc.nextDouble();
        b = sc.nextDouble();
        c = sc.nextDouble();
        String res = PhuongTrinhBac2(a, b, c);
        System.out.println("Ket qua giai phuong trinh: "+res);
    }

    public static String PhuongTrinhBac2(double a, double b, double c) {
        if (a==0) {
            if (b==0 && c==0) {
                return "Phuong trinh bac nhat vo so nghiem";
            } else if (b==0 && c!=0) {
                return "Phuong trinh vo nghiem";
            } else {
                return "Phuong trinh bac nhat co nghiem: "+(-c/b);
            }
        } else {
            double denta = (b*b)-4*a*c;
            if (denta < 0) {
                return "Phuong trinh bac 2 vo nghiem";
            } else if (denta == 0) {
                double x = -b/(2*a);
                return "Phuong trinh bac 2 co nghiem kep: "+x;
            } else {
                double x = (-b + Math.sqrt(denta))/ (2*a);
                double y = (-b - Math.sqrt(denta))/ (2*a);
                return "Phuong trinh bac 2 co 2 nghiem phan biet: x = "+x+ ", y = "+y;
            }
        }
    }
}
