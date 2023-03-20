package gestiondestock;

public class Technicien extends Personne{
	public Technicien(int id, String name) {
		super(id, name);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return "Technicien [id=" + id + ", name=" + name + "]";
	}
	
    
}
