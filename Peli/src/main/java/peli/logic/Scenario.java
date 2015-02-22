/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package peli.logic; 


public abstract class Scenario { // mahdollistaa erilaisten karttojen teon.
    
    private Map map;
    
    public abstract void setUpScenario();
    
    
    public Map getMap() {
        return map;
    } 
    
}
