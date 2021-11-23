package _12_Encapsulation;

import java.util.Scanner;

public class StudentMain {

	public static void main(String[] args) {
		/* 
	    Burada iki adet class vardýr. Biri Main, diðeri ise student ,
	    student classý içinde;
	    String name(isim) ve int age(yaþ) isminde variables(deðiþkenler) oluþturunuz.
	    getter ve setter ( alýcý ve ayarlayýcý ) oluþturunuz.
	    Main classýn içinde;
	    Örnek:
	    age 12'dir.
	    name Steven'dýr.
	    name(isim) olarak;
	    "Student name is Steven"
	    ve
	    age(yaþ) olarak da;
	    "He is 12 years old"
	 */

		Scanner scan = new Scanner (System.in);
		System.out.println("Adýnýzý giriniz:");
		String name = scan.nextLine();
		System.out.println("yasýnýzý giriniz:");
		int age = scan.nextInt();
		
		// 	bu satýrýn yukarýsýný deðiþtirmeyin
		
		Student student1 = new Student();
		student1.setName(name);
		student1.setAge(age);
		System.out.println("ogrenci adý :" + student1.getName() +"\nogrenci yasý:" + student1.getAge());
		
		
	}

}
