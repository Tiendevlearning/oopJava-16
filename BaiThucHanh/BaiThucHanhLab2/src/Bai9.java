import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            String chuoi;
            char kyTu;
            System.out.println("Nhap vao chuoi bat ky: ");
            chuoi = sc.nextLine();
                 
            System.out.println("Cac ky tu co trong chuoi la: ");
            for (int i = 0; i < chuoi.length(); i++) {
                kyTu = chuoi.charAt(i);    
                System.out.println(kyTu);
            }
        }
    }
}
