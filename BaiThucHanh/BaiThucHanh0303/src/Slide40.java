import java.util.Scanner;

public class Slide40 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap so ngay trong tuan (1 den 7): ");
        int dayOfWeek = scanner.nextInt();
        String dayName;

        switch (dayOfWeek) {
            case 1:
                dayName = "Chu nhat";
                break;
            case 2:
                dayName = "Thu hai";
                break;
            case 3:
                dayName = "Thu ba";
                break;
            case 4:
                dayName = "Thu tu";
                break;
            case 5:
                dayName = "Thu nam";
                break;
            case 6:
                dayName = "Thu sau";
                break;
            case 7:
                dayName = "Thu bay";
                break;
            default:
                dayName = "So ngay nhap vao khong hop le!";
                break;
        }

        System.out.println("Ngay " + dayOfWeek + " la " + dayName + ".");
    }
}