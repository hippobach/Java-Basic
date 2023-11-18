import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
//        Khoi tao doi tuong scanner
        Scanner sc = new Scanner(System.in);

//        nhap vao mot chuoi
        System.out.println("Moi nhap vao mat khau: ");
        String password = sc.nextLine();
        System.out.println(password);
//        nhap vao so nguyen
        System.out.println("Moi nhap vao mot so nguyen a: ");
        int a = sc.nextInt();
        System.out.println(a);

        System.out.println("Moi ban nhap ten: ");
        String ten = new Scanner(System.in).nextLine();
        System.out.println(ten);
    }
}
