package _06_stringManipulation;

import java.util.Scanner;

public class Q03 {

	public static void main(String[] args) {
	
		// kullanıcıdan alacagınız bir String de bosluk karakterinin olup olmadığını kontrol ediniz
		
		Scanner scanner=new Scanner(System.in);
        System.out.print("lutfen kelime giriniz : ");
        String name1 = scanner.nextLine();
		
		
		
		System.out.println("girdiginiz kelimede boşluk " + name1.contains(" "));
		
		
		
		
		
		
		

	}

}
