public class Bai26_4 {
    public static void main(String[] args) {
        String str = "English = 78 Science = 83 Math = 68 History = 68";
        int sum = 0;
        int count = 0;
        String[] parts = str.split(" ");
//    Duyet qua tung phan tu co trong mang parts
        for (String pt : parts) {
            try {
//                Chuyen doi chuoi sang so nguyen
                int num = Integer.parseInt(pt);
                sum+=num;
                count++;
            } catch (NumberFormatException e) {
//                Khong lam gi ca
            }
        }
        double avg = (double) sum / count;

        System.out.println("Tong cac chu so co trong chuoi la: "+sum);
        System.out.println("So cac chu so co trong chuoi la: "+count);
        System.out.println("Trung binh cong cua cac so la: "+avg);
    }
}
