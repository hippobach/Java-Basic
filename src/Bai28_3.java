import java.util.ArrayList;
import java.util.Scanner;

public class Bai28_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào số phần tử của list: ");
        int n = sc.nextInt();
//        người dùng nhập từng phần tử của list
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<n; i++) {
            System.out.println("Mời nhập vào phần tử thứ "+(i+1));
            int soNhap = sc.nextInt();
            list.add(soNhap);
        }
//        in ra danh sách
        System.out.println(list);
//        tạo ra list mới bằng bình phương các phần tử
        ArrayList<Integer> binhPhuong = new ArrayList<>();
        for (int x : list) {
            binhPhuong.add(x*x);
        }
        System.out.println("Các phần tử của list sau khi bình phương là: "+binhPhuong);

//        xác định số phần tử lớn hơn 50
        int count = 0;
        for (int x : binhPhuong) {
            if (x > 50) {
                count++;
            }
        }
        System.out.println("Số lượng phần tử lớn hơn 50: "+count);
    }
}
