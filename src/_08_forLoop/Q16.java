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
        �ekli yazd�r�n�z
        */
		
		int harf=65;
		for (int sat�r = 0; sat�r < 6; sat�r++) {
			for (int s�tun = 0; s�tun <= sat�r; s�tun++) {
				System.out.print((char)(sat�r+harf) + " ");
				
			}
			System.out.println();
		}
		
		
		
		
		
		
		
		

	}

}
