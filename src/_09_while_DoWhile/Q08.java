package _09_while_DoWhile;

import java.util.Scanner;

public class Q08 {

	public static void main(String[] args) {
		 
		// INTEGER OLAN PIN kodunuzu kontrol eden bir kod yaz�n�z.
       
		Scanner scan = new Scanner(System.in);
        System.out.print("PIN kodunuzu giriniz : ");
        int userPin = scan.nextInt();
        int pinCode = 1453;
        
        while (pinCode != userPin) {
			System.out.println("Ba�ar�s�z pin giri�i! tekrar deneyin");
			userPin = scan.nextInt();
		}
        System.out.println("Gayet ba�ar�l� bir giri� pin onayland� ");
        
        
        
        
        

	}

}
