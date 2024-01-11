import java.util.Arrays;

public class Bai27 {
    public static void main(String[] args) {
//        Khai báo mảng
        String[] mangStr;
        Float[] mangFl;
        Double[] mangDb;

//        Khai báo kèm theo kích thước mảng
        String[] mangStr2 = new String[10];  // chứa tối đa 12 phần tử
        int[] mangNguyen2 = new int[5];

//        Khởi tạo mảng kèm theo giá trị ban đầu
        String[] mangStr3 = new String[] {"chí phèo", "thị nở", "bá kiến", "ông giáo"};
        int[] mangNguyen3 = new int[] {1, 2, 3, 4, 5};

//        Truy xuất phần tử của mảng dựa theo index
        System.out.println(mangNguyen3[2]);
        System.out.println(mangStr3[3]);

//        Trả về chiều dài của mảng
        System.out.println("Chiều dài của mảng nguyên 3 là: "+mangNguyen3.length);

//        Duyệt mảng dùng for loop
//        Cách 1: duyệt từng phần tử
        for (int pt : mangNguyen3) {
            if(pt%2==0) {
                System.out.print(pt + " ");
            }
        }
        System.out.println();
        for (String s : mangStr3) {
            System.out.print(s + " ");
        }
//        Cách 2: duyệt theo index
        for (int i=0; i<mangNguyen3.length; i++) {
            System.out.println(mangNguyen3[i]);
        }

//        Sắp xếp các phần tử của mảng tăng dần
        int[] mang = {8,9,12,3,2,1,48};
        Arrays.sort(mang);
        System.out.println("Mảng sau khi sắp xếp tăng dần: ");
        System.out.println(Arrays.toString(mang));

        int[] mang9 = {8,9,12,3,2,1,48};
        for (int i=0, j=mang9.length-1; i<j; i++, j--) {
            int temp = mang9[i];
            mang9[i] = mang9[j];
            mang9[j] = temp;
        }
        System.out.println("Mang sau khi đảo ngược là: "+Arrays.toString(mang9));
    }
}
