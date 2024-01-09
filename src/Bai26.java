public class Bai26 {
    public static void main(String[] args) {
        String s = "Hoi do toi che mom em rong"+
                "\nKhong tin hai dua chap mom do";
        System.out.println(s);
        System.out.println("");
        System.out.println("");

        StringBuilder chuoi = new StringBuilder();
//        Cac phuong thuc cua StringBuilder
//        Append()
        chuoi.append("Xin chao, ");
        chuoi.append("minh moi hoc lap trinh");
        System.out.println(chuoi);
//        Insert(begin, end) chen tu vi tri begin den vi tri end-1
        chuoi.insert(8, " Hippo");
        System.out.println(chuoi);
//        Delete(start, end)
        chuoi.delete(8, 11);
        System.out.println(chuoi);
//        Length()
        System.out.println(chuoi.length());
    }
}
