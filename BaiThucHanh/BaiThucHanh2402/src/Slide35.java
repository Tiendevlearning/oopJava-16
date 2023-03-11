import java.util.Scanner;

public class Slide35{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhap a va b: ");
			int a = sc.nextInt();
			int b = sc.nextInt();
		System.out.print("So no nhat trong hai so la: " + Math.min(a, b));
  }
}