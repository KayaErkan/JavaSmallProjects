package _09_while_DoWhile;

import java.util.Scanner;

public class Q09 {

	public static void main(String[] args) {
		 /*
        Girilen pozitif bir say�n�n tam kare olup olmad���n� bulunuz,
        tamkare ise true  de�ilse false yazd�r�n�z.
         Not: sqrt gibi fonksiyonlar�  kullanmay�n.
         Example 1:
         Input: 16
         Output: true
         Not: bu say� tamkare ��nk� 4*4 = 16
         Example 2:
         Input: 25
         Output: true
         Note: bu say� tamkare ��nk� 5*5=25
         Example 3:
         Input: 14
         Output: false
      */

     Scanner scan = new Scanner(System.in);
     System.out.print("bir say� giriniz : ");
     int sayi = scan.nextInt();
     
     int count = 1;
     boolean b = false;
     while (count*count <= sayi) {
    	 if (count*count == sayi) {
    		 b=true;
    		 System.out.println(b);
    	 }
    	 count++;
	}if (b == false) {
		System.out.println("false");
	}
     
     
     
     
     
     
     
     
     
     
     

	}

}
