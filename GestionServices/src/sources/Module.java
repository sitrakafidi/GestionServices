package sources;

public class Module {
	private int volume;
	private TypeEnseignement type;
	
	public Module(int v, TypeEnseignement t){
		volume = v;
		type =t;
	}
	
	public int getVolume() {
		return volume;
	}
	public void setVolume(int volume) {
		this.volume = volume;
	}
	public TypeEnseignement getType() {
		return type;
	}
	public void setType(TypeEnseignement type) {
		this.type = type;
	}
	
	

}
