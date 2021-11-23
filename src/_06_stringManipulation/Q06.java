package _06_stringManipulation;

import java.util.Scanner;

public class Q06 {

	public static void main(String[] args) {
		/*
         * Kullanicidan bir isim isteyiniz ve isim sadece 3 harfli olmalidir ternary
         * kullanarak harflerin unique(farkli) olup olmadigina bakiniz.
         * 
         * input : ali 
         * output: girdi�iniz kelime 3 harfli ve unique karaktere sahip
         * 
         * input : ece
         * output: girdi�iniz kelime 3 harfli ve unique karaktere sahip de�il
         */

		Scanner scan = new Scanner (System.in);
		System.out.println("3 harfli bir isim giriniz");
		String name =scan.nextLine();
		
		char c1 = name.charAt(0);
		char c2 = name.charAt(1);
		char c3 = name.charAt(2);
		
		String result = name.length() == 3 ? ((c1 != c2 && c1 != c3 && c2 != c3)?("girdi�iniz isim unique karakterlerden olu�uyor"):"girdi�iniz kelime 3 harfli ve unique karaktere sahip de�il"):("3 karakterden fazla isim girdiniz");
		System.out.println(result);
		
		
	}

}
