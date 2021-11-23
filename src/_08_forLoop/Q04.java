package _08_forLoop;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		/*
         * Kullanicidan 5 adet sayi isteyiniz
         * Bu sayilardan 5 ile 10 arasindakiler haric, digerlerinin toplamini bulunuz.
         * bu soruyu continue kullanarak cozunuz.
         * continue komutu bulundugu  kod blogununda mevcut islemi atlar. 
         */
        Scanner scan = new Scanner(System.in);
        int top =0;
        for (int i = 1; i <=5; i++) {
            System.out.println("bir sayi giriniz : ");
            int sayi=scan.nextInt();
            if(sayi > 5 && sayi < 10) {
            	System.out.println("girdiginiz sayý 5 ile 10 arasý oldugundan isleme girmedi");
            	continue;
            }
            top += sayi;
        }
        System.out.println("girdiginz sayýlarr toplamý : " + top);
	}

}
