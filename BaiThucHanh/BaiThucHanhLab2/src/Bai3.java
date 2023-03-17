import java.util.Scanner;

public class Bai3 {
    public static void main(String[] args) throws Exception {
        try (Scanner sc = new Scanner(System.in)) {
            String name;
            int year;
            System.out.println("Nhap ten: ");
            name = sc.nextLine();

            System.out.println("Nhap nam sinh: ");
            year = sc.nextInt();
            int age = 2023 - year;
            if(age < 16){
                System.out.println("Ban " + name + " o do tuoi vi thanh nien");
            }else if(age >= 16 && age <= 18){
                System.out.println("Ban " + name + " o do tuoi truong thanh");
            }else{
                System.out.println("Ban " + name + " da gia");
            }
        }
    }
}
