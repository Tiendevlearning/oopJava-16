import java.util.Scanner;

public class Slide30{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Nhap n:");
	int n = sc.nextInt();
		int sum = 0;
	while(n > 0){
	    int i = n % 10;
	    sum += i;
	    n /= 10;
   }
	System.out.println("Tong cac cho so trong n la: " + sum);
  }	
}