package pglp.pglp_41;

import static org.junit.Assert.assertTrue;

import java.util.Date;

import org.junit.Test;


public class test 
    
{
    /**
     * Create the test case
     *
     * @param testName name of the test case
     */
    @Test
	public void afficheTest( )
    {
      Date date =new Date();
      Personnels p4=new Personnels.Builder(4, "BILL"," zemmoura").build();
        Personnels p1=new Personnels.Builder(1," BILL", "zemmoura").build();
        Personnels p5=new Personnels.Builder(5, "BILL", "zemmoura").build();
        CompositePersonnels  p3=new CompositePersonnels (3);
        CompositePersonnels  p2=new CompositePersonnels (2);
       p2.add(p4);
       p2.add(p5);
        
        p3.add(p1);
       p3.add(p2);

       
        
       
       AffichageGroupe a =new AffichageGroupe(p3);
       Iterator i=a.getIterator();
       while(i.hasNext()){
		
    	  i.Next().afficher();  
	}
        
    }

}
