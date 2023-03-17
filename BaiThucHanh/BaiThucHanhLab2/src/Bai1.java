import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            float a, b;
            System.out.println("Nhap 2 so a va b: ");
            a = sc.nextFloat();
            b = sc.nextFloat();
            System.out.println("Tong a + b = "+ (a + b));
            System.out.println("Hieu a - b = " + (a - b));
            System.out.println("Thuong a / b = " + (a / b));
            System.out.println("Chia lay du a % b = "+ (a % b));

            System.out.println("So sanh 2 so a va b:");
            System.out.println("A > B "+ (a > b));
            System.out.println("A < B "+ (a < b));
            System.out.println("A = B "+ (a == b));
        }
    }
}
