import java.util.Arrays;
import java.util.Scanner;

public class Bai27_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào số phần tử tối đa của mảng");
        int n = sc.nextInt();
//        tạo mảng có n phần tử
        int[] M = new int[n];
//        nhập dữ liệu cho từng phần tử
        int len = M.length;
        for (int i=0; i<len; i++) {
            System.out.print("M["+i+ "] = ");
            M[i] = sc.nextInt();
        }
        System.out.println();
//        xuất các phần tử của mảng
//        for (int i=0; i<len; i++) {
//            System.out.print(M[i] + " ");
//        }
        System.out.println("Mảng M có các phần tử: "+ Arrays.toString(M));

//        clone mảng từ mảng khác
        int[] mang1 = {1, 10, 5, 7, 12};
        int[] mang2 = mang1.clone();
        mang2[0] = 101;
        System.out.println("Mảng 1: "+Arrays.toString(mang1));
        System.out.println("Mảng 2: "+Arrays.toString(mang2));
    }
}
