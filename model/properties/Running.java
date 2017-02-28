package model.properties;

import model.Animal;
import model.SingleProperty;

import java.util.Random;

/**
 * Created by Monko on 28.02.2017.
 */
public class Running extends SingleProperty {
    public Running(){
        Food = 0;
        Protective = true;
    }
    public boolean attackedBy(Animal hunter) {
        Random dice = new Random();
      int  diceNumber = dice.nextInt(6);
        if(diceNumber>=3){
            return false;
            } return true;
    }
}