package _06_stringManipulation;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		
		/* StringMethods
        String girildiginde ilk iki karakteri haric string return eden java programi yaziniz
        Ancak ilk karakter 'g' ve ikinci karakteri 'h' ise bu karakterler de return edilsin
       ORNEK:
        INPUT      :  goat
                      photo
                      ghost
                      kalem
        OUTPUT :      gat
                      hoto
                      ghost
                      lem
      */
		
		Scanner scanner=new Scanner(System.in);
        System.out.print("lutfen bir kelime giriniz : ");
        String kelime = scanner.nextLine();
		
        if (kelime.startsWith("gh")) {
        	System.out.println("kelime");
        }else if (kelime.startsWith("g")) {
        	// System.out.println(kelime.replace("o",""));
        	System.out.println(kelime.charAt(0) + kelime.substring(2) );
        }else if (kelime.charAt(1) == 'h') {
        	   System.out.println(kelime.substring(1));
               
        }
        else {
            System.out.println(kelime.substring(2));
        }{
            
        }{
            
        }
        }
        
		
		
		
		
		

	}


