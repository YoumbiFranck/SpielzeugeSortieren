import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		 // Liste von Spielzeuge erstellen 
		
        List<Toy> spiele = new ArrayList<>();
        
        spiele.add(new Toy("Jaques von London", 20, "holzspielzeug Tiere", 5));
        spiele.add(new Toy("Walkie Talkies", 15, "für Kinder 3er Pack, 8 Kanäle 2 Wege Radio Kinder Spricht Spielzeug für 3 bis 12 Jungen Mädchen Geschenk", 10));
        spiele.add(new Toy("Domino Spiel", 6, "Familienspiele Holzkiste", 5));
        spiele.add(new Toy("motorikspielzeug", 70, "klopfspiel", 15));
        spiele.add(new Toy("Monsterstarker ", 30, "Gesellschafts- und Familienspiel", 5));
        spiele.add(new Toy("Lotti Karotti", 120, "Brettspiel für Kinder", 20));
        spiele.add(new Toy("Hasbro Looping Louie ", 20, "lustiges 3D Spiel", 0));

        // Liste aller Spiele anzeigen lassen 
        
        for(Toy spiel : spiele) {
            System.out.println("Spiel: " + spiel.getNom() + " ("+ spiel.getPrix() +"€) " +
                    spiel.getDesc() + " (Rabatt: " + spiel.getPromo() + "% rabatt)");
        }

        // Sortieren 
        
        Collections.sort(spiele, new PreisComparator());

        System.out.println("Sortieren....................");

        // Liste erneut anzeigen 
        
        for(Toy spiel : spiele) {
            System.out.println("Spiel: " + spiel.getNom() + " ("+ spiel.getPrix() +"€) " +
                    spiel.getDesc() + " (Rabatt: " + spiel.getPromo() + "% rabatt)");
        }

	}

}
