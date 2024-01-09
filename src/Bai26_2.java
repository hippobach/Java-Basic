public class Bai26_2 {
    public static void main(String[] args) {
//        split()
        String s1 = "Hello, World";
        String[] mang = s1.split(",");
        for (int i=0; i<mang.length; i++) {
            System.out.println(mang[i]);
        }

//        toLowerCase() & toUpperCase()
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());

//        toCharArray()
        String password = "bachdeptrai2003";
        char[] mang1 = password.toCharArray();
        for (int i=0; i<mang1.length; i++) {
            System.out.print(mang1[i] + " ");
        }

//        reverse()
        StringBuilder sb = new StringBuilder("BachNguyenXuan");
        System.out.println(sb.reverse());
        String sb1 = sb.toString();
        System.out.println(sb1);
    }
}
