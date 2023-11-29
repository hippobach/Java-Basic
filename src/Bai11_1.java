import java.util.Scanner;

public class Bai11_1 {
    public static void main(String[] args) {
//        Tinh toan chi so BMI
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi nhap vao chieu cao (m): ");
        double chieuCao = sc.nextDouble();
        System.out.println("Moi nhap vao can nang (kg): ");
        double canNang = sc.nextDouble();

        double bmi = canNang / (Math.pow(chieuCao, 2));

        if (bmi < 15)
            System.out.println("Than hinh qua gay");
        else if (bmi >= 15 && bmi < 16)
            System.out.println("Than hinh gay");
        else if (bmi >= 16 && bmi < 18.5)
            System.out.println("Than hinh hoi gay");
        else if (bmi >= 18.5 && bmi < 25)
            System.out.println("Than hinh binh thuong");
        else if (bmi >= 25 && bmi < 30)
            System.out.println("Than hinh hoi beo");
        else if (bmi >= 30 && bmi < 35)
            System.out.println("Than hinh beo");
        else
            System.out.println("Than hinh qua beo");
    }
}
