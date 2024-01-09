import java.util.Scanner;

public class Bai26_6 {
    public static void main(String[] args) {
        String a = "abcdefghijklmnopqrstuvwxyz";
        String b = "zxcvbnmasdfghjklqwertyuiop";
//        Nhập tin nhắn cần mã hóa từ bàn phím
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời nhập vào tin nhắn cần mã hóa:");
        String input = sc.nextLine();
        String output = "";

        for (int i=0; i<input.length(); i++) {
            char c = input.charAt(i);
//            Tìm vị trí của ký tự trong biến a
            int index = a.indexOf(c);
//            Nếu ký tự này không có trong biến a thì không cần mã hóa và thêm vào string output
            //                Nếu có ký tự trong biến a thì lấy ra ký tự từ biến b tại vị trí tương ứng và thêm nó vào output
            if (index == -1) {
                output += c;
            } else output += b.charAt(index);
        }
//        In ra tin nhắn sau mã hóa
        System.out.println("Tin nhắn sau khi mã hóa: "+output);
    }
}
