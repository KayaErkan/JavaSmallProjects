package _08_forLoop;

public class Q16 {

	public static void main(String[] args) {

		/*
        A
        B B
        C C C
        D D D D
        E E E E E
        F F F F F F
        þekli yazdýrýnýz
        */
		
		int harf=65;
		for (int satýr = 0; satýr < 6; satýr++) {
			for (int sütun = 0; sütun <= satýr; sütun++) {
				System.out.print((char)(satýr+harf) + " ");
				
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		

	}

}
