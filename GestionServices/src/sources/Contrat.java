package sources;

public class Contrat {
	
	private int min; //hour
	private int max; //hour
	
	public Contrat(int min, int max){
		this.min = min;
		this.max = max;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getMax() {
		return max;
	}

	public void setMax(int max) {
		this.max = max;
	}
	
}
