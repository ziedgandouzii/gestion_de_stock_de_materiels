package gestiondestock;

public class Materiel{
      public int referance;
      public String name;
      public int quantite=0;
      public Technicien responsable;
	public Materiel(int referance, String name,int quantite, Technicien responsable) {
		this.referance = referance;
		this.name = name;
		this.quantite=quantite;
		this.responsable = responsable;
	}
	public int getReferance() {
		return referance;
	}
	public void setReferance(int referance) {
		this.referance = referance;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public int getQuantite() {
		return quantite;
	}
	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	public Technicien getResponsable() {
		return responsable;
	}
	public void setResponsable(Technicien responsable) {
		this.responsable = responsable;
	}
	public String toString() {
		return " [referance=" + referance + ", name=" + name + ", quantite=" + quantite + ", responsable="
				+ responsable + "]";
	}
	
	
      
}
