public class Bai21 {
    public static void main(String[] args) {
        int res = Cong(3,4,5);
        System.out.println("Tong cua cac so la: "+res);

        XinChao("Male");
    }
    public static int Cong(int x, int y, int z) {
        return x+y+z;
    }

    public static void XinChao(String sex) {
        if (sex.equals("Female")) {
            System.out.println("Toi la mot nhan vien nu");
        } else if (sex.equals("Male")) {
            System.out.println("Toi la mot nhan vien nam");
        }
    }
}
