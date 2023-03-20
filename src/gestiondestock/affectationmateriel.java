package gestiondestock;
import java.util.ArrayList;
public class affectationmateriel{
	public int seance;
	public Materiel M_affecté;
	public String Enseignant;
	public affectationmateriel(int seance, Materiel m_affecté, String enseignant) {
		this.seance=seance;
		M_affecté = m_affecté;
		Enseignant = enseignant;
		m_affecté.quantite-=1;
	}
	public int getSeance() {
		return seance;
	}
	public void setSeance(int seance) {
		this.seance = seance;
	}
	public Materiel getM_affecté() {
		return M_affecté;
	}
	public void setM_affecté(Materiel m_affecté) {
		M_affecté = m_affecté;
	}
	public String getEnseignant() {
		return Enseignant;
	}
	public void setEnseignant(String enseignant) {
		Enseignant = enseignant;
	}
	public String toString() {
		return " [seance=" + seance + ", M_affecté=" + M_affecté + ", Enseignant=" + Enseignant
				+ "]";
	}
	
	
   
}
