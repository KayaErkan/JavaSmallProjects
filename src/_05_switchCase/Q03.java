package _05_switchCase;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
		
		// Kullan�c�dan girilen y�l�n bir ay numaras�na g�re , ay�n ka� g�n oldu�unu say� ile yazd�r�n�z
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("L�tfen y�l�n kacinci ay�nda oldugunuzu giriniz : ");
		int ay =scan.nextInt();
		
		switch (ay) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("Girdi�iniz ay 31 g�n �ekiyor");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("Girdi�iniz ay 30 g�n �ekiyor");
			break;
		case 2:
			System.out.println("Y�l�n�z� giriniz");
			int y�l = scan.nextInt();
			
			if(y�l % 4 == 0) {
				System.out.println("Girdi�iniz ay 29 g�n �ekiyor");
			}else {
				System.out.println("girdi�iniz y�l 28 g�n �ekiyor");
			}
			break;
		default:
			System.err.println("Hatal� giri� yapt�n�z ");
			
			
			
			
			
			
			
			
			
			
		}
		
		
		
		
		
		
		

	}

}
