package _16_Abstraction;

public class Dikd�rtgen extends Sekil{

	public int kk,uk;
	
	
	
	
	public Dikd�rtgen(int kk, int uk) {
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
