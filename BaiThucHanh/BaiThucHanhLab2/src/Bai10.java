import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int LanXuatHien = 0;      
            String chuoi;
            char kyTu;
            do{
            System.out.println("Nhap vao chuoi bat ky: ");
            chuoi = sc.nextLine();
            }while(chuoi.length() > 80);
            System.out.println("Nhap cac ky tu can dem: ");
            kyTu = sc.next().charAt(0);
            for (int i = 0; i < chuoi.length(); i++){
                if(kyTu == chuoi.charAt(i))
                    LanXuatHien++;
            }
            System.out.println("So lan xuat hien " + kyTu + " trong chuoi \"" + chuoi + "\" la: " + LanXuatHien + " lan");
        }
    }
}
