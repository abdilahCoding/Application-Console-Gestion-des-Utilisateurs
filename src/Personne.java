
public class Personne {
	private String matricule;
	private String nom;
	private String pr�nom;
	private String email;
	private String t�l�phone;
	private Double salaire;
	public Personne(String matricule, String nom, String pr�nom, String email, String t�l�phone, Double salaire) {
		super();
		this.matricule = matricule;
		this.nom = nom;
		this.pr�nom = pr�nom;
		this.email = email;
		this.t�l�phone = t�l�phone;
		this.salaire = salaire;
	}

	public Personne() {
		// TODO Auto-generated constructor stub
	}

	public String getMatricule() {
		return matricule;
	}
	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPr�nom() {
		return pr�nom;
	}
	public void setPr�nom(String pr�nom) {
		this.pr�nom = pr�nom;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getT�l�phone() {
		return t�l�phone;
	}
	public void setT�l�phone(String t�l�phone) {
		this.t�l�phone = t�l�phone;
	}
	public Double getSalaire() {
		return salaire ;
	}
	public void setSalaire(Double salaire) {
		this.salaire = salaire;
	}
	public Double calc(double salaire,double agm) {
		
		return salaire * (agm/100);
	}
	
	 public void afficher() {
		 
		 
	 }

	@Override
	public String toString() {
		return "Personne [matricule=" + matricule + ", nom=" + nom + ", pr�nom=" + pr�nom + ", email=" + email
				+ ", t�l�phone=" + t�l�phone + ", salaire=" + salaire + "]";
	}
	
	
}
