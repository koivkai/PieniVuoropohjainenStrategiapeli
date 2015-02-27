package peli.logic;

/**
 * Luokka ei ole käytössä. Sitä olisi tarkoitus käyttää sitten kun rakennuksista
 * voi rakentaa monenlaisia yksiköitä, ja peliin on lisätty resurssit
 */
public class Buildable { // tämä luokka ei ole käytössä.

    private Unit unit;
    private int cost;

    /**
     * Builable konsturctori, luokka ei ole tällä hetkellä käytyssä.
     *
     *
     * @param unit
     * @param cost
     */
    public Buildable(Unit unit, int cost) {
        this.unit = unit;
        this.cost = cost;
    }

}
