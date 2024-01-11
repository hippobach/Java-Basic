import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Bai27_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.println("Mời nhập vào số phần tử của mảng: ");
        int n = sc.nextInt();
//        tạo mảng
        int[] M = new int[n];
        int len = M.length;
//        tạo các phần tử ngẫu nhiên cho mảng
        for (int i=0; i<len; i++) {
            int ngauNhien = rd.nextInt(8);
            M[i] = ngauNhien;
        }
        System.out.println("Mảng ban đầu khởi tạo là: " +Arrays.toString(M));
//        đảo ngược mảng và xuất ra màn hình
        for (int i=0, j=len-1; i<j; i++, j--) {
            int temp = M[i];
            M[i] = M[j];
            M[j] = temp;
        }
        System.out.println("Mảng sau khi đảo ngược là: " +Arrays.toString(M));
//        sắp xếp mảng theo thứ tự tăng dần
        Arrays.sort(M);
        System.out.println("Mảng sau khi sắp xếp tăng dần: "+Arrays.toString(M));
//        tính tổng các phần tử trong mảng
        int sum = 0;
        for (int element : M) {
            sum+=element;
        }
        System.out.println("Tổng các phần tử của mảng là: "+sum);
//        nhập 1 số bất kỳ và kiểm tra số đó có tồn tại trong mảng hay không. Nếu có xuất index
        System.out.println("Mời nhập vào một số bất kỳ: ");
        int so = sc.nextInt();
        boolean ktra = false;
        String vitri = "";
        for (int i=0; i<len; i++) {
            if (M[i] == so) {
                ktra = true;
                vitri += (i + " ");
            }
        }
        if (ktra) {
            System.out.println(so + " có tồn tại trong mảng với vị trí là: "+vitri);
        } else {
            System.out.println(so + " không tồn tại trong mảng");
        }
    }
}
