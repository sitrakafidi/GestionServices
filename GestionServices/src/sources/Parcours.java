package sources;

import java.util.ArrayList;

public class Parcours {
	
	private String nom;
	private ArrayList<Module> modules;
	
	public Parcours(String name, Module mod){
		nom = name; 
		modules = new ArrayList<Module>();
		modules.add(mod);

	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

}
