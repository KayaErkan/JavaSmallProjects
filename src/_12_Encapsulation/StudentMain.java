package _12_Encapsulation;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		/* 
	    Burada iki adet class vard�r. Biri Main, di�eri ise student ,
	    student class� i�inde;
	    String name(isim) ve int age(ya�) isminde variables(de�i�kenler) olu�turunuz.
	    getter ve setter ( al�c� ve ayarlay�c� ) olu�turunuz.
	    Main class�n i�inde;
	    �rnek:
	    age 12'dir.
	    name Steven'd�r.
	    name(isim) olarak;
	    "Student name is Steven"
	    ve
	    age(ya�) olarak da;
	    "He is 12 years old"
	 */

		Scanner scan = new Scanner (System.in);
		System.out.println("Ad�n�z� giriniz:");
		String name = scan.nextLine();
		System.out.println("yas�n�z� giriniz:");
		int age = scan.nextInt();
		
		// 	bu sat�r�n yukar�s�n� de�i�tirmeyin
		
		Student student1 = new Student();
		student1.setName(name);
		student1.setAge(age);
		System.out.println("ogrenci ad� :" + student1.getName() +"\nogrenci yas�:" + student1.getAge());
		
		
	}

}
