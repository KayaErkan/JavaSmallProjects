package _09_while_DoWhile;

import java.util.Scanner;

public class Q15 {

	public static void main(String[] args) {
	
 //  belirli bir(kullanýcý girecek)  yükseklikten bir top serbest dusme ile býrakilýmaktadir.
 //  top serbest býrakýldýktan  sonra sürekli birakildigi yüksekliðin 
 //  ¾ 75 'Ý kadar zeminden yukarý doðru zýplamaktadýr
 //  Top zýplama  yüksekliði 1 metrenin altýna indiðinde olay sonlandirilmaktadir.
 //  Bu ana kadar topun toplam aldýðý yolu ve topun zemine  vurma sayýsýný bulunuz.
	   
	    Scanner scan = new Scanner(System.in);
	    System.out.print("topun birakilacagi yuksekligi giriniz : ");
	    
	 double birakilanYukseklik = scan.nextDouble();
	 double toplamYol = birakilanYukseklik;
	 int vurmaSayisi = 0;
	 
	 while (birakilanYukseklik >= 1) {
		birakilanYukseklik *= 0.75;
		toplamYol +=  birakilanYukseklik * 2;
		vurmaSayisi++;
	}
	 System.out.println("Topun zemine vurma sayýsý : " + vurmaSayisi);
	 System.out.println("Topun toplam aldýgý yol : " + toplamYol);
	    
	    
	    
	    
	}

}
