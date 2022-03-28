
public class Toy {
	
	
    private String name; 
    private int preis; 
    private String beschreibung; 
    private int rabatt; 

    
    public Toy(String nom, int prix, String description, int promo) {
        this.name = nom;
        this.preis = prix;
        this.beschreibung = description;
        this.rabatt = promo;
    }

  
    public String getNom() { 
    	return name; 
    	}

    public int getPrix() {
    	return preis;
    	}

    public String getDesc() { 
    	return beschreibung; 
    	}

    public int getPromo() { 
    	return rabatt; 
    	}

    
    public int compareTo(Toy jouet2) {
        return this.getNom().compareTo(jouet2.getNom());

}
}
