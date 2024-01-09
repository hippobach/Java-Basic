import java.util.Scanner;

public class Bai26_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Moi ban nhap vao chuoi:");
        String s = sc.nextLine();

//        Dem so chu in hoa
//        Dem so cac chu so
//        Dem co bao nhieu khoang space
        int demSo = 0;
        int demInThuong = 0;
        int demInHoa = 0;
        int demSpace = 0;

        for (int i=0; i<s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLowerCase(c)) {
                demInThuong++;
            } else if (Character.isUpperCase(c)) {
                demInHoa++;
            } else if (Character.isDigit(c)) {
                demSo++;
            } else if(Character.isWhitespace(c)) {
                demSpace++;
            }
        }
        System.out.println("So cac chu so: "+demSo);
        System.out.println("So cac chu in thuong: "+demInThuong);
        System.out.println("So cac chu in hoa: "+demInHoa);
        System.out.println("So cac khoang trang: "+demSpace);
    }
}
