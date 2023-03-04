import java.util.Scanner;

public class Slide40 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số ngày trong tuần (1 đến 7): ");
        int dayOfWeek = scanner.nextInt();
        String dayName;

        switch (dayOfWeek) {
            case 1:
                dayName = "Chủ Nhật";
                break;
            case 2:
                dayName = "Thứ Hai";
                break;
            case 3:
                dayName = "Thứ Ba";
                break;
            case 4:
                dayName = "Thứ Tư";
                break;
            case 5:
                dayName = "Thứ Năm";
                break;
            case 6:
                dayName = "Thứ Sáu";
                break;
            case 7:
                dayName = "Thứ Bảy";
                break;
            default:
                dayName = "Số ngày không hợp lệ!";
                break;
        }

        System.out.println("Ngày " + dayOfWeek + " là " + dayName + ".");
    }