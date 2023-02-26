package collections;

import java.util.Iterator;

public class FiboIterator implements Iterator<Integer>{

    /**
     * La borne maximale.
     */
    private int borne;
    private int actuel;
    private int suivant;
    private int compteur;

    /**
     * Constructeur jusqu'à une borne max.
     * @param borne
     */
    public FiboIterator(int borne) {
        this.borne = borne;
        actuel = 0;
        suivant = 1;
        compteur = 0;
    }

    @Override
    public boolean hasNext() {
        return compteur < borne;
    }

    @Override
    public Integer next() {
        int resultat = actuel + suivant;
        actuel = suivant;
        suivant = resultat;
        compteur++;
        return actuel;
    }

}