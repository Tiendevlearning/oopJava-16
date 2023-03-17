import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)){
            int a, temp = 1;
            long giaiThua = 1;
        do{
            System.out.println("Nhap a: ");
            a = sc.nextInt();
        }while((a <= 0) || (a > 10));
            if(a >= temp){
                giaiThua *= temp;
                temp++;
            }
            System.out.println(a + "! = " + giaiThua);
        }
    }
}
