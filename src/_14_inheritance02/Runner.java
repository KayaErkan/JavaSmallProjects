package _14_inheritance02;

public class Runner {

	
public static void main(String[] args) {
	My_method ();
}

	private static void My_method() {
		Super obj = new Super();
		obj.goster();
		System.out.println(obj.num);
		Sub obj2 = new Sub();
		obj2.goster();
		System.out.println(obj2.num);
		
		
	}

}
