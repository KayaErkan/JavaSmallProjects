package _08_forLoop;

public class Q02 {

	public static void main(String[] args) {
		// 0-255 e kadar olan harflerin , say� ve harf de�erini konsola yazd�r�n�z.

		for (int i = 0; i <= 255; i++) {
			char harf =(char)i;
			System.out.println(i + "-" + harf);
		}
		System.out.println("*********2.yol***********");
		for (char i = 0; i <= 255; i++) {
			char harf = i;
			System.out.println(i + "-" + harf);
		}
		
		// for i�indeki int degeri char al�n�rsasay� harf e�le�mesi olmaz
		// soruda istenen say� ve harf degeri bulunmaz
		
		
	}

}
