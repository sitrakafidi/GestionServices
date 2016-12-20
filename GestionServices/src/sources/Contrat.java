package sources;

public class Contrat {
	
	private float min; //hour
	private float max; //hour
	
	public Contrat(float min, float max){
		this.min = min;
		this.max = max;
	}

	public float getMin() {
		return min;
	}

	public void setMin(float min) {
		this.min = min;
	}

	public float getMax() {
		return max;
	}

	public void setMax(float max) {
		this.max = max;
	}
	
}
