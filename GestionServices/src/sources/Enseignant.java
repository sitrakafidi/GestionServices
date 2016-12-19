package sources;

import java.util.ArrayList;

public class Enseignant {

	private String nom;
	private String prenom;
	private String statut;
	private Contrat contrat;
	private ArrayList<Demande> demandes;
	private ArrayList<Service> services;
	
	
	public Enseignant(String name,String pre,String sta, Contrat cont){
		nom = name;
		prenom = pre;
		statut = sta;
		contrat = cont;
		demandes = new ArrayList<Demande>();
		services = new ArrayList<Service>();
	}

	public Contrat getContrat() {
		return contrat;
	}

	public void setContrat(Contrat contrat) {
		this.contrat = contrat;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public String getStatut() {
		return statut;
	}

	public void setStatut(String statut) {
		this.statut = statut;
	}
}
