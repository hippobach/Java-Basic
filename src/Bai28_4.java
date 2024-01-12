import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Bai28_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        khai báo list
        ArrayList<String> quest = new ArrayList<>(List.of(
                "2+5+7=",
                "5*10=",
                "sqrt(16)=",
                "12%2="
        ));

        ArrayList<Float> traloi = new ArrayList<>(List.of(14f, 50f, 4f, 0f));
//        duyệt list câu hỏi
        for (int i=0; i<quest.size(); i++) {
            System.out.println(quest.get(i));
//            nhập kết quả
            Float kq = sc.nextFloat();
//            kiểm tra với đáp án
            if (kq.equals(traloi.get(i))) {
                System.out.println("Đúng");
            } else {
                System.out.println("Sai");
            }
        }
    }
}
