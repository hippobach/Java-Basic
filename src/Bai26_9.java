public class Bai26_9 {
    public static void main(String[] args) {
        String path = "D:/XUANBACH/Music/remix.mp3";
        int lastSlashIndex = path.lastIndexOf('/');
        String fileName = path.substring(lastSlashIndex+1);
        System.out.println(fileName);
        int lastDotIndex = fileName.lastIndexOf(".");
        String name = fileName.substring(0, lastDotIndex);
        System.out.println(name);
    }
}
