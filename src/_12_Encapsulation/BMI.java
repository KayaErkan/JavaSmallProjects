package _12_Encapsulation;

public class BMI {
	/*
    1 ) BMI ve MainBMI class'larý creat ediniz
    2 ) BMI class'ý için field'larý name(String), age(int), weight(double) 
        ve height(double) olan veriable'lar oluþturup tüm veriableleri encapsule ediniz.
    3 ) tüm  field'larý setter getter ve  constructor creat ediniz.
    4 ) bmi=weight/(height*height) formulüne göre bmi hesaplayan bir method creat ediniz.
    5 ) bmi 18.5 ten kucukse zayif, 25 ten kucukse normal, 
        30 dan kucukse kilolu, 30 ustu obez durumunu veren method creat ediniz.
    6 ) MainBMI de  bu deðerleri yazdýrýnýz.
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
				System.out.println("BMI Durumu : "+ " \nzayifýsnýz.");
			}else if (bmi >= 18.5 && bmi < 25) {
				System.out.println("BMI Durumu : " + " \nkilonuz idealdir.");
			}else if (bmi >= 25 && bmi < 30) {
				System.out.println("BMI Durumu : " + " \nþiþmansýnýz.");
			}else if (bmi >= 30) {
				System.out.println("BMI Durumu : " + " \nobez.");
			}else {
				System.out.println("Lütfen gecerli degerler giriniz");
			}
		
		return bmi;
	}
	

}
