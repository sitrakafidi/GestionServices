package sources;

public class DemandeExterieure extends Demande{
	private String organisation;
	
	public DemandeExterieure(String org,boolean isPublic, float heures){
		super(isPublic,heures);
		organisation = org;
	}
}
