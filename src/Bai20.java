public class Bai20 {
    public static void main(String[] args) {
        int a = 10;
        int b = 0;

        try {
            int c = a/b;
            System.out.println("c = "+c);
        }
        catch (ArithmeticException aex) {
            System.out.println("Co loi ve toan hoc");
            aex.printStackTrace();
        }
        catch (Exception ex) {
            System.out.println("Co loi");
            ex.printStackTrace();
        }
        finally {
            System.out.println("Co loi hay khong loi deu phai thuc hien");
        }
        System.out.println("Doan code phia sau ");
    }
}
