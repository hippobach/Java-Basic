import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Bai28_1 {
    public static void main(String[] args) {
        ArrayList<Integer> lst7 = new ArrayList<>(List.of(1,2,3,4,5,6));
//        contains(): kiểm tra Collections có chứa phần tử nào đó hay không
        boolean ktra = lst7.contains(10);
        System.out.println(ktra);
//        sort(): sắp xếp tăng dần
        ArrayList<Integer> lst9 = new ArrayList<>(List.of(9,1,4,2,14,3,10, 5));
        Collections.sort(lst9);
        System.out.println("lst9 sau khi sắp xếp tăng dần: "+lst9);
//        indexOf(): tìm vị trí đầu tiên của element trong list, nếu không tồn tại trả về -1
        ArrayList<Integer> lst8 = new ArrayList<>(List.of(9,1,4,2,14,3,10, 5));
        System.out.println(lst8.indexOf(4));
//        duyệt list
//        Cách 1:
        ArrayList<Integer> lst10 = new ArrayList<>(List.of(9,1,4,2,14,3,10, 5));
        System.out.println("lst10 dùng duyệt for");
        for (int vl : lst10) {
            System.out.print(vl+ " ");
        }
        System.out.println();
//        Cách 2:
        ArrayList<Integer> lst11 = new ArrayList<>(List.of(9,1,4,2,14,3,10, 5));
        int size = lst11.size();
        for (int i=0; i<size; i++) {
            int vl = lst11.get(i);
            System.out.print(vl + " ");
        }
    }
}
