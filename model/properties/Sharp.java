package model.properties;

import model.Animal;
import model.SingleProperty;

/**
 * Created by Monko on 27.02.2017.
 */
public class Sharp extends SingleProperty {
    public Sharp(){
        Food =0;
        Protective = false;
    }

    public boolean attackedBy(Animal hunter){
        return true;
    }
}
