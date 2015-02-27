package peli.logic;

import java.util.ArrayList;

/**
 * Luokka sisätää arraylistin rakennuksia, luokkaa käytetään kaikkien kentällä
 * olevien rakennusten listaukseen.
 */
public class BuildingList {

    private ArrayList<Building> buildings;

    /**
     * BuildingList konstructori, luo uuden building listin eli käytännössä
     * uuden arrayListin.
     *
     *
     */
    public BuildingList() {
        this.buildings = new ArrayList<>();
    }

    public void addBuilding(Building building) {
        this.buildings.add(building);
    }

    public ArrayList<Building> getBuildings() {
        return buildings;
    }

}
