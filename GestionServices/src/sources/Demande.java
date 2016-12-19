package sources;

public abstract class Demande {
	protected boolean isPublic ;
	protected int heures ;
	
	public Demande(boolean isPublic, int heures){
		this.heures = heures;
		this.isPublic = isPublic;
		
		
	}

	public boolean isPublic() {
		return isPublic;
	}

	public void setPublic(boolean isPublic) {
		this.isPublic = isPublic;
	}

	public int getHeures() {
		return heures;
	}

	public void setHeures(int heures) {
		this.heures = heures;
	}
	
	
}
