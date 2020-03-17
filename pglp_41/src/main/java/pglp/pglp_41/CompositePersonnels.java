package pglp.pglp_41;
import java.util.ArrayList;
public class CompositePersonnels implements InterfacePersonnels {


  public ArrayList <InterfacePersonnels> personelles=new ArrayList<InterfacePersonnels>();
 private int  IdGroupe;
 public CompositePersonnels(int IdGroupe ) {
	 this.IdGroupe=IdGroupe;
	 
	 
 }
  public void afficher() {
		System.out.println("lidentifiant du groupe :"+IdGroupe);
		
		
	}
  
  public void add(InterfacePersonnels ajouter ) {
	  personelles.add(ajouter);
	  
	  
  }
  public void remove(InterfacePersonnels ajouter ) {
	  
	  personelles.remove(ajouter);
	  
  }



}
