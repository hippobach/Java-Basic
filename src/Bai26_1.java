public class Bai26_1 {
    public static void main(String[] args) {
        StringBuilder chuoi = new StringBuilder("Toi di tim toi");
//        indexOf() tra ve vi tri dau tien cua ky tu hoac chuoi
        System.out.println(chuoi.indexOf("i"));
//        lastIndexOf() tra ve vi tri cuoi cung cua ky tu hoac chuoi
        System.out.println(chuoi.lastIndexOf("o"));
//        contains kiem tra chuoi con
        String msg = "Xin chao, toi la Xuan Bach, den tu Nam Dinh";
        System.out.println(msg.contains("Nam Dinh"));
        System.out.println(msg.contains("Ha Nam"));
//        substring lay mot chuoi con tu mot chuoi dai hon
        String msg1 = msg.substring(2, 9);
        System.out.println(msg1);

        String str = "  hoc hoc nua hoc mai  ";
        System.out.println(str);
//        replace()
        String str1 = str.replace("hoc", "ngu");
        System.out.println(str1);
//        replaceFirst()
        String str2 = str.replaceFirst("hoc", "choi");
        System.out.println(str2);
//        trim() xoa toan bo khoang trang o dau va cuoi
        String str3 = str.trim();
        System.out.println(str3);
//        Xoa toan bo khoang trang o cuoi chuoi
        String str4 = str.replaceAll("\\s+$", "");
        System.out.println(str4);
//        Xoa toan bo khoang trang o dau chuoi
        String str5 = str.replaceFirst("^\\s+", "");
        System.out.println(str5);
    }
}
