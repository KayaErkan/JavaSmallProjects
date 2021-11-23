package _15_Encapsulation;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OgrenciMain {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);
		List<String> bilgiler = new ArrayList<>();
		 Ogrenci o1 = new Ogrenci();
		
		for (int i = 0; i < 3; i++) {
			System.out.println("Ýsim giriniz");
			String isim = scan.nextLine();
			
			System.out.println("Lütfen tel no girniz");
			String telefon = scan.nextLine();
			
			System.out.println("Ogrenci no giriniz");
			int numara = scan.nextInt();
			scan.nextLine();
			o1.setIsim(isim);
			o1.setNumara(numara);
			o1.setTelefon(telefon);
			
			 //Ogrenci o2 = new Ogrenci(isim,telefon,numara);
			
			String eklenecek = o1.getIsim() + " " + o1.getNumara() + " " + o1.getTelefon();
			
			bilgiler.add(eklenecek);
			
		}
		System.out.println(bilgiler);
		
		
		
		
		
		 
	}

}
