package model.properties;

import model.Animal;
import model.SingleProperty;
/**
 * Created by Monko on 27.02.2017.
 */
public class Camouflage extends SingleProperty {
    public Camouflage(){
        Food =0;
        Protective = true;
    }
    public boolean attackedBy(Animal hunter) {
        for(SingleProperty property: hunter.getPropertyList()){
            if (property instanceof Sharp){
                return true;
            }
        }return false;

    }

}
