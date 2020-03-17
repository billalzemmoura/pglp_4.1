package pglp.pglp_41;

import java.util.ArrayList;
import java.util.Date;

public final class Personnels implements InterfacePersonnels {
	
	int IdPersonnels;
	String Nom;
	String prenom;
	Date dateDeNaissance;
	ArrayList<Integer>Tel;
	public Personnels(Builder builder) {
		IdPersonnels=builder.IdPersonnels;
		Nom=builder.Nom;
		prenom=builder.prenom;
		dateDeNaissance=builder.dateDeNaissance;
		Tel=builder.Tel;
		
	}
	public void afficher() {
		System.out.println("lidentifiant de personelle:"+IdPersonnels);
		
	}
	public static class Builder{
		

		private final int IdPersonnels;
		private final String Nom;
		private final String prenom;
		Date dateDeNaissance;
		ArrayList<Integer>Tel=new ArrayList<Integer>();
		
		public Builder(int IdPersonnels,String Nom,String prenom ) 
		{
			this.IdPersonnels=IdPersonnels;
			this.Nom=Nom;
			this.prenom=prenom;
			this.dateDeNaissance=dateDeNaissance;
			
		}
		public Builder TEL(Integer tel) 
		{
			this.Tel.add(tel);
			return this;
			
			
		}
	public Personnels build() {
		return new Personnels(this);
	}
	
	
	}
	

}
