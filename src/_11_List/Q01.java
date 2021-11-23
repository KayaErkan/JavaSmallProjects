package _11_List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Q01 {

	public static void main(String[] args) {

		/*
		 * Input olarak verilen listteki isimlerden icinde ‘a’ harfi bulunanlari silen
		 * bir program yaziniz
		 *
		 * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"} OUTPUT : [Veli,Omer]
		 */

		List<String> list = new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));
		
		List<String> yeniList = new ArrayList<>();
		
		for (String each : list) {
			if (each.toLowerCase().contains("a")) {
				continue;	
			}else {
				yeniList.add(each);
			}
		}
		System.out.println(yeniList);
		
		
		
		
		
		
		

	}

}
