package _06_stringManipulation;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
	
		// kullan�c�dan alacag�n�z bir String de bosluk karakterinin olup olmad���n� kontrol ediniz
		
		Scanner scanner=new Scanner(System.in);
        System.out.print("lutfen kelime giriniz : ");
        String name1 = scanner.nextLine();
		
		
		
		System.out.println("girdiginiz kelimede bo�luk " + name1.contains(" "));
		
		
		
		
		
		
		

	}

}
