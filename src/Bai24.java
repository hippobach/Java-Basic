import java.util.Random;

public class Bai24 {
    public static void main(String[] args) {
        Random rd = new Random();
        int songuyen = rd.nextInt(-50, 51); // chay tu -50 -> nho hon 51
        System.out.println(songuyen);

        int songuyen1 = rd.nextInt(51); // chay tu 0 -> nho hon 51
        System.out.println(songuyen1);

        double x = rd.nextDouble(-100, 100);
        System.out.println(x);
    }
}
