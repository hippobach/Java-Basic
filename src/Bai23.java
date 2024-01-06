public class Bai23 {
    public static void main(String[] args) {
//        PI number
        System.out.println("PI = "+Math.PI);
//        Absolute
        int a = -10;
        System.out.println("Absolute of a = "+Math.abs(a));
//        Min, Max
        System.out.println(Math.max(4, 90));
        System.out.println(Math.min(-13, 8));
//        Square root
        System.out.println(Math.sqrt(16));
//        Exponentiation
        System.out.println(Math.pow(2, 6));
//        sin, cos, tan
        int goc = 90;
        double sin = Math.sin(Math.PI*goc/180);
        double cos = Math.cos(Math.PI*goc/180);
        double tan = Math.tan(Math.PI*goc/180);
        System.out.println("Sin 90 = "+sin);
        System.out.println("Cos 90 = "+cos);
        System.out.println("Tan 90 = "+tan);
    }
}
