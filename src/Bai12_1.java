import java.util.Scanner;

public class Bai12_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao diem trung binh: ");
        double dtb = sc.nextDouble();
        // xu ly lenh de tinh toan
        String traloi = (dtb >= 8) ? "Gioi" :
                ((dtb < 8 && dtb >= 6.5) ? "Kha" :
                ((dtb < 6.5 && dtb >= 5) ? "Trung binh" : "Yeu"));
        System.out.println(traloi);
    }
}
