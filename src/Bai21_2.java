import java.util.Scanner;

public class Bai21_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap tham so a:");
        double a = sc.nextDouble();
        System.out.println("Moi ban nhap tham so b:");
        double b = sc.nextDouble();

        Scanner str = new Scanner(System.in);
        System.out.println("Moi chon phep tinh: + - * /");
        String phepTinh = str.nextLine();
        switch (phepTinh) {
            case "+":
                Plus(a,b);
                break;
            case "-":
                Minus(a,b);
                break;
            case "*":
                Multiply(a,b);
                break;
            case "/":
                Divide(a,b);
                break;
            default:
                System.out.println("Phim bam khong hop le");
                break;
        }

    }

//  Plus function
    public static void Plus(double a, double b) {
        System.out.println(a+b);
    }
//  Minus Function
    public static void Minus(double a, double b) {
        System.out.println(a-b);
    }
//  Multiply Function
    public static void Multiply(double a, double b) {
        System.out.println(a*b);
    }
//  Divide Function
    public static void Divide(double a, double b) {
        if (b==0) {
            System.out.println("Phep toan khong hop le");
        } else {
            System.out.println(a/b);
        }
    }
}
