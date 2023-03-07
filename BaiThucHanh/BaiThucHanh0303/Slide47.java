import java.util.Scanner;
public class Slide47 {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int num;
        do {
            System.out.print("Nhap so nguyen: ");
            num = scanner.nextInt();
            sum += num;
        } while (sum <= 100);

        System.out.println("Tong cua cac so ma ban da nhap la " + sum );
    }
}