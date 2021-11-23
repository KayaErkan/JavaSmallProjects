package _16_Abstraction;

public class Dikdörtgen extends Sekil{

	public int kk,uk;
	
	
	
	
	public Dikdörtgen(int kk, int uk) {
		super();
		this.kk = kk;
		this.uk = uk;
	}

	@Override
	public int cevre() {
		return 2*(kk+uk);
		
	}

	@Override
	public int alan() {
		return kk*uk;
	}

}
