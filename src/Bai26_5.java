import java.util.Scanner;

public class Bai26_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String password = "";
//      1.  Mời thiết lập mật khẩu và kiểm tra tính hợp lệ
        while(true) {
//            Nhập mật khẩu từ người dùng
            System.out.println("Mời thiết lập mật khẩu");
            System.out.println("Mật khẩu ít nhất có 6 ký tự, 1 chữ cái và 1 số");
            String newPassword = sc.nextLine();
//            Kiểm tra tính hợp lệ của mật khẩu
            if (checkMK(newPassword)) {
                password = newPassword;
                System.out.println("Mật khẩu mới đã được thiết lập");
                break;
            } else {
                System.out.println("Mật khẩu không hợp lệ - Xin vui lòng nhập lại");
            }
        }
//      2. Cho người dùng nhập mật khẩu để login
//        Số lần người dùng nhập sai
        int count = 0;
        String login = "";
        while (true) {
            System.out.println("Mời nhập mật khẩu để đăng nhập");
            login = sc.nextLine();
//            Kiểm tra mật khẩu có khớp không
            if (login.equals(password)) {
                System.out.println("Đăng nhập thành công");
                break;
            } else {
                System.out.println("Bạn đã nhập sai mật khẩu - Xin vui lòng nhập lại");
                count++;
            }
            if (count == 5) {
                break;
            }
        }
    }
//        Hàm kiểm tra tính hợp lệ của mật khẩu
    public static boolean checkMK(String password) {
//            Kiểm tra độ dài
        if (password.length() < 6) {
            return false;
        }
//        Kiểm tra mật khẩu có ít nhất một chữ cái hay không?
        boolean hasLetter = false;
        for (char c : password.toCharArray()) {
            if (Character.isLetter(c)) {
                hasLetter = true;
                break;
            }
        }
        if (!hasLetter) {
            return false;
        }
//        Kiểm tra mật khẩu có chứa ít nhất một chữ số hay không?
        boolean hasNumber = false;
        for (char c : password.toCharArray()) {
            if (Character.isDigit(c)) {
                hasNumber = true;
                break;
            }
        }
        if(!hasNumber) {
            return false;
        }
//        Nếu mật khẩu đủ độ dài, có chứa ít nhất 1 chữ cái và một chữ số thì trả về true
        return true;
    }
}
