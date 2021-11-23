package _13_taskConstructor;

public class HWStudent {
/*Programý,örnek deðiþkenlerin(instance variables) adý ve adresi olan bir Student sýnýfý 
 * olarak yazýn. Bu deðiþkenleri baþlatacak bir kurucu--> constructor oluþturun. 
 * DisplayInfo meethodu verilen öðrencinin adýný ve adresini yazdýrýn.
 */
	
	String name;
	String address;
	public HWStudent(String name, String address) {
		
		this.name = name;
		this.address = address;
	}
	
	public static void main(String[] args) {
		HWStudent ogrencý = new HWStudent("Erkan", "Yeni Mahalle");
		ogrencý.DisplayInfo();
	}

	private void DisplayInfo() {
		System.out.println(name +"\n" + address);
		
	}
	

	
}
