import java.util.Scanner;

public class Slide34{
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
			double a, b, c;
		System.out.print("Nhap a: ");
		a = sc.nextDouble();
		System.out.print("Nhap b: ");
		b = sc.nextDouble();
		System.out.print("Nhap c: ");
		c = sc.nextDouble();
		if (a == 0){
	   		System.out.print("Phuong trinh co nghiem la: " + (-c / b));
		}else {
			double delta = b*b-4*a*c;
	    if (delta < 0){
	     	System.out.print("Phuong trinh vo nghiem");
	    }else if (delta == 0){
			System.out.print("Phuong trinh co mot nghiem duy nhat" + (-b / 2*a));
		}else{
			double x1 = (-b + Math.sqrt(delta)) / 2*a;
			double x2 = (-b - Math.sqrt(delta)) / 2*a;
		System.out.print("Nghiem cua x1 la: " + x1);
		System.out.print("Nghiem cua x2 la: " + x2);
		}
	}
}
}