package _05_switchCase;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		
		// Kullanýcýdan girilen yýlýn bir ay numarasýna göre , ayýn kaç gün olduðunu sayý ile yazdýrýnýz
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Lütfen yýlýn kacinci ayýnda oldugunuzu giriniz : ");
		int ay =scan.nextInt();
		
		switch (ay) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Girdiðiniz ay 31 gün çekiyor");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Girdiðiniz ay 30 gün çekiyor");
			break;
		case 2:
			System.out.println("Yýlýnýzý giriniz");
			int yýl = scan.nextInt();
			
			if(yýl % 4 == 0) {
				System.out.println("Girdiðiniz ay 29 gün çekiyor");
			}else {
				System.out.println("girdiðiniz yýl 28 gün çekiyor");
			}
			break;
		default:
			System.err.println("Hatalý giriþ yaptýnýz ");
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		

	}

}
