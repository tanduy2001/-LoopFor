package basic.dev;
/**
 * Lab12
 * @author Admin
 *
 */
import java.util.Scanner;
public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sum100 = 0 ;
		
		for(int i = 1 ; i <= 100; i++) {
			sum100 += i ;
		}
		
		System.out.println("Tong 100 so dau la: " + sum100);
		int sum3 =0;
		System.out.println("Nhap vao so n = ");
		int n = sc.nextInt();
		
		for(int i = 0 ; i <= n ; i++) {
			if(i%3 == 0) {
				sum3 +=i;
			}
		}
		
		System.out.println("Tong cac so chia het cho 3 nho hon n la: " + sum3);
		long number1 =0 ;
		long number2 =1 ;
		System.out.println("100 so Fibonaci dau tien la:");
		for(int i = 1; i<=100; i++) {
			System.out.printf("%d\t ",number1);
			long sumNumber1Number2 = number1 + number2;
			number1 = number2;
			number2 = sumNumber1Number2;
		}
				int m,rv,temp,mod;		
				Scanner Scan = new Scanner(System.in);
				System.out.printf("\nNhap vao so m = "); m = Scan.nextInt();	
				temp = m; rv = 0;	
			    while (m > 0) {
			    	   mod = m % 10;
			    	   m = m / 10;
			    	   rv= rv * 10 + mod;
			    }
			    if (rv==temp) {
			    	System.out.printf("So %d la so Polinom",temp); 
			    } else {
			                  System.out.printf("So %d kp la so Polinom",temp);
			      }
				int tempMod = 0;
				int tempDiv = 0;
				int sum  = 0;
				System.out.println("\nCac so tu 100 - 999 co tong cac chu so chia het cho 3 la:");
				for(int i = 100; i < 1000 ; i++) {
					tempDiv = i;
					sum = 0;
					
					while(tempDiv > 0 ) {	
					    tempMod = tempDiv%10;
					    tempDiv = tempDiv/10;
					    sum +=tempMod;
					}
					if(sum%3 == 0) {
						System.out.printf(String.format("%d\t",i));
					}
					
				}
	}

}
