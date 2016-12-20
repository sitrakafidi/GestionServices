package sources;

public abstract class Demande {
	protected boolean isPublic ;
	protected float heures ;
	
	public Demande(boolean isPublic, float heures){
		this.heures = heures;
		this.isPublic = isPublic;
		
		
	}

	public boolean isPublic() {
		return isPublic;
	}

	public void setPublic(boolean isPublic) {
		this.isPublic = isPublic;
	}

	public float getHeures() {
		return heures;
	}

	public void setHeures(float heures) {
		this.heures = heures;
	}
	
	
}
