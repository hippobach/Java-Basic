import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Bai22 {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
//        thang chi chay tu 0->11
//        get method
        int nam = cal.get(Calendar.YEAR);
        int thang = cal.get(Calendar.MONTH);
        int ngay = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(nam);
        System.out.println(thang+1);
        System.out.println(ngay);
//        set method
        cal.set(Calendar.YEAR, 1987);
        cal.set(Calendar.MONTH, 11);
        cal.set(Calendar.DAY_OF_MONTH, 24);
        int namSinh = cal.get(Calendar.YEAR);
        int thangSinh = cal.get(Calendar.MONTH);
        int ngaySinh = cal.get(Calendar.DAY_OF_MONTH);
        System.out.println(namSinh);
        System.out.println(thangSinh);
        System.out.println(ngaySinh);
//        xuat theo dinh dang ngay thang nam
        SimpleDateFormat dinhDang = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
//        tao mot doi tuong date de get time trong doi tuong cal
        Date d = cal.getTime();
        String s = dinhDang.format(d);
        System.out.println(s);
    }
}
