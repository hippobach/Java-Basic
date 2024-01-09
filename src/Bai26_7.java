public class Bai26_7 {
    public static void main(String[] args) {
        String a = "tôi chăm học tôi chịu khó tôi đẹp trai";
//        Tách chuôi a thành các từ riêng biệt
        String[] words = a.split(" ");
//        Khởi tạo biến đếm
        int count = 0;

        for (String tu : words) {
            if (tu.equals("tôi")) {
                count++;
            }
        }
        System.out.println("So lan xuat hien cua tu \"toi\" trong a la "+count);
    }
}
