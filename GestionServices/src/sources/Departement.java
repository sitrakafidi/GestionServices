package sources;

import java.util.ArrayList;

public class Departement {
	
	private String nom;
	private ArrayList<Enseignant> lesProfs;
	private ArrayList<Parcours> lesParcours;
	
	public Departement(String name){
		nom = name;
		lesProfs = new ArrayList<Enseignant>();
		lesParcours = new ArrayList<Parcours>();
	}
	
	
	
	public String getNom() {
		return nom;
	}



	public void setNom(String nom) {
		this.nom = nom;
	}



	public ArrayList<Enseignant> getLesProfs() {
		return lesProfs;
	}



	public void setLesProfs(ArrayList<Enseignant> lesProfs) {
		this.lesProfs = lesProfs;
	}



	public ArrayList<Parcours> getLesParcours() {
		return lesParcours;
	}



	public void setLesParcours(ArrayList<Parcours> lesParcours) {
		this.lesParcours = lesParcours;
	}



	@Override
	public String toString() {
		return "Departement []";
	}

}
