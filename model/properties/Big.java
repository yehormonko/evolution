package model.properties;

import model.Animal;
import model.SingleProperty;

/**
 * Created by Monko on 19.02.2017.
 */
public class Big extends SingleProperty {
  public Big(){

            Food =1;
            Protective=true;
        }
  public boolean attackedBy(Animal hunter) {
      for (SingleProperty property : hunter.getPropertyList()) {
          if (property instanceof Big)
              return true;

          } return false;
  }



}
