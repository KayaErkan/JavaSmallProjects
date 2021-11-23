package _10_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		// kullanicin girdigi sayi kadar int array olusturan ve array elemanlarini
		// kullanicidan alan
		// ve girilen array elemanlarinin en buyuk ile en kucuk elemaninin arasinki
		// farki gosteren
		// java programi yazin

		Scanner scan = new Scanner(System.in);
		System.out.print("Kac elemanli bir array olusturmak istiyorsunuz? ");
		int boyut = scan.nextInt();// 4

		int arr[] = new int[boyut];
		for (int i = 0; i < arr.length; i++) {
			System.out.print("Arrayinizin " + i + ".index elemanýný giriniz : ");
			arr[i] = scan.nextInt();

		}
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));// [1, 3, 5, 78]

		System.out.println("arrayinizin max min eleman farki :" + ((arr[arr.length - 1] - arr[0])));
	}

}
