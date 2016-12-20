package sources;

public enum TypeEnseignement {
	CM("Cours magistral"),
	TD("Travaux dirigés"),
	TP("Travaux pratiques");
	
	private String nom = "";
	
	//Constructeur
	private TypeEnseignement(String n){
		nom = n;
	}
	
	public String toString(){
		return nom;
	}
}
