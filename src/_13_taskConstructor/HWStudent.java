package _13_taskConstructor;

public class HWStudent {
/*Program�,�rnek de�i�kenlerin(instance variables) ad� ve adresi olan bir Student s�n�f� 
 * olarak yaz�n. Bu de�i�kenleri ba�latacak bir kurucu--> constructor olu�turun. 
 * DisplayInfo meethodu verilen ��rencinin ad�n� ve adresini yazd�r�n.
 */
	
	String name;
	String address;
	public HWStudent(String name, String address) {
		
		this.name = name;
		this.address = address;
	}
	
	public static void main(String[] args) {
		HWStudent ogrenc� = new HWStudent("Erkan", "Yeni Mahalle");
		ogrenc�.DisplayInfo();
	}

	private void DisplayInfo() {
		System.out.println(name +"\n" + address);
		
	}
	

	
}
