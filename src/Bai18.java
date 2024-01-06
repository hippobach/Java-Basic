public class Bai18 {
    public static void main(String[] args) {
        // Ve chu N
        System.out.println("Ve chu N:");
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j == 1 || j == 7 || i == j) {
                    System.out.print(i + "" + j + "\t");
                } else {
                    System.out.print(" " + "\t");
                }
            }
            System.out.println("");
        }
        System.out.println("");
        // Ve hinh vuong
        System.out.println("Ve hinh vuong:");
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= 7; j++) {
                if (j == 1 || j == 7 || i == 1 || i == 7) {
                    System.out.print(i + "" + j + "\t");
                } else {
                    System.out.print(" " + "\t");
                }
            }
            System.out.println("");
        }
        System.out.println("");
        // Ve hinh tam giac
        System.out.println("Ve hinh tam giac:");
        for (int i = 1; i <= 7; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i + "" + j + "\t");
            }
            System.out.println("");
        }
    }
}
