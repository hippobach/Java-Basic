import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bai28 {
    public static void main(String[] args) {
//        Khai báo
        ArrayList<Integer> lst = new ArrayList<>();
//        Khai báo với sô lượng phần tử ban đầu
        ArrayList<Integer> lst2 = new ArrayList<>(5);
//        Khởi tạo list với các phần tử ban đầu
        ArrayList<Integer> lst3 = new ArrayList<>(List.of(1,2,3,4,5,6));
//        Xuất ra list
        System.out.println(lst);
        System.out.println(lst2);
        System.out.println(lst3);
//        Các phương thức của ArrayList
//        add: thêm phần tử
        ArrayList<Integer> lst4 = new ArrayList<>();
        lst4.add(7);
        lst4.add(8);
        lst4.add(10);
        lst4.add(1, 12);
        System.out.println("lst4 có các phần tử là: "+lst4);
//        size: trả về số phần tử của lst4
        System.out.println("Số phần tử của lst4 là: "+lst4.size());
//        get(int index): trả về giá trị list tại vị trí index
        System.out.println(lst4.get(3));
//        remove(index): xóa phần tử tại vị trí index
        lst4.remove(2);
        System.out.println("lst4 sau khi xóa giá trị tại vị trí index 2 là: "+lst4);
//        remove(): xóa phần tử chỉ định
        ArrayList<Integer> lst5 = new ArrayList<>(List.of(1,2,3,4,5,6));
        System.out.println("Các phần từ của lst5 là: "+lst5);
        lst5.remove(Integer.valueOf(3));
        System.out.println("lst5 sau khi xóa số 3: "+lst5);
//        set(index,element): thay đổi thông tin
        ArrayList<Integer> lst6 = new ArrayList<>(List.of(1,2,3,4,5,6));
        System.out.println("Các phần tử của lst6 là: "+lst6);
        lst6.set(2, 99);
        System.out.println("lst6 sau khi thay đổi: "+lst6);
    }
}
