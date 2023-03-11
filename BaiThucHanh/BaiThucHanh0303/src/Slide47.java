import java.util.Scanner;
public class Slide47
{
	public static void main(String[] args) {		
	int i, sum = 0;
    Scanner sc = new Scanner(System.in);      
    do {
    System.out.print("Nhap so: ");
        i = sc.nextInt();
        sum += i;      
        if (sum> 100)
            break;
    }while (i > 0);      
    System.out.println("Tong cac so vua nhap la: " + sum);
	}
}