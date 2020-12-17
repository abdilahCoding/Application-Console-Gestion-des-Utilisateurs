import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class Main {
    
	
	public static void main(String[] args) {
	ArrayList<Utilisateur> user = new ArrayList<Utilisateur>();
	ArrayList<Profile> prf = new ArrayList<Profile>();
	Profile  da = new Profile();
	Profile pf = new Profile(da.getId(),556,"mg");
         prf.add(pf);
	
	 
	 
	
		  Utilisateur w = new Utilisateur("Mnbb", "abdilah", "elaidi", "elaidi", "0868976533", 100.00, "abdilah007", "pass55", "mg");
		  Utilisateur z = new Utilisateur("Mnbb", "mohammed", "elaidi", "elaidi", "0868976533", 100.00, "abdilah007", "pass55", "mg");
		  Utilisateur p = new Utilisateur("Mnbb", "tawfik", "elaidi", "elaidi", "0868976533", 80.00, "abdilah007", "pass55", "dr");
		    user.add(w);
		    user.add(p);
		    user.add(z);

		    List<Profile> result = prf.stream()
		    .filter(e-> e.getLibelle() == "mg" || e.getLibelle() == "dr" )
		     .collect(Collectors.toList());	
		    System.out.println("------------------Salaires----------------------- ");

		   		for (Utilisateur mode : user) {
	   				System.out.println("Salaire "+mode.getSalaire());
                    for (Profile profi : result) {
                    	if ( profi.getLibelle() == "mg") {
    		   				System.out.println("Augmentation de Salaire de " + p.calc(mode.getSalaire(), 8.0 ) + " Dhs");
    					}else if (profi.getLibelle() == "dr") {
    						System.out.println("Augmentation de Salaire de " + p.calc(mode.getSalaire(), 15.0) +" Dhs");
    					}
					}  
		   		} 
                    
                    
        		    List<Utilisateur> listMg = user.stream()
        		    .filter(e-> e.getService() == "mg")
        		     .collect(Collectors.toList());
        		    System.out.println("------------------list manager----------------------- ");
        		     for (Utilisateur list : listMg) {
        		    	  System.out.println(list.getService() +" "+list.getNom());
					}
        		     System.out.println("------------------list utilisateur----------------------- ");
                   String aff = user.toString();
                   System.out.println(aff);
                                   
		   			 
		   		}
		  
		  
		  
	
		  
				
			
			  
			  
		  
		  
		
	

	

}
 