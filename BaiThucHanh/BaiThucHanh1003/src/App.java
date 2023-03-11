import java.util.Scanner;

public class App{
    public static void main(String[] args) throws Exception {
        int n;
        Scanner sc = new Scanner(System.in);
            do{
                System.out.println("Nhap vao mang: ");
                n = sc.nextInt();
            }while(n <= 0);
            int arr[] = new int[n];
            for(int i = 0; i < n; i++){
                System.out.printf("A[%d] = ", i);
                arr[i] = sc.nextInt();
            }

            System.out.println("Danh sach cac phan tu da duoc in ra: ");
            for (int i = 0; i < n; i++){
                System.out.printf("\t" + arr[i]);
            }

            for(int i = 0; i < arr.length - 1; i++) {     
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        int c;
                        c = arr[i];
                        arr[i] = arr[j];
                        arr[j] = c;
                    }
                }
            }
            System.out.println("\nDamh sach mang da duoc sap xep:");
                for(int i = 0; i < arr.length; i++) {
                    System.out.printf("\t" + arr[i]);
            }
        }
    }