import java.util.Scanner;

public class Bai2  {
    public static void main(String[] args) throws Exception {
    try (Scanner sc = new Scanner(System.in)) {
        int a;
        System.out.println("Nhap a:");
        a = sc.nextInt();
        if(a % 2 == 0){
            System.out.println("Day la so chan");
        }else{
            System.out.println("Day la so le");
        }
    }
    }
}