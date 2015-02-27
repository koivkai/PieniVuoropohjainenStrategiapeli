package peli.logic;

/**
 * Luokka kuvaa ihmispelaa. Luokan tärkein funktio on sisältää viite pelaajan
 * armeijaan. gold ja supply viittaavat resursseihin, jotka jäivät
 * aikavaatimusten takia pois pelistä.
 */
public class HumanPlayer extends Player {

    private Army army;
    private int gold;
    private int supply;

    /**
     * HumanPlayerin konstrokturi ei eroa ylä luokan(Player) korstruktorista.
     *
     *
     */
    public HumanPlayer() {
        super();
    }

    /**
     * Metodi on olemassa HumanPlayerin yläluokka Playerissä sen varalta että
     * peliin tehdään AI.
     *
     *
     */
    @Override
    public void pelaaVuoro() {

    }

}
