package _09_while_DoWhile;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
	    // kullan�c�dan al�nan bir stringdeki indexi tek  olan karakterleri yazdiriniz.
        
		Scanner scan = new Scanner(System.in);
        System.out.print("Bir metin giriniz : ");
        String str = scan.nextLine();
        int i = 0;
        
        do {
        	if (i % 2 == 1) {
        		System.out.print(str.charAt(i) + ",");// indexi tek olan chhar yazd�rd�k
        		
        	}
        	i++;
        	
        }while (i < str.length());
        
        
        
        
        
        

	}

}
