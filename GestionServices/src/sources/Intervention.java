package sources;

public abstract class Intervention {
	protected String volume;
	private Service service;
	
	public Intervention(String volume) {
		this.volume = volume;
	}
	
	public String getVolume() {
		return this.volume;
	}
	
	public void setService(Service service) {
		this.service = service;
	}
	
	public Service getService () {
		return this.service;
	}
}
