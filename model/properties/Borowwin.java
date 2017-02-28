package model.properties;

import model.Animal;
import model.SingleProperty;

/**
 * Created by Monko on 27.02.2017.
 */
public class Borowwin extends SingleProperty {
    public Borowwin(){
        Food = 0;
        Protective = true;
    }

    public boolean attackedBy(Animal hunter) {
        if (owner.getFood()>owner.getNeedFood()){
            return false;
        }else return true;
    }
}
