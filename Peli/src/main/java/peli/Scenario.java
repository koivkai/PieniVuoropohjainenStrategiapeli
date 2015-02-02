/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package peli; 


public interface Scenario { // mahdollistaa erilaisten karttojen teon.
    public void buildMap();
    public void placeBuildings();
    public void placeStartingUnits();
}
