import java.util.Scanner;

public class Slide74 {
    public static void main(String[] args) throws Exception {
        int n;
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Nhap vao mang: ");
            n = sc.nextInt();
        }while(n < 0);
            int arr[] = new int[n];
        for(int i = 0; i < n; i++){
            System.out.printf("A[%d] = ", i);
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for(int i = 0; i < n - 1; i++){
            if(arr[i] % 2 == 0){
                sum += arr[i];
            }
        }
        System.out.println("\nTong cac so chan cua mang 1 chieu: " + sum);
    }
}