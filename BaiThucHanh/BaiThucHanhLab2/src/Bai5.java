import java.util.Scanner;

public class Bai5 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            float sum = 0, number;      
            do{
                System.out.println("Nhap vao so:");
                number = sc.nextFloat();
                sum += number;
                if (sum > 100)
                    break;
            }while (number > 0);   
            System.out.println("Tong = " + sum);
        }
    }
}
