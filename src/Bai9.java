public class Bai9 {
    public static void main(String[] args) {
//        int i = 7;
//        int j = 15;
//        System.out.println(i>0 && j < 10);
//        && (AND)   || (OR)

//        prefix - postfix
        int x = 100;
        int y = 90;
        int z = 80;
        int t = 70;

        x++; // x=x+1
        ++y; //y=y+1
        z--;
        --t;
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(t);

        int a = 1;
        int b = 2;
        int c = a++ - ++b + 1;
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
