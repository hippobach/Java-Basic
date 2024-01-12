import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Bai28_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập vào số lượng phần tử: ");
        int n = sc.nextInt();
        Random rd = new Random();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i=0; i<n; i++) {
            int ngauNhien = rd.nextInt(1, 100);
            list.add(ngauNhien);
        }
        System.out.println(list);
    }
}
