import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao diem trung binh");
        double dtb = sc.nextDouble();

//        Check condition
        if(dtb >= 8 && dtb < 10)
            System.out.println("Ban duoc xep loai gioi");
        else if (dtb >= 7 && dtb < 8)
            System.out.println("Ban duoc xep loai kha");
        else System.out.println("Ban duoc xep loai trung binh");
    }
}
