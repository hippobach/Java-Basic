public class Bai17 {
    public static void main(String[] args) {
        int tong = 0;
        for (int i=0; i<=5; i++) {
            if(i==3) {
                continue;
            } else {
                tong += i;
            }
        }
        System.out.println("Tong = "+tong);

        int n = 0;
        while (n<100) {
            System.out.println("n = "+n);
            if(n==10) {
                break;
            }
            n++;
        }
    }
}
