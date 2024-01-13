import java.util.HashMap;

public class Bai29 {
    public static void main(String[] args) {
//        Khai báo
        HashMap<Integer, String> map = new HashMap<>();
//        Các phương thức
//        put(): thêm các phần tử
        map.put(1, "apple");
        map.put(2, "banana");
        map.put(3, "cherry");
//        get(): lấy giá trị của một phần tử
        String value = map.get(1);
        System.out.println(value);
//        Xóa một phần tử khỏi hashmap
        map.remove(2);
        System.out.println(map.get(2));
//        containsKey(): kiểm tra xem một phần tử có tồn tại trong hashmap hay không?
        boolean check = map.containsKey(3);
        System.out.println(check);
//        containsValue(): kiểm tra xem một giá trị có tồn tại trong hashmap hay không?
        boolean checkVl = map.containsValue("plum");
        System.out.println(checkVl);
//        isEmpty(): kiểm tra xem hashmap có rỗng hay không?
        boolean isEmpty = map.isEmpty();
        System.out.println(isEmpty);
//        size(): lấy số lượng phần tử trong hashmap
        int size = map.size();
        System.out.println(size);
//        duyệt hashmap
        for (Integer key : map.keySet()) {
            String vl = map.get(key);
            System.out.print(vl + " ");
        }
    }
}
