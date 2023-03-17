import java.text.DecimalFormat;
import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
       try (Scanner sc = new Scanner(System.in)) {
        int n, number;
           int sum = 0;
           float b;
           System.out.println("Nhap day so n: ");
           n = sc.nextInt();

           // lam tron 2 chu so thap phan.
           DecimalFormat dF = new DecimalFormat("#.##");
           
           for(int i = 1; i <= n; i++){
            System.out.println("Nhap so thu " + i + ": ");
            number = sc.nextInt();
            sum += number;
           }
           b = (float) sum / n;
           System.out.println("Trung binh cong " + dF.format(b));
    }
    }
}
