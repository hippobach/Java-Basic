import java.util.Calendar;
import java.util.Scanner;

public class Bai22_1 {
    public static void main(String[] args) {
        int day, month, year, tuoi;
//        nhap lieu tu ban phim
        Scanner input = new Scanner(System.in);
        System.out.println("Moi nhap vao ngay sinh:");
        day = input.nextInt();
        System.out.println("Moi nhap vao thang sinh:");
        month = input.nextInt();
        System.out.println("Moi nhap vao nam sinh:");
        year = input.nextInt();

        Calendar birthday = Calendar.getInstance();
//        set ngay thang nam sinh do nguoi dung nhap vao
        birthday.set(year, month-1,day);
//        xuat ngay thang nam sinh
        int namSinh = birthday.get(Calendar.YEAR);
        int thangSinh = birthday.get(Calendar.MONTH);
        int ngaySinh = birthday.get(Calendar.DAY_OF_MONTH);

        System.out.println("Ngay thang nam sinh: "+ ngaySinh + "/" + (thangSinh+1) + "/" + namSinh);

//        tinh tuoi
//        lay nam hien tai
        Calendar now = Calendar.getInstance();
        int namHienTai = now.get(Calendar.YEAR);
        tuoi = namHienTai - namSinh;
        System.out.println("Tuoi cua ban la: "+tuoi);
    }
}
