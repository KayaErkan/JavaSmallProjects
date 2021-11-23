package _12_Encapsulation;

public class BMI {
	/*
    1 ) BMI ve MainBMI class'lar� creat ediniz
    2 ) BMI class'� i�in field'lar� name(String), age(int), weight(double) 
        ve height(double) olan veriable'lar olu�turup t�m veriableleri encapsule ediniz.
    3 ) t�m  field'lar� setter getter ve  constructor creat ediniz.
    4 ) bmi=weight/(height*height) formul�ne g�re bmi hesaplayan bir method creat ediniz.
    5 ) bmi 18.5 ten kucukse zayif, 25 ten kucukse normal, 
        30 dan kucukse kilolu, 30 ustu obez durumunu veren method creat ediniz.
    6 ) MainBMI de  bu de�erleri yazd�r�n�z.
      */
	
	private String name;
	private int age ;
	private double weight;
	private double height;
	
	
public BMI(String name, int age, double weight, double height) {
		
		this.name = name;
		this.age = age;
		this.weight = weight;
		this.height = height/=100;
		
	}
	
	public synchronized String getName() {
		return name;
	}
	public synchronized void setName(String name) {
		this.name = name;
	}
	public synchronized int getAge() {
		return age;
	}
	public synchronized void setAge(int age) {
		this.age = age;
	}
	public synchronized double getWeight() {
		return weight;
	}
	public synchronized void setWeight(double weight) {
		this.weight = weight;
	}
	public synchronized double getHeight() {
		return height;
	}
	public synchronized void setHeight(double height) {
		
		this.height = height;
	}
	
	public double bmiHesapla() {
		double bmi=weight/(height*height);
		 if(bmi == 0 && bmi < 18.5) {
				System.out.println("BMI Durumu : "+ " \nzayif�sn�z.");
			}else if (bmi >= 18.5 && bmi < 25) {
				System.out.println("BMI Durumu : " + " \nkilonuz idealdir.");
			}else if (bmi >= 25 && bmi < 30) {
				System.out.println("BMI Durumu : " + " \n�i�mans�n�z.");
			}else if (bmi >= 30) {
				System.out.println("BMI Durumu : " + " \nobez.");
			}else {
				System.out.println("L�tfen gecerli degerler giriniz");
			}
		
		return bmi;
	}
	

}
