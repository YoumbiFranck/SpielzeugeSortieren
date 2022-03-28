import java.util.Comparator;

public class PreisComparator implements Comparator<Toy> {

    @Override
    public int compare(Toy spielzeug1, Toy spielzeug2) {

        // Preisvergleich
        if(spielzeug1.getPrix() == spielzeug2.getPrix())
        {
            return spielzeug1.compareTo(spielzeug2); // NameVergleich
        }

        return spielzeug2.getPrix() - spielzeug1.getPrix(); // absteigend nach dem Preis sortiert
    } 
    //falls der preis gleich ist dann wird's nach dem namen sortiert werden.
}
