import java.util.HashMap;
import java.util.Scanner;

public class Bai29_1 {
    public static void main(String[] args) {
        HashMap<String, String> users = new HashMap<>();
        users.put("user1", "123456");
        users.put("user2", "124321");
        users.put("user3", "858456");
        users.put("user4", "424616");
        users.put("user5", "427216");
        users.put("user6", "424376");

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập user name: ");
        String userName = sc.nextLine();
        System.out.println("Nhập password");
        String password = sc.nextLine();

        if (!users.containsKey(userName)) {
            System.out.println("User không tồn tại");
        } else if (!users.get(userName).equals(password)) {
            System.out.println("Sai mật khẩu");
        } else {
            System.out.println("Bạn đã đăng nhập thành công");
        }
    }
}
